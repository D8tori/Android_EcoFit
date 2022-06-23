package org.tory.ecofit.ui.market

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tory.ecofit.data.api.RetrofitBuilder
import org.tory.ecofit.data.model.response.ResponseMarketList

class MarketViewModel(application: Application) : AndroidViewModel(application) {
    private val _itemList = MutableLiveData<ResponseMarketList>()
    val itemList: LiveData<ResponseMarketList>
        get() = _itemList

    fun setItemList() = viewModelScope.launch {
        _itemList.postValue(
            RetrofitBuilder.marketService.getMarketList()
        )
    }
}