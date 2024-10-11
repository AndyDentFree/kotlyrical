PreviewablePic code change diary entries

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Creation
2024-10-09

Project created following Kotlin docs on [using Web Wizard][k1]:
- Project Name: PreviewablePic
- id: test.aussie.previewablepic
- platforms checked: Android, iOS, Desktop, Web

[k1]: https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#create-a-project-using-the-wizard



-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Add some logic for testing breakpoints
2024-10-10

App.kt
- App()
  - add a couple of local state vars clickMsg & clickCount
  - Button added to modify state vars, with Text using them so see count increment
