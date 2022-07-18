package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("id"             ) var id            : String?     = null,
  @SerializedName("descriptor"     ) var descriptor    : Descriptor? = Descriptor(),
  @SerializedName("price"          ) var price         : Price?      = Price(),
  @SerializedName("fulfillment_id" ) var fulfillmentId : String?     = null

)