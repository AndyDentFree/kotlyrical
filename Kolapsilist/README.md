# Kolapsilist

Sample checking out nuances on creating multi-column grids in Compose and a few variations on how to collapse sections.

**Important** I'm trying to mark all the places in the code where weird platform-dependencies or other CMP vs Jetpack pains bite, with a comment:

`// CMPGotcha`

## Creation
Project created following Kotlin docs on [using Web Wizard][k1]:
- Project Name: Kolapsilist
- id: test.aussie.kolapsilist
- platforms checked: Android, iOS, Desktop

[k1]: https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#create-a-project-using-the-wizard

Note: I have put this sample on hold because I ran into a stupid build error (relating to cross-platform GUIDs) and don't have time to sort it out for a few weeks.

I'm also trying the commercial [Compose Examples](https://composeexamples.com/components/application-ui/components/expandablelists) list snippet instead, to accelerate shipping a robust application.

Most of `CMPGotcha` stuff has probably been solved with the release of CMP v1.7.0 as you can see over in [PreviewablePic](../PreviewablePic/README.md) 

## Web Wizard-generated README
This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…