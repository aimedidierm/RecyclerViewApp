# 📱 RecyclerViewApp

## Instructions to Run the App

1. 🚀 Clone the repository:
   ```bash
   git clone https://github.com/aimedidierm/RecyclerViewApp.git
   ```
2. 🔍 Open the project in VS Code or Android Studio.
   - If using VS Code, make sure you have the necessary Android SDK and build tools installed.
3. 🛠️ Build the project:
   - In Android Studio: Click on `Build` > `Make Project`.
   - In VS Code: Use the terminal and run:
     ```bash
     ./gradlew build
     ```
4. 📲 Run the app on an Android device or emulator:
   - In Android Studio: Click on the `Run` button or press `Shift + F10`.
   - In VS Code: Use the terminal and run:
     ```bash
     ./gradlew installDebug
     ```

## 📚 Additional Libraries Used

- 🚀 Retrofit for network requests
- 📄 Gson for JSON parsing
- 📜 RecyclerView for displaying lists

## 📝 Assumptions and Design Decisions

- The app fetches data from the provided API endpoint and displays it in a RecyclerView.
- Clicking on an item in the list navigates to a details view that shows more information about the item.
- The app supports a landscape layout for tablets with a horizontal orientation for the RecyclerView.

## 🧪 Testing the Project

1. 📥 Clone the repository and navigate to the project directory:
   ```bash
   git clone https://github.com/aimedidierm/RecyclerViewApp.git
   cd RecyclerViewApp
   ```
2. 🧹 Clean the project and run the tests:

   ```bash
   ./gradlew clean test
   ```

   This will execute all unit tests defined in the project.

3. 📱 To run instrumented tests on an Android device or emulator:

   ```bash
   ./gradlew connectedAndroidTest
   ```

   Make sure an Android device or emulator is connected before running this command.

4. 🔍 View the test results:
   - Unit test results can be found in `app/build/reports/tests/testDebugUnitTest/`
   - Instrumented test results can be found in `app/build/reports/androidTests/connected/`

## 🛠️ Project Structure

```plaintext
RecyclerViewApp
├── app
│   ├── build.gradle.kts
│   ├── src
│   │   ├── main
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── recyclerviewapp
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── ListViewActivity.kt
│   │   │   │               ├── DetailsViewActivity.kt
│   │   │   └── res
│   │   │       ├── layout
│   │   │       │   ├── activity_details_view.xml
│   │   │       │   ├── activity_list_view.xml
│   │   │       │   ├── activity_main.xml
│   │   │       │   └── item_view.xml
│   │   │       ├── values
│   │   │       └── xml
│   ├── test
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── recyclerviewapp
│   │   │               └── AppTest.kt
│   ├── resources
├── gradle
│   ├── libs.versions.toml
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```
