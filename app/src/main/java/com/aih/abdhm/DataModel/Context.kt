package com.aih.abdhm.DataModel

import com.google.gson.annotations.SerializedName

data class Context(@SerializedName("domain"         ) var domain        : String? = null,
                   @SerializedName("country"        ) var country       : String? = null,
                   @SerializedName("city"           ) var city          : String? = null,
                   @SerializedName("action"         ) var action        : String? = null,
                   @SerializedName("timestamp"      ) var timestamp     : String? = null,
                   @SerializedName("core_version"   ) var coreVersion   : String? = null,
                   @SerializedName("consumer_id"    ) var consumerId    : String? = null,
                   @SerializedName("consumer_uri"   ) var consumerUri   : String? = null,
                   @SerializedName("transaction_id" ) var transactionId : String? = null,
                   @SerializedName("message_id"     ) var messageId     : String? = null)
