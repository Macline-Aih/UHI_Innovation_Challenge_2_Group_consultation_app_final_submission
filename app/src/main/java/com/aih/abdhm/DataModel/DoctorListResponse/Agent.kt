package com.aih.abdhm.DataModel.DoctorListResponse

import com.google.gson.annotations.SerializedName


data class Agent (

  @SerializedName("id"     ) var id     : String? = null,
  @SerializedName("name"   ) var name   : String? = null,
  @SerializedName("cred"   ) var cred   : String? = null,
  @SerializedName("gender" ) var gender : String? = null,
  @SerializedName("tags"   ) var tags   : Tags?   = Tags()

)