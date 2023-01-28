package com.ocanha.retrofitcomkotlin.presentation.viewmodel.main

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ocanha.retrofitcomkotlin.domain.model.Recipe
import com.ocanha.retrofitcomkotlin.data.repositories.RecipeRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainViewModel constructor(private val repository: RecipeRepository) : ViewModel() {

    val recipesList = MutableLiveData<List<Recipe>>()
    val errorMessage = MutableLiveData<String>()

    fun getAllRecipes() {

        val request = this.repository.getAllRecipes()
        request.enqueue(object : Callback<List<Recipe>>{
            override fun onResponse(call: Call<List<Recipe>>, response: Response<List<Recipe>>) {

                if (response.code() == 200){

                   recipesList.postValue(response.body())

                }else {
                    errorMessage.postValue("Erro ao listar receitas ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Recipe>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }

        })


    }

}