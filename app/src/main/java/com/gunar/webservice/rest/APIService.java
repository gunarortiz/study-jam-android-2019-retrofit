package com.gunar.webservice.rest;


import com.gunar.webservice.data.Base;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {
    @GET("listapro.php")
    Call<Base> llamar();

}