package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName


data class Price (

  @SerializedName("currency" ) var currency : String? = null,
  @SerializedName("value"    ) var value    : String? = null

)