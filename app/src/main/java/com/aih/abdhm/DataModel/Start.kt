package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Start(
    @SerializedName("time" ) var time : Time? = Time()

)
