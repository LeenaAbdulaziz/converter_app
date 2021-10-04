package com.example.converter

import retrofit2.Call
import retrofit2.http.GET


interface APIInterface {

        @GET("eur.json")
        fun getCurrency(): Call<Datum>?
}
