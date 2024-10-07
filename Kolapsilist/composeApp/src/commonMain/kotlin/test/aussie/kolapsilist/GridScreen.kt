package test.aussie.kolapsilist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Delete

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kolapsilist.composeapp.generated.resources.Res
import kolapsilist.composeapp.generated.resources.expand_content
import kolapsilist.composeapp.generated.resources.collapse_content
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.uuid.ExperimentalUuidApi

@Composable
@OptIn(ExperimentalUuidApi::class)
fun GridScreen() {
    val rows = remember { mutableStateListOf<RowItem>() }

    // Initialize the list with 120 rows
    //LaunchedEffect(Unit) {
        rows.clear()
        for (i in 1..120) {
            rows.add(RowItem()) // UUID will be automatically generated for each row
        }
    //}

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(rows) { row ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(if (row.isSelected) Color.LightGray else Color.White)
                    .clickable {
                        // Handle row selection
                        row.isSelected = !row.isSelected
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                // First column: Expand/Collapse Icon
                if (!row.isExpanded) {
                    IconButton(onClick = { row.isExpanded = true }) {
                        Icon(painter = painterResource(Res.drawable.expand_content), contentDescription = null)
                    }
                } else {
                    IconButton(onClick = { row.isExpanded = false }) {
                        Icon(painter = painterResource(Res.drawable.collapse_content), contentDescription = null)
                    }
                }

                // Columns 2-5: Placeholder text, replace with your content
                Spacer(modifier = Modifier.width(8.dp))
                for (i in 2..5) {
                    Text(
                        text = "Row ${row.id} Col $i",
                        fontSize = 16.sp,
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            // Conditionally show expanded content
            if (row.isExpanded) {
                // Expanded content for the row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 48.dp), // Indent to align with the grid
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Expanded content for Row ${row.id}")
                }
            }
        }
    }
}

@Preview
@Composable
fun GridScreenPreview() {
    GridScreen()
}