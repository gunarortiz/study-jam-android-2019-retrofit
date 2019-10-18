package com.gunar.webservice.rest;

public class ApiUtils {
    public static final String BASE_URL = "http://clasespersonales.com/android/";

    public static APIService getApiServices(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}