package data

data class DayWorkPeriod(
    val startTimeHour: String = "",
    val startTimeMinute: String = "",
    val endTimeHour: String = "",
    val endTimeMinute: String = "",
    val startTimePeriod: String = "AM",
    val endTimePeriod: String = "PM",
    val breakReductionHour: String = "",
    val breakReductionMinute: String = ""
)
