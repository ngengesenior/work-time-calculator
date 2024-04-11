package ui_components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

fun deviceWidthIsCompact(boxWithConstraintsScope: BoxWithConstraintsScope): Boolean {
    return boxWithConstraintsScope.maxWidth < 600.dp

}


@Composable
fun DayWorkPeriodUi(
    modifier: Modifier = Modifier,
    startHour: String,
    startMinute: String,
    startPeriod: String,
    endHour: String,
    endMinute: String,
    endPeriod: String,
    breakTimeHour: String,
    breakTimeMinute: String,
    onStartHourChange: (String) -> Unit,
    onStartMinuteChange: (String) -> Unit,
    onStartPeriodChange: (String) -> Unit,
    onEndHourChange: (String) -> Unit,
    onEndMinuteChange: (String) -> Unit,
    onEndPeriodChange: (String) -> Unit,
    onBreakTimeHourChange: (String) -> Unit,
    onBreakTimeMinuteChange: (String) -> Unit,
    day: String
) {

    BoxWithConstraints(modifier = modifier.padding(12.dp)) {
        if (deviceWidthIsCompact(this)) {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text(day, style = MaterialTheme.typography.subtitle2)
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    HourFieldUi(

                        hour = startHour,
                        onHourChange = onStartHourChange
                    )
                    Text(text = ":")
                    MinuteFieldUi(
                        minute = startMinute,
                        onMinuteChange = onStartMinuteChange
                    )
                    PeriodFieldUi(
                        period = startPeriod,
                        onPeriodChange = onStartPeriodChange
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text("Start")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    HourFieldUi(
                        hour = endHour,
                        onHourChange = onEndHourChange
                    )
                    Text(text = ":")
                    MinuteFieldUi(
                        minute = endMinute,
                        onMinuteChange = onEndMinuteChange
                    )
                    PeriodFieldUi(
                        period = endPeriod,
                        onPeriodChange = onEndPeriodChange
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text("End")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    HourFieldUi(hour = breakTimeHour, onHourChange = onBreakTimeHourChange)
                    Text(":")
                    MinuteFieldUi(
                        minute = breakTimeMinute,
                        onMinuteChange = onBreakTimeMinuteChange
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text("Break")

                }

            }

        } else {
            Column {
                Text(day, style = MaterialTheme.typography.subtitle2)
                Spacer(Modifier.height(12.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    HourFieldUi(

                        hour = startHour,
                        onHourChange = onStartHourChange
                    )
                    Text(text = ":")
                    MinuteFieldUi(
                        minute = startMinute,
                        onMinuteChange = onStartMinuteChange
                    )
                    PeriodFieldUi(
                        period = startPeriod,
                        onPeriodChange = onStartPeriodChange
                    )

                    Spacer(modifier = Modifier.width(16.dp))
                    HourFieldUi(
                        hour = endHour,
                        onHourChange = onEndHourChange
                    )
                    Text(text = ":")
                    MinuteFieldUi(
                        minute = endMinute,
                        onMinuteChange = onEndMinuteChange
                    )
                    PeriodFieldUi(
                        period = endPeriod,
                        onPeriodChange = onEndPeriodChange
                    )
                }
            }
        }

    }

}
/*Column(
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(12.dp)
) {

    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        HourFieldUi(

            hour = startHour,
            onHourChange = onStartHourChange
        )
        Text(text = ":")
        MinuteFieldUi(
            minute = startMinute,
            onMinuteChange = onStartMinuteChange
        )
        PeriodFieldUi(
            period = startPeriod,
            onPeriodChange = onStartPeriodChange
        )

        Spacer(modifier = Modifier.width(16.dp))
        HourFieldUi(
            hour = endHour,
            onHourChange = onEndHourChange
        )
        Text(text = ":")
        MinuteFieldUi(
            minute = endMinute,
            onMinuteChange = onEndMinuteChange
        )
        PeriodFieldUi(
            period = endPeriod,
            onPeriodChange = onEndPeriodChange
        )
    }


}*/



@Composable
fun HourFieldUi(modifier: Modifier = Modifier, hour: String, onHourChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = modifier
            .width(fieldSize),
        value = hour, onValueChange = onHourChange,
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword),
        placeholder = { Text("00") },
        singleLine = true
    )
}

@Composable
fun MinuteFieldUi(
    modifier: Modifier = Modifier, minute: String,
    onMinuteChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier
            .width(fieldSize), value = minute, onValueChange = onMinuteChange,
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword),
        placeholder = { Text("00") },
        singleLine = true
    )
}

@Composable
fun PeriodFieldUi(modifier: Modifier = Modifier, period: String, onPeriodChange: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box(
        modifier = modifier
            .width(fieldSize)
    ) {
        Row(modifier = Modifier
            .clickable {
                expanded = true
            }) {
            Text(text = period)
            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
        }

        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(onClick = {
                expanded = false
                onPeriodChange("AM")
            }) {
                Text(text = "AM")
            }
            DropdownMenuItem(onClick = {
                expanded = false
                onPeriodChange("PM")
            }) {
                Text(text = "PM")
            }
        }


    }
}

val fieldSize = 70.dp
val hourRegexPattern = "^(?:[1-9]|1[0-2])$".toRegex()
val minuteRegexPattern = "^[0-5]?[0-9]$".toRegex()



