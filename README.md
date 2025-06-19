# Music Playlist Manager App
---
## Introduction 
The Music Playlist Manager App is an interactive Android application built in Android Studio using Kotlin. The app is designed help to store song details and allow the users to create and manage playlists. The user would be able to put and  rate songs, add comments, and input information about the artist.

1. A clean, multi-screen interface

2. Personalized user interaction

3. Instant feedback
   
4. Helps submit any song choice

5. stores your information

---

## Key Features 
1. Has four catergoray for the user to fill in
2. Displays the information the user has enter 
3. Give an average rating for when the user inputs the songs they have rated
4. Multi-Screen Navigation: Clean separation of UI across different screens

---

## File & Code Structure
### Activities
1.	MainActivity.kt- The user inputs in the 4 catergoray they have benn provided with
2.	DetailsViewActvivty.kt - The input from the frist screen goes to the second gving the use to see all their information and be able to calculate the Average Rating

---

## Layouts
1. activity_main.xml – Input field for the 4 catergoray and Add to playlist, Detailed view and Exit button
2. activity_detailed_view.xml - Has a textview whihc shows the the user their input and a display song details, avaerage rating and back button

---

 ## Technologies Used

•	IDE: Android Studio

•	Language: Kotlin

•	UI Components: TextView, EditText, Button, LinearLayout, Toast, Intent, Imagie

•	Layouts: XML using ConstraintLayout and LinearLayout

•	Architecture: Activity-based navigation (MainActivity and DetailedViewActivity)



### Technologies Used
Technology       -             	Purpose

Android Studio	    -            Main development environment

Kotlin           -             	Programming language

XML            -               	Designing UI layouts

EditText          -            	sont, artist Name, Rating and comment

Intent           -             	Navigation between activities

Toast           -               	Feedback to users

ConstraintLayout, LinearLayout	-UI structuring

Logcat (Log.d)             -    	Debugging and development tracing

----

## Installation
1.	Download the project or clone this repository.
2.	Open the project in Android Studio. -Start Android Studio. -Select "Open an existing Android Studio project"" -Go to the directory of the cloned repository and choose either the build.gradle.kts (or build.gradle) file or the root folder of the project.
3.	Grade of Sync: Upon opening the project, Android Studio will probably ask you to sync the Gradle files. Select "Sync Now". For this step, make sure you have a steady internet connection.
4.	To build and install the application, click Run Button.Open the Android Studio menu and select "Build -> Make Project"
5.	To test, connect an Android device or emulator. -Open the application: * Use an Android emulator or connect an Android device to your PC. Choose your device or emulator in Android Studio using the device dropdown in the

---

## How It Works:
1. There are 4 category ( Song, Artist, Rating(1-5) and Comments)
2. Add to playlist button
3. Can exit
4. If wish to contuin press the Detailed view screen
5. Display song details button the viewe the information
6. Calculates Average Rating
7. Button to go to Main screen

---

## How to Use the App
1. Lanuch the App
2. welcomed to the Main screen there are 4 category ( Song, Artist, Rating(1-5) and Comments)
3. After each time the user inputs they press the Add to playlist button
4. Aftetr the user is done thewy can either exit by pressing the exist button
5. Or go and see their input whihc they can press the Detailed View Screen
6. It will take the user to the next page where they need to press the Display song details button
7. The user will be able to see their information they inputted
8. By pressing the Average Rating button will calculate the totale average from all the rating
9. By pressing the Back button will allow the user to go back to the main Screen

---

## 4 Category
- Song Name
- Artist
- Rating(1-5)
- Comments

---
## Why We Use Logs
1.	Logs (e.g., Log are used to:
2.	Debug application logic.
3.	Track variable values (like username. Buttons or selected answers).
4.	Identify issues during development.
   
Logs are not shown to the user but are extremely useful in the Logcat console of Android Studio for developers. Makes the code easy.


---

## GitHub and Version Control
GitHub is used for:

GitHub is an online platform used to store, manage, and collaborate on code projects using version control (Git). It helps keep track of changes to code over time and allows multiple people to work on the same project without losing progress.


1.	Storing the source code online
2.	Collaborating with team members
3.	Tracking changes using commits
4.	Managing issues and improvement suggestions

## GitHub Actions
GitHub Actions is a tool built into GitHub that allows you to automate tasks like building, testing, or deploying your app every time you push code to your repository.

In this project:

GitHub Actions automatically builds your Android app using Gradle every time you push updates to the master branch.

This ensures your code is always working and up-to-date, helping catch errors early.

### Why commit and push?
1.	Saves your work safely online
2.	Keeps a history of every update
3.	Makes collaboration easier
4.	Helps in testing different versions

---

## Potential Improvements
- Add more features
- Include dark mode
- Add more categories
- Add a higher rating

 ---

## Screenshot of the App and Codes




 
