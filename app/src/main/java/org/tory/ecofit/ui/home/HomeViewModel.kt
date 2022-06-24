package org.tory.ecofit.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tory.ecofit.R
import org.tory.ecofit.data.api.RetrofitBuilder
import org.tory.ecofit.data.local.HomeAdData
import org.tory.ecofit.data.model.response.ResponseHabitPoint

class HomeViewModel(application: Application) : AndroidViewModel(application) {
    private val _adList = MutableLiveData<List<HomeAdData>>()
    val adList: LiveData<List<HomeAdData>>
        get() = _adList

    private val _updatePoint = MutableLiveData<ResponseHabitPoint>()
    val updatePoint: LiveData<ResponseHabitPoint>
        get() = _updatePoint

    fun updatePoint(title:String) = viewModelScope.launch {
        _updatePoint.postValue(
            RetrofitBuilder.habitService.updatePoint(title)
        )
    }


    fun setAdList() {
        _adList.value = mutableListOf(
            HomeAdData("https://images.unsplash.com/photo-1616164744857-1439f3dd5687?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"),
            HomeAdData("https://images.unsplash.com/photo-1599997338281-176a6855aaf0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=873&q=80"),
            HomeAdData("https://images.unsplash.com/photo-1626477369756-bababbb5b9f3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"),
        )
    }
}