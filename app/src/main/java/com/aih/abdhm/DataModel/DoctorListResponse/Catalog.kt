package com.aih.abdhm.DataModel.DoctorListResponse

import com.google.gson.annotations.SerializedName


data class Catalog (

  @SerializedName("descriptor"   ) var descriptor   : Descriptor?             = Descriptor(),
  @SerializedName("items"        ) var items        : ArrayList<Items>        = arrayListOf(),
  @SerializedName("fulfillments" ) var fulfillments : ArrayList<Fulfillments> = arrayListOf()

)