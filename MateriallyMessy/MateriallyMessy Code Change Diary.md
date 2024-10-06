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


-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
## Adding extended material icon by including converted icon
2024-10-07

MainActivity.kt
- add import androidx.compose.ui.res.painterResource
- add import androidx.compose.material.icons.rounded.Print
- Greeting change layout adding a Row so now two Icons below the text
- center the text

res/drawable
- print.xml added from [downloaded print_24dp_5F6368.svg][p]

[p]: https://fonts.google.com/icons?icon.query=print&icon.style=Filled&icon.set=Material+Icons&icon.size=24&icon.color=%235f6368  
