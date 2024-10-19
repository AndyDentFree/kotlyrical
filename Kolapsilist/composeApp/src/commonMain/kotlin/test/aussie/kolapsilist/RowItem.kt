package test.aussie.kolapsilist

data class RowItem  constructor(
    val id: String = randomUUIDString(),
    var isExpanded: Boolean = true,
    var isSelected: Boolean = false
) {
    fun smallId(): String
    {
        try {
            return id.take(6)
        } catch (e: java.lang.NoSuchMethodError) {
            //CMPGotcha for Desktop previews because Uuid not there!!
            return "No Uuid"
        }
    }
}

