package com.aih.abdhm.DataModel.DoctorListResponse

import com.google.gson.annotations.SerializedName


data class Fulfillments (

  @SerializedName("id"    ) var id    : String? = null,
  @SerializedName("type"  ) var type  : String? = null,
  @SerializedName("agent" ) var agent : Agent?  = Agent(),
  @SerializedName("start" ) var start : Start?  = Start(),
  @SerializedName("end"   ) var end   : End?    = End(),
  @SerializedName("tags"  ) var tags  : Tags?   = Tags()

)