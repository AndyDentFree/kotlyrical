# PreviewablePic

Very trivial sample to demonstrate being able to use Preview in Android Studio and Fleet, with common icons.

Built to isolate the preview problem because of problems encountered doing the much more complicated [Kolapsilist sample](../Kolaspilist/README.md).

**Summary** drama all goes away with Compose Plugin v1.7.0 onwards, no fancy workarounds needed (sigh).

## Buildable incomplete state and previews
As of 2024-10-11, without having done any abstraction on the image resource, so it's coming from `Image(painterResource(Res.drawable.compose_multiplatform)` 
- editing in Fleet version: 1.41.101
	- previewing App  with Android Preview shows the _rest of the Column_ skipping the `Image` without error. (In earlier versions this had a constant _out of date - rebuild_ `renderError`)
	- previewing App() with Desktop Preview shows the full Column

- editing in Android Studio 2024.2.1
  - MainActivity.kt supports local Android Preview, working same as Fleet's App() preview showing the `Column` without the `Image`.
  
## FIXED!
I thought I was going to be doing complicated `expect/actual` things but it turns out this has been [fixed since June][g1]

The difference was that I needed to be using an [Alpha version of Compose][g2]

So the **real** fix was to edit `gradle/libs.versions.toml` and change `compose-plugin = "1.7.0-alpha01"`.

- edited `libs.versions.toml` changing `compose-plugin = “1.7.0-alpha01”`
- (slow) Gradle resync
- Android preview (from `MainActivity.kt` looked unchanged, not showing image)
- Build - Clean Project (possibly unnecessary)
- Ran an Android simulator, which worked (as it had been all along), showing image
- Go back into `MainActivity.kt` and yes the preview now shows the image with a path `Res.drawable.compose_multiplatform`
  
[g1]: https://github.com/JetBrains/compose-multiplatform/pull/4965
[g2]: https://github.com/JetBrains/compose-multiplatform/releases/tag/v1.7.0-alpha01
  
## Web Wizard-generated README
This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.