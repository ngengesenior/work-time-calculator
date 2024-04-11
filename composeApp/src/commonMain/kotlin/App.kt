import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.DayWorkPeriod
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui_components.DayWorkPeriodUi

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {

        val hourRegexPattern = remember { "^(?:[1-9]|1[0-2])$".toRegex() }
        val minuteRegexPattern = remember { "^[0-5]?[0-9]$".toRegex() }
        var dayOne by remember { mutableStateOf(DayWorkPeriod()) }
        var dayTwo by remember { mutableStateOf(DayWorkPeriod()) }
        var dayThree by remember { mutableStateOf(DayWorkPeriod()) }
        var dayFour by remember { mutableStateOf(DayWorkPeriod()) }
        var dayFive by remember { mutableStateOf(DayWorkPeriod()) }
        var daySix by remember { mutableStateOf(DayWorkPeriod()) }
        var daySeven by remember { mutableStateOf(DayWorkPeriod()) }
        var showContent by remember { mutableStateOf(false) }
        Column(
            Modifier.fillMaxWidth()
                .verticalScroll(state = rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // Day one
            DayWorkPeriodUi(
                startHour = dayOne.startTimeHour,
                startMinute = dayOne.startTimeMinute,
                startPeriod = dayOne.startTimePeriod,
                endHour = dayOne.endTimeHour,
                endMinute = dayOne.endTimeMinute,
                endPeriod = dayOne.endTimePeriod,
                onStartHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayOne = dayOne.copy(startTimeHour = it)
                    }

                },
                onStartMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayOne = dayOne.copy(startTimeMinute = it)
                    }

                },
                onStartPeriodChange = {
                    dayOne = dayOne.copy(startTimePeriod = it)
                },
                onEndHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayOne = dayOne.copy(endTimeHour = it)
                    }

                },
                onEndMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayOne = dayOne.copy(endTimeMinute = it)
                    }

                },
                onEndPeriodChange = {
                    dayOne = dayOne.copy(endTimePeriod = it)
                },
                breakTimeHour = dayOne.breakReductionHour,
                breakTimeMinute = dayOne.breakReductionMinute,
                onBreakTimeHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayOne = dayOne.copy(breakReductionHour = it)
                    }
                },
                onBreakTimeMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayOne = dayOne.copy(breakReductionMinute = it)
                    }
                },
                day = "Monday"


            )

            // Day two

            DayWorkPeriodUi(
                startHour = dayTwo.startTimeHour,
                startMinute = dayTwo.startTimeMinute,
                startPeriod = dayTwo.startTimePeriod,
                endHour = dayTwo.endTimeHour,
                endMinute = dayTwo.endTimeMinute,
                endPeriod = dayTwo.endTimePeriod,
                onStartHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayTwo = dayTwo.copy(startTimeHour = it)
                    }

                },
                onStartMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayTwo = dayTwo.copy(startTimeMinute = it)
                    }
                },
                onStartPeriodChange = {
                    dayTwo = dayTwo.copy(startTimePeriod = it)
                },
                onEndHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayTwo = dayTwo.copy(endTimeHour = it)
                    }

                },
                onEndMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayTwo = dayTwo.copy(endTimeMinute = it)
                    }
                },
                onEndPeriodChange = {
                    dayTwo = dayTwo.copy(endTimePeriod = it)
                },
                breakTimeHour = dayTwo.breakReductionHour,
                breakTimeMinute = dayTwo.breakReductionMinute,
                onBreakTimeHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayTwo = dayTwo.copy(breakReductionHour = it)
                    }
                },
                onBreakTimeMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayTwo = dayTwo.copy(breakReductionMinute = it)
                    }
                },
                day = "Tuesday"

            )
            // Day three

            DayWorkPeriodUi(
                startHour = dayThree.startTimeHour,
                startMinute = dayThree.startTimeMinute,
                startPeriod = dayThree.startTimePeriod,
                endHour = dayThree.endTimeHour,
                endMinute = dayThree.endTimeMinute,
                endPeriod = dayThree.endTimePeriod,
                onStartHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayThree = dayThree.copy(startTimeHour = it)
                    }

                },
                onStartMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayThree = dayThree.copy(startTimeMinute = it)
                    }
                },
                onStartPeriodChange = {
                    dayThree = dayThree.copy(startTimePeriod = it)
                },
                onEndHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayThree = dayThree.copy(endTimeHour = it)
                    }

                },
                onEndMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayThree = dayThree.copy(endTimeMinute = it)
                    }

                },
                onEndPeriodChange = {
                    dayThree = dayThree.copy(endTimePeriod = it)
                },
                breakTimeHour = dayThree.breakReductionHour,
                breakTimeMinute = dayThree.breakReductionMinute,
                onBreakTimeHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayThree = dayThree.copy(breakReductionHour = it)
                    }
                },
                onBreakTimeMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayThree = dayThree.copy(breakReductionMinute = it)
                    }
                },
                day = "Wednesday"

            )

            // Day four
            DayWorkPeriodUi(
                startHour = dayFour.startTimeHour,
                startMinute = dayFour.startTimeMinute,
                startPeriod = dayFour.startTimePeriod,
                endHour = dayFour.endTimeHour,
                endMinute = dayFour.endTimeMinute,
                endPeriod = dayFour.endTimePeriod,
                onStartHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayFour = dayFour.copy(startTimeHour = it)
                    }

                },
                onStartMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayFour = dayFour.copy(startTimeMinute = it)
                    }

                },
                onStartPeriodChange = {
                    dayFour = dayFour.copy(startTimePeriod = it)
                },
                onEndHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayFour = dayFour.copy(endTimeHour = it)
                    }


                },
                onEndMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayFour = dayFour.copy(endTimeMinute = it)
                    }

                },
                onEndPeriodChange = {
                    dayFour = dayFour.copy(endTimePeriod = it)
                },
                breakTimeHour = dayFour.breakReductionHour,
                breakTimeMinute = dayFour.breakReductionMinute,
                onBreakTimeHourChange = {
                    if (it.isEmpty() || it.matches(hourRegexPattern)) {
                        dayFour = dayFour.copy(breakReductionHour = it)
                    }
                },
                onBreakTimeMinuteChange = {
                    if (it.isEmpty() || it.matches(minuteRegexPattern)) {
                        dayFour = dayFour.copy(breakReductionMinute = it)
                    }
                },
                day = "Thursday"

            )

        }
    }
}

