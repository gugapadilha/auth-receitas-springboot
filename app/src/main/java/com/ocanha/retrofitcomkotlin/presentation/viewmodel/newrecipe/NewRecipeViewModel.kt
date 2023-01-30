package com.ocanha.retrofitcomkotlin.presentation.viewmodel.newrecipe

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ocanha.retrofitcomkotlin.domain.model.Recipe
import com.ocanha.retrofitcomkotlin.data.repositories.RecipeRepository
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class NewRecipeViewModel constructor(private val repository: RecipeRepository) : ViewModel() {

    val status = MutableLiveData<Boolean>()

    fun saveRecipe(recipe: Recipe) {

        val request = this.repository.saveRecipe(recipe)
        request.enqueue(object : Callback<ResponseBody>{
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {

            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {

            }

        })

    }


}