package test.aussie.kolapsilist

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid
data class RowItem @OptIn(ExperimentalUuidApi::class) constructor(
    val id: Uuid = Uuid.random(),
    var isExpanded: Boolean = true,
    var isSelected: Boolean = false
) {
    @OptIn(ExperimentalUuidApi::class)
    fun smallId(): String
    {
        try {
            return id.toString().take(6)
        } catch (e: java.lang.NoSuchMethodError) {
            //CMPGotcha for Desktop previews because Uuid not there!!
            return "No Uuid"
        }
    }
}

