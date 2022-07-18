package com.aih.abdhm.DataModel.DoctorListResponse

import com.google.gson.annotations.SerializedName


data class Price (

  @SerializedName("currency" ) var currency : String? = null,
  @SerializedName("value"    ) var value    : String? = null

)