MateriallyMessy code change diary entries

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Creation
2024-10-05

Project created following [Android docs][a1] using _Empty Activity_ template
- Project Name: MateriallyMessy
- id: com.aussie.materiallymessy
- Min SDK API 28

[a1]: https://developer.android.com/develop/ui/compose/setup


-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Adding first standard material icon on screen
2024-10-05

MainActivity.kt
- imports added from androidx.compose
  foundation.layout.Column
  material.icons.Icons
  material.icons.rounded.ShoppingCart
  ui.Alignment
  ui.res.stringResource
- Greeting 
  - add a Column wrapping the Text
  - add an Icon below the Text


[m1]: https://developer.android.com/reference/kotlin/androidx/compose/material/icons/package-summary