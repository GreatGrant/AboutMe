# AboutMe

A simple Android app that allows you to create and display information about yourself. The app is built using LinearLayout, DataBinding, and ScrollView.

## Features

- Create a personal profile by entering your name, age, and a brief bio.
- Add a profile picture from your device's camera or gallery.
- Display your personal information in a scrolling view.
- Use of LinearLayout to organize the UI components.
- DataBinding is used to bind the data to the UI and update the UI in real-time.
- ScrollView is used to allow the user to scroll through the information.
- String Interpolation to allow manipulation of data

## Getting Started

1. Clone the repository by running ```git clone https://github.com/GreatGrant/AboutMe.git``` in your terminal.
2. Open the project in Android Studio.
3. Build and run the app on your device or emulator.


## Data Binding - The Idea
The big idea about data binding is to create an object that connects/maps/binds two pieces of distant information together at compile time, so that you don't have to look for it at runtime.
The object that surfaces these bindings to you is called the Binding object. It is created by the compiler, and while understanding how it works under the hood is interesting, it is not necessary to know for basic uses of data binding.

## Data Binding Vs findViewById
findViewById is a costly operation because it traverses the view hierarchy every time it is called.
With data binding enabled, the compiler creates references to all views in a <layout> that have an id, and gathers them in a Binding object.
In your code, you create an instance of the binding object, and then reference views through the binding object with no extra overhead.

## Data Binding Views and Data
Updating data and then updating the data displayed in views is cumbersome and a source of errors. Keeping the data in the view also violates separation of data and presentation.
Data binding solves both of these problems. You keep data in a data class. You add a <data> block to the <layout> to identify the data as variables to use with the views. Views reference the variables.
The compiler generates a binding object that binds the views and data.
In your code, you reference and update the data through the binding object, which updates the data, and thus what is displayed in the view.
Binding views to data sets a foundation for more advanced techniques using data binding.

## Acknowledgments

- Udacity for providing the course that helped me build this app.
