package com.aih.abdhm.singletone;

import com.aih.abdhm.DataModel.DoctorListResponce;
import com.aih.abdhm.DataModel.DoctorListResponse.DoctorListResponse;
import com.aih.abdhm.DataModel.DoctorSearchDataModel;
import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @POST("api/v1/search")
    Call<DoctorListResponce> createUser(@Body DoctorSearchDataModel user);

    @GET("https://30wsctn5n2.execute-api.ap-south-1.amazonaws.com/api/on_search")
    Call<DoctorListResponse> getDoctorName();
}
