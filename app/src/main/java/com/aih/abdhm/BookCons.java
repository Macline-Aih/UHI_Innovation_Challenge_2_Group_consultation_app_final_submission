package com.aih.abdhm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.aih.abdhm.DataModel.Agent;
import com.aih.abdhm.DataModel.DoctorListResponce;
import com.aih.abdhm.DataModel.DoctorListResponse.DoctorListResponse;
import com.aih.abdhm.DataModel.DoctorListResponse.Fulfillments;
import com.aih.abdhm.DataModel.DoctorSearchDataModel;
import com.aih.abdhm.DataModel.End;
import com.aih.abdhm.DataModel.Fulfillment;
import com.aih.abdhm.DataModel.Message;
import com.aih.abdhm.DataModel.Start;
import com.aih.abdhm.DataModel.Time;
import com.aih.abdhm.adapter.DoctorListAdapter;
import com.aih.abdhm.singletone.ABDMSingletone;
import com.aih.abdhm.singletone.APIClient;
import com.aih.abdhm.singletone.APIInterface;
import com.aih.abdhm.singletone.Constants;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.JsonElement;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookCons extends AppCompatActivity {
    APIInterface apiInterface;
    ArrayList<Fulfillments> listdata=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_cons);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        TextInputEditText doctor_name = findViewById(R.id.doctor_name);
        doctor_name.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (s.length() != 0)
                    updatefranchise(doctor_name.getText().toString());
            }
        });

    }

    private void updatefranchise(String edit) {
        Agent agent = new Agent(edit);
        Time time = new Time("2022-07-14T13:24:20");
        Start start = new Start(time);
        End end = new End(time);
        Fulfillment fulfillment = new Fulfillment("Teleconsultation", agent, start, end);
        com.aih.abdhm.DataModel.Intent intent = new com.aih.abdhm.DataModel.Intent(fulfillment);
        com.aih.abdhm.DataModel.Context context = new com.aih.abdhm.DataModel.Context("nic2004:85111", "IND", "std:080", "search", "2022-07-14T08:05:55.252760Z", "0.7.1", "eua-aisteth", "https://eo4hdvs8betg9y7.m.pipedream.net", UUID.randomUUID().toString(), UUID.randomUUID().toString());
        Message message = new Message(intent);
        DoctorSearchDataModel doctorSearchDataModel = new DoctorSearchDataModel(message, context);

        Call<DoctorListResponce> call1 = apiInterface.createUser(doctorSearchDataModel);
        call1.enqueue(new Callback<DoctorListResponce>() {
            @Override
            public void onResponse(Call<DoctorListResponce> call, Response<DoctorListResponce> response) {
                if (response.isSuccessful()) {
                    Call<DoctorListResponse> call1 = apiInterface.getDoctorName();
                    call1.enqueue(new Callback<DoctorListResponse>() {
                        @Override
                        public void onResponse(Call<DoctorListResponse> call, Response<DoctorListResponse> response) {
                            if (response.isSuccessful()) {
                                DoctorListResponse doctorListResponse = response.body();
                                RecyclerView recyclerView = findViewById(R.id.doct_list);
                                listdata.clear();
                                listdata=doctorListResponse.getData().getCatalog().getFulfillments();
                                DoctorListAdapter doctorListAdapter = new DoctorListAdapter(listdata);
                                recyclerView.setLayoutManager(new LinearLayoutManager(BookCons.this));
                                recyclerView.setAdapter(doctorListAdapter);
                                doctorListAdapter.notifyDataSetChanged();
                            }

                        }

                        @Override
                        public void onFailure(Call<DoctorListResponse> call, Throwable t) {

                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<DoctorListResponce> call, Throwable t) {

            }
        });


    }

    public void findDoctor(View view) {
        startActivity(new Intent(this, FindDoctor.class));
    }
}