package com.joe.jetpackdemo.viewmodel.factory


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.joe.jetpackdemo.db.repository.ShoeRepository
import com.joe.jetpackdemo.viewmodel.FavouriteModel


class FavouriteModelFactory(
    private val repository: ShoeRepository
,private val userId:Long
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FavouriteModel(repository,userId) as T
    }
}