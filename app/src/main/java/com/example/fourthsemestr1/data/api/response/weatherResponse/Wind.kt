package com.example.fourthsemestr1.data.api.response.weatherResponse

import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("deg")
    val deg: Int,
    @SerializedName("gust")
    val gust: Double,
    @SerializedName("speed")
    val speed: Double
)
