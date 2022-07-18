package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Fulfillment(@SerializedName("type"  ) var type  : String? = null,
                       @SerializedName("agent" ) var agent : Agent?  = Agent(),
                       @SerializedName("start" ) var start : Start?  = Start(),
                       @SerializedName("end"   ) var end   : End?    = End())
