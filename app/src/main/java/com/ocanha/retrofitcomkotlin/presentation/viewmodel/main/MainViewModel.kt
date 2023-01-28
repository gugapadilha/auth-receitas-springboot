package com.ocanha.retrofitcomkotlin.presentation.viewmodel.main

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ocanha.retrofitcomkotlin.domain.model.Recipe
import com.ocanha.retrofitcomkotlin.data.repositories.RecipeRepository


class MainViewModel constructor(private val repository: RecipeRepository) : ViewModel() {

    val recipesList = MutableLiveData<List<Recipe>>()
    val errorMessage = MutableLiveData<String>()

    fun getAllRecipes() {

        val recipes = this.repository.getAllRecipes()

        Handler().postDelayed({
            recipesList.postValue(recipes)
        }, 2000)

    }

}