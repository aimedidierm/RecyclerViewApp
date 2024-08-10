package com.example.recyclerviewapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.adapters.ItemAdapter
import com.example.recyclerviewapp.models.Item
import com.example.recyclerviewapp.network.ApiService
import kotlinx.android.synthetic.main.activity_list_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        fetchItems()
    }

    private fun fetchItems() {
        val apiService = ApiService.create()
        apiService.getItems().enqueue(object : Callback<List<Item>> {
            override fun onResponse(call: Call<List<Item>>, response: Response<List<Item>>) {
                if (response.isSuccessful) {
                    val items = response.body() ?: emptyList()
                    val adapter = ItemAdapter(items)
                    recyclerView.adapter = adapter

                    adapter.setOnItemClickListener { item ->
                        val intent = Intent(this@ListViewActivity, DetailsViewActivity::class.java)
                        intent.putExtra("itemData", item.data)
                        startActivity(intent)
                    }
                }
            }

            override fun onFailure(call: Call<List<Item>>, t: Throwable) {
                // Handle error
            }
        })
    }
}
