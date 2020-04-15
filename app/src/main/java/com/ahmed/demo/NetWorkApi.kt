package com.ahmed.demo


import com.ahmed.demo.model.ProductFamily
import retrofit2.Call
import retrofit2.http.GET

interface NetWorkApi {

    @GET("/")
    fun getProducts(): Call<List<ProductFamily>>

}