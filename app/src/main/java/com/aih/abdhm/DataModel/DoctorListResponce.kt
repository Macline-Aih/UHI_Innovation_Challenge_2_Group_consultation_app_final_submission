package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class DoctorListResponce(
    @SerializedName("message" ) var message : Message_1? = Message_1(),
    @SerializedName("error"   ) var error   : Error?   = Error()
)
