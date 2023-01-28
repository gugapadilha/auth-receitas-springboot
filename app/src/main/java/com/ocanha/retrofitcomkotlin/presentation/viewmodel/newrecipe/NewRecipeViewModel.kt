package com.ocanha.retrofitcomkotlin.presentation.viewmodel.newrecipe

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ocanha.retrofitcomkotlin.domain.model.Recipe
import com.ocanha.retrofitcomkotlin.data.repositories.RecipeRepository

class NewRecipeViewModel constructor(private val repository: RecipeRepository) : ViewModel() {

    val status = MutableLiveData<Boolean>()

    fun saveRecipe(recipe: Recipe) {

        this.repository.saveRecipe(recipe)

        Handler().postDelayed({
            status.postValue(true)
        }, 2000)

    }


}