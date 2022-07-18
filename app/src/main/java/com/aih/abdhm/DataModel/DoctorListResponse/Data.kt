package com.aih.abdhm.DataModel.DoctorListResponse

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("catalog" ) var catalog : Catalog? = Catalog()

)