/*
 * Copyright 2022 Kalendar Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.himanshoe.kalendar.endlos.component.text.config

import androidx.compose.ui.graphics.Color

private val TitleTextColor = Color(0xFFD2827A)

data class KalendarTextColor(
    val textColor: Color
)

internal object KalendarTextColorDefaults {

    fun kalendarTitleTextColor() = KalendarTextColor(
        textColor = TitleTextColor
    )
    fun kalendarNormalTextColor() = KalendarTextColor(
        textColor = TitleTextColor
    )
}
