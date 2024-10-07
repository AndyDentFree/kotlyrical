# MateriallyMessy
Frustratedly stupid little testbed to explore issues related to getting extended Material icons.

Isolating from other projects such as Kolapsilist so as to not delay them and also with a simplified scope of a pure Android Kotlin Compose app vs multi-platform.

Written very iteratively from a _naive viewpoint_ showing what needed to change for each simple step, rather than dropping in a bunch of GPT-generated code.

See edit details in `MateriallyMessy Code Change Diary.md`

## Creation
Project created following [Android docs][a1] using _Empty Activity_ template
- Project Name: MateriallyMessy
- id: com.aussie.materiallymessy
- Min SDK API 28

[a1]: https://developer.android.com/develop/ui/compose/setup


## Extended Material Icons


### Importing all extended icons
The branch `ImportingAllExtendedIcons` uses an approach that is _officially discouraged_ on the [Maven repository][m1] but is regularly used in many of the official [jetpack compose samples][g1].

As they warn, it's notably a hit on build times, seen in the [branch which tried this approach][gh1]:

```
> Task :prepareKotlinBuildScriptModel UP-TO-DATE
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended/1.6.6/material-icons-extended-1.6.6.pom, took 1 s 949 ms
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended/1.6.6/material-icons-extended-1.6.6.module, took 1 s 176 ms
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended-android/1.6.6/material-icons-extended-android-1.6.6.pom, took 864 ms
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended-android/1.6.6/material-icons-extended-android-1.6.6.module, took 477 ms
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended-android/1.6.6/material-icons-extended-android-1.6.6.aar, took 17 s 180 ms
Download https://dl.google.com/dl/android/maven2/androidx/compose/material/material-icons-extended-android/1.6.6/material-icons-extended-android-1.6.6-sources.jar, took 10 s 224 ms

BUILD SUCCESSFUL in 41s
```


[m1]: https://developer.android.com/reference/kotlin/androidx/compose/material/icons/package-summary
[g1]: https://github.com/android/compose-samples
[g2]: https://issuetracker.google.com/issues/323537650
[gh1]: https://github.com/AndyDentFree/kotlyrical/tree/ImportingAllExtendedIcons