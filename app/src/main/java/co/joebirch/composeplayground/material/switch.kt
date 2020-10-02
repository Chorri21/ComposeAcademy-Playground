package co.joebirch.composeplayground.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import co.joebirch.composeplayground.ComposableLayout

object SwitchView : ComposableLayout {

    @Composable
    override fun build() {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(Color.LightGray)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MinimalSwitchComponent()
                ColoredSwitchComponent()
                DisabledSwitchComponent()
            }
        }
    }

    @Composable
    fun MinimalSwitchComponent() {
        val isChecked = state { false }
        Switch(
            checked = isChecked.value,
            onCheckedChange = { checked ->
                isChecked.value = checked
            }, modifier = Modifier.wrapContentSize()
        )
    }

    @Composable
    fun ColoredSwitchComponent() {
        val isChecked = state { true }
        Switch(
            checked = isChecked.value,
            onCheckedChange = { checked ->
                isChecked.value = checked
            },
            color = Color.Red
        )
    }

    @Composable
    fun DisabledSwitchComponent() {
        val isChecked = state { true }
        Switch(
            checked = isChecked.value,
            onCheckedChange = { checked ->
                isChecked.value = checked
            },
            enabled = false
        )
    }
}