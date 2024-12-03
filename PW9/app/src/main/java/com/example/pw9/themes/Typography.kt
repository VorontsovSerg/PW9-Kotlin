package com.example.pw9.themes

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pw9.R

val CustomFont = FontFamily(
    Font(R.font.a_presentumcpsnr)
)

val Typography = Typography(
    h5 = TextStyle(
        fontSize = 30.sp,
        fontFamily = CustomFont
    ),
    body1 = TextStyle(
        fontSize = 25.sp,
        fontFamily = CustomFont
    )
)