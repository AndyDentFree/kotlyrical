package test.aussie.kolapsilist

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid
data class RowItem @OptIn(ExperimentalUuidApi::class) constructor(
    val id: Uuid = Uuid.random(),
    var isExpanded: Boolean = true,
    var isSelected: Boolean = false
)
