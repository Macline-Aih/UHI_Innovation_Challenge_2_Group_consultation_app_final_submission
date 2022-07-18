package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class DoctorSearchDataModel(@SerializedName("message" ) var message : Message? = Message(),
                                 @SerializedName("context" ) var context : Context? = Context())
