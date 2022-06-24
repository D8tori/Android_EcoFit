package org.tory.ecofit.ui.mypage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tory.ecofit.data.api.RetrofitBuilder
import org.tory.ecofit.data.model.response.ResponseMarketList
import org.tory.ecofit.data.model.response.ResponseUserInfo

class MypageViewModel(application: Application) : AndroidViewModel(application) {
    private val _itemList = MutableLiveData<ResponseUserInfo>()
    val itemList: LiveData<ResponseUserInfo>
        get() = _itemList

    fun setItemList() = viewModelScope.launch {
        _itemList.postValue(
            RetrofitBuilder.userService.getUserInfo()
        )
    }
}