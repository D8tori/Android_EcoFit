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
            HomeAdData("http://cdn.iconsumer.or.kr/news/photo/202006/12106_15336_1934.png"),
            HomeAdData("https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbNBvQc%2FbtramgzdFGq%2FhVEyEbPBuCOMfpKNSa4YW0%2Fimg.png"),
            HomeAdData("https://img3.yna.co.kr/etc/inner/KR/2021/03/22/AKR20210322037200030_01_i_P2.jpg"),
            HomeAdData("https://eventusstorage.blob.core.windows.net/evs/Image/grid/31022/ProjectInfo/Cover/5a53d836aff747b292d9a95bb455016b.jpg"),
            HomeAdData("https://mblogthumb-phinf.pstatic.net/MjAyMTAyMjFfODIg/MDAxNjEzOTEyNDIwNzY4.s-7C2AMvcscu1GMJI96BOkByj8njmFx0h3B9udIjVREg.R44jSM5YxUbEPRG0Y-ykQ9IFQQv44mvnzGaDmyeK0dUg.JPEG.okretro/Screenshot%EF%BC%BF20210221%EF%BC%8D212806%EF%BC%BFYouTube.jpg?type=w800"),
        )
    }
}