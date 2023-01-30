package com.ocanha.retrofitcomkotlin.data.repositories

import android.util.Log
import com.ocanha.retrofitcomkotlin.data.rest.RetrofitService
import com.ocanha.retrofitcomkotlin.domain.model.Recipe

class RecipeRepository constructor(private val retrofitService: RetrofitService) {

    fun saveRecipe(recipe: Recipe) = retrofitService.saveRecipe(recipe)

    fun getAllRecipes() = retrofitService.getAllRecipes()

}