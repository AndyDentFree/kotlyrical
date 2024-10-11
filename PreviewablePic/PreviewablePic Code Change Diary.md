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


-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Fix preview in IDE and other build errors
2024-10-10
Externally dropped JDK installed version from 23 to 21

Note unsure how many of these really made a difference but just committing now because sick of wasting time yo-yoing. These settled on AFTER wasted a lot of time using higher Gradle versions because IDE told me to.

composeApp/build.gradle.kts
- added buildFeatures { compose = true }

gradle/wrappper/gradle-wrapper.properties
- dropped version in URL from 8.7 to 8.6

gradle.properties
- added `kotlin.mpp.enableCInteropCommonization=true`
