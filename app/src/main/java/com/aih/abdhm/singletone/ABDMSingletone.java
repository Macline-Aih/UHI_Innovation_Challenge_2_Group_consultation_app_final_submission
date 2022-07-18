package com.aih.abdhm.singletone;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class ABDMSingletone {
    private static ABDMSingletone minstance;
    private static Context mctx;
    private RequestQueue requestQueue;


    private ABDMSingletone(Context context) {
        mctx = context;
        requestQueue =getRequestQueue();
    }


    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mctx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized ABDMSingletone getInstance(Context context) {
        if (minstance == null) {
            minstance = new ABDMSingletone(context);
        }
        return minstance;
    }

    public <T> void addtorequestqueue(Request<T> request) {
        requestQueue.add(request);
    }
}
