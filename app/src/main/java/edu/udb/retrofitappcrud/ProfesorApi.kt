package edu.udb.retrofitappcrud

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProfesorApi {
    @GET("/profesores")
    fun obtenerProfesores(): Call<List<Profesor>>

    @GET("profesores/{id}")
    fun obtenerProfesorPorId(@Path("id") id: Int): Call<Profesor>

    @POST("profesores")
    fun crearProfesor(@Body profesor: Profesor): Call<Profesor>

    @PUT("profesores/{id}")
    fun actualizarProfesor(@Path("id") id: Int, @Body profesor: Profesor): Call<Profesor>

    @DELETE("profesores/{id}")
    fun eliminarProfesor(@Path("id") id: Int): Call<Void>
}