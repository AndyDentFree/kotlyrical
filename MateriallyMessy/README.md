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

## Importing all extended icons
The branch `ImportingAllExtendedIcons` uses an approach that is _officially discouraged_ on the [Maven repository][m1] but is regularly used in many of the official [jetpack compose samples][g1].

[m1]: [a1]: https://developer.android.com/develop/ui/compose/setup
[g1]: https://github.com/android/compose-samples