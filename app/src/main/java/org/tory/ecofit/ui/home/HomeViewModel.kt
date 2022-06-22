package org.tory.ecofit.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.tory.ecofit.R
import org.tory.ecofit.data.local.HomeAdData

class HomeViewModel (application: Application) : AndroidViewModel(application) {
    private val _adList = MutableLiveData<List<HomeAdData>>()
    val adList: LiveData<List<HomeAdData>>
        get() = _adList


    fun setAdList() {
        _adList.value = mutableListOf(
            HomeAdData(R.drawable.img_logo),
            HomeAdData(R.drawable.img_logo),
            HomeAdData(R.drawable.img_logo)
        )
    }
}