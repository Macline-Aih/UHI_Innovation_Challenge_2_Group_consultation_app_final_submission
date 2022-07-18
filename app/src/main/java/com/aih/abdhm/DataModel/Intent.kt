package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Intent(@SerializedName("fulfillment" ) var fulfillment : Fulfillment? = Fulfillment())
