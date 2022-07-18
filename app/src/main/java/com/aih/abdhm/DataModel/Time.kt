package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Time(
    @SerializedName("timestamp" ) var timestamp : String? = null)
