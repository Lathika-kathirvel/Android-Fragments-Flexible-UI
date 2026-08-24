# MAD Lab Experiment 3

## Build an Android Application Using Fragments for Flexible UI

---

## 📌 Experiment Details

**Experiment Number:** 3

**Experiment Title:** Build an Android application using Fragments for flexible UI.

**Student Name:** Tejas Sunil Waske

**USN:** 25MCAR0189

**Programming Language:** Kotlin

**IDE:** Android Studio

**Platform:** Android

---

# 🎯 Aim

To develop an Android application using Fragments to demonstrate a flexible, modular, and reusable user interface.

---

# 📌 Objectives

The objectives of this experiment are:

* To understand the concept of Android Fragments.
* To learn how to create and use Fragments in an Android application.
* To understand Fragment-based UI design.
* To use RecyclerView to display a list of items.
* To implement a Master-Detail user interface.
* To understand communication between different UI components.
* To demonstrate flexible and reusable UI components using Fragments.

---

# 💡 Concept / Theory

## What is a Fragment?

A Fragment is a modular portion of an Android application's user interface that is hosted inside an Activity. A Fragment has its own lifecycle and can be added, removed, or replaced while the Activity is running.

Fragments are useful for creating flexible user interfaces because different Fragments can be combined and reused within Activities.

Android recommends using a `FragmentContainerView` as a container when placing Fragments in an Activity.

---

## What is RecyclerView?

RecyclerView is an Android UI component used to display a collection of items efficiently.

It uses an Adapter and ViewHolder to create and bind list items. RecyclerView reuses item views when they move off-screen, which improves performance and responsiveness.

---

# 🛠️ Technologies Used

| Technology       | Purpose                         |
| ---------------- | ------------------------------- |
| Kotlin           | Programming language            |
| Android Studio   | Development environment         |
| Android SDK      | Android application development |
| AndroidX         | Modern Android libraries        |
| Fragments        | Modular and flexible UI         |
| RecyclerView     | Displaying list of items        |
| ConstraintLayout | Designing application layouts   |
| Material Design  | UI components and styling       |
| Gradle           | Project build system            |

---

# 📱 Scenario Used

The application demonstrates a **Master-Detail interface**.

The application contains a list of items on the main screen. When the user selects an item, the application displays detailed information related to the selected item.

### Application Flow

```text
                 Android Application
                         |
                         v
                +------------------+
                |   MainActivity   |
                +------------------+
                         |
                         v
              +---------------------+
              | ItemListFragment    |
              +---------------------+
                         |
                    Select Item
                         |
                         v
              +---------------------+
              |  DetailFragment     |
              +---------------------+
                         |
                         v
                Display Item Details
```

---

# ⚙️ Working of the Application

1. The application starts with `MainActivity`.
2. The main Activity hosts the Fragment-based interface.
3. `ItemListFragment` displays a list of items.
4. The list is displayed using `RecyclerView`.
5. The user selects an item from the list.
6. The selected item information is passed to the detail component.
7. `DetailFragment` displays the selected item's details.
8. The user can navigate back to the previous screen.

Fragment transactions allow Android applications to add, remove, or replace Fragments during runtime.

---

# 📂 Project Folder and File Structure

```text
MADLab3
│
├── app
│   │
│   ├── src
│   │   └── main
│   │       │
│   │       ├── java
│   │       │   └── com.example.madlab3
│   │       │       ├── MainActivity.kt
│   │       │       ├── Item.kt
│   │       │       ├── ItemAdapter.kt
│   │       │       ├── ItemListFragment.kt
│   │       │       └── DetailFragment.kt
│   │       │
│   │       ├── res
│   │       │   ├── drawable
│   │       │   ├── layout
│   │       │   ├── mipmap
│   │       │   └── values
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── gradle
│   └── wrapper
│
├── images
│   ├── output.png
│   ├── testcase1.png
│   ├── testcase2.png
│   └── testcase3.png
│
├── README.md
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── gradlew
```

---

# 📄 Important Files and Their Purpose

### `MainActivity.kt`

Acts as the main Activity and provides the container for the Fragment-based UI.

### `Item.kt`

Defines the data model used to represent the items displayed in the application.

### `ItemAdapter.kt`

Connects the item data with the RecyclerView and manages the individual list items.

### `ItemListFragment.kt`

Displays the list of items using RecyclerView.

### `DetailFragment.kt`

Displays detailed information about the item selected by the user.

### `AndroidManifest.xml`

Contains important application configuration and Android component declarations.

### XML Layout Files

Define the visual structure and user interface of the Activities and Fragments.

---

# 🧪 Test Cases

Three test cases were performed to verify the functionality of the application.

---

## Test Case 1: Application Launch

### Test Objective

To verify that the application launches successfully and displays the main screen.

### Test Steps

1. Open the application.
2. Wait for the application to load.
3. Observe the main screen.
4. Verify that the item list is displayed.

### Expected Result

The application should launch successfully and display the main screen with the available items.

### Actual Result

The application launched successfully and displayed the item list.

### Status

**PASS ✅**

### Screenshot

![Test Case 1 - Application Launch](images/testcase1.png)

---

# 🧪 Test Case 2: Item Selection and Detail Display

### Test Objective

To verify that selecting an item displays the corresponding details.

### Test Steps

1. Launch the application.
2. Select an item from the displayed list.
3. Observe the detail screen.
4. Verify that the selected item's information is displayed.

### Expected Result

The application should display the details corresponding to the selected item.

### Actual Result

The selected item's details were displayed successfully.

### Status

**PASS ✅**

### Screenshot

![Test Case 2 - Detail Screen](images/testcase2.png)

---

# 🧪 Test Case 3: USN and Name Verification

### Test Objective

To verify that the student's name and USN are displayed correctly in the application.

### Test Data

**Student Name:** Tejas Sunil Waske

**USN:** 25MCAR0189

### Test Steps

1. Launch the application.
2. Navigate to the screen where student information is displayed.
3. Verify the student's name.
4. Verify the student's USN.

### Expected Result

The application should correctly display:

```text
Name: Tejas Sunil Waske
USN: 25MCAR0189
```

### Actual Result

The student's name and USN were displayed correctly.

### Status

**PASS ✅**

### Screenshot

![Test Case 3 - USN and Name](images/testcase3.png)

---

# 📸 Application Output

The final output of the Android application is shown below.

![Application Output](images/output.png)

---

# 🚀 Steps to Run the Project

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Allow Gradle synchronization to complete.
4. Connect an Android device or start an Android Emulator.
5. Select the application configuration.
6. Click the **Run ▶** button.
7. The application will launch on the connected device or emulator.

---

# 💻 Requirements

## Hardware Requirements

* Laptop/Desktop computer
* Android device or Android Emulator
* USB cable if using a physical Android device

## Software Requirements

* Android Studio
* Android SDK
* Kotlin
* Gradle

---

# 🎓 Learning Outcomes

After completing this experiment, the following concepts were learned:

* Understanding Android Fragments.
* Creating and using multiple Fragments.
* Understanding Fragment lifecycle.
* Creating flexible and modular UI components.
* Using RecyclerView to display dynamic lists.
* Implementing a Master-Detail interface.
* Passing and displaying selected item data.
* Performing Fragment navigation and transactions.
* Developing Android applications using Kotlin.

---

# ✅ Conclusion

The Android application was successfully developed using Kotlin, Fragments, and RecyclerView.

The experiment demonstrated how Fragments can be used to create flexible, reusable, and modular user interfaces. RecyclerView was used to display a list of items efficiently, while the Detail Fragment was used to display information related to the selected item.

The application was successfully tested using three test cases, including verification of the student's name and USN.

Therefore, the objective of implementing an Android application using Fragments for flexible UI was successfully achieved.

---

# 👨‍💻 Student Information

**Name:** Tejas Sunil Waske

**USN:** 25MCAR0189

**Experiment:** MAD Lab Experiment 3

---

# 🔗 GitHub Repository

**Repository:**
https://github.com/twaske2-dotcom/MADLab3/edit/main/README.md

---

# 📚 Reference

**Android Developers – Fragments:**
https://developer.android.com/guide/fragments/create

**Android Developers – RecyclerView:**
https://developer.android.com/develop/ui/views/layout/recyclerview

**Android Developers – Fragment Transactions:**
https://developer.android.com/guide/fragments/transactions
