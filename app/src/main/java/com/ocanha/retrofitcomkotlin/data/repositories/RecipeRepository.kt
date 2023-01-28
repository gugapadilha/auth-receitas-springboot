package com.ocanha.retrofitcomkotlin.data.repositories

import android.util.Log
import com.ocanha.retrofitcomkotlin.domain.model.Recipe

class RecipeRepository {

    fun saveRecipe(recipe: Recipe) {

        //Salvar receita
        Log.i("Guga", recipe.toString())

    }

    fun getAllRecipes(): List<Recipe> {

        val recipes = mutableListOf<Recipe>()

        return recipes

    }

}