package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Message(@SerializedName("intent" ) var intent : Intent? = Intent()
)
