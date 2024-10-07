Kolapsilist code change diary entries

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Creation
2024-09-29

Project created following Kotlin docs on [using Web Wizard][k1]:
- Project Name: Kolapsilist
- id: test.aussie.kolapsilist
- platforms checked: Android, iOS, Desktop

Opened in Android Studio (2024.1.2)
-  upgraded  Android Gradle Plugin from 8.2.2 to 8.6.1.


-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Fix preview in IDE
2024-09-29..10-07

libs.versions.toml
- uiToolingPreviewAndroid = "1.7.3"
- androidx-ui-tooling-preview-android = { group = "androidx.compose.ui", name = "ui-tooling-preview-android", version.ref = "uiToolingPreviewAndroid" }
  added decls
  
build.gradle.kts
- added dependency     implementation(libs.androidx.ui.tooling.preview.android)

 

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Adding GridScreen list without selection
2024-09-29..10-07

RowItem.kt
GridScreen.kt
composeResources/drawable/collapse_content.xml & expand_content.xml_
- added

App.kt
- App replace Greeting with GridScreen() to show default grid

Greeting.kt removed