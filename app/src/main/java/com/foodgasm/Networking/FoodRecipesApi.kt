package com.foodgasm.Networking

import com.foodgasm.DataModel.Recipes.RecipesModelClass
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap quires: Map<String, String>
    ): Response<RecipesModelClass>
}