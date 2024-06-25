# Android App with Bottom Navigation 📱

## 🌟 Overview
This project aims to explore and implement a bottom navigation bar in an Android app using fragments. The `BottomNavigationView` component facilitates seamless navigation between different sections of the app, each represented by a fragment.

## 🛠️ Project Structure
The project includes a `MainActivity` that utilizes the `FragmentManager` to manage navigation between different fragments using a `BottomNavigationView`. Each fragment is designed to represent a specific part of the user interface.

### Key Components
- **MainActivity**:
  - Initializes the app and controls navigation between fragments.
  - Uses the `FragmentManager` to manage fragment transactions, such as addition, replacement, and removal.
  - Handles `BottomNavigationView` interactions to switch between fragments.

- **Bottom Navigation Menu**:
  - Defined in `bottom_menu.xml`, it includes items for home, search, add, reels, and profile.

- **Fragments**:
  - Each fragment (e.g., `HomeFragment`, `SearchFragment`) is a modular unit of the user interface.
  - Inflates a custom layout and may contain presentation logic and user interaction.

## 📷 Screenshots
<img src="https://github.com/leoschwedler/Android-App-with-Bottom-Navigation/assets/77402907/345a010c-9ffd-4ef2-9f92-53e37fb94b3c" width="260"/>
<img src="https://github.com/leoschwedler/Android-App-with-Bottom-Navigation/assets/77402907/fc5e3360-b818-4b41-bbfc-3526e14348d5" width="260"/>
<img src="https://github.com/leoschwedler/Android-App-with-Bottom-Navigation/assets/77402907/b96d2ef9-921b-4a9d-a96e-b8c39b5e6917" width="260"/>

## 🚀 Implemented Features
The project demonstrates basic functionalities, including:
- Dynamically adding fragments to the layout using `FragmentManager`.
- Using `FragmentTransaction` to handle fragment transactions.
- Implementing a bottom navigation bar to switch between different fragments.

## 📚 Study Objectives
This project aims to provide practical understanding of using `BottomNavigationView` and fragments in Android app development. By completing this study, the goal is to gain proficiency in:
- Creating flexible and adaptable user interfaces using fragments and `BottomNavigationView`.
- Effectively using `FragmentManager` to manage fragment dynamics.
- Implementing intuitive navigation between different parts of the app.
