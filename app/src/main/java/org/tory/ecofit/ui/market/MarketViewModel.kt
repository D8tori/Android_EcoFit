package org.tory.ecofit.ui.market

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.tory.ecofit.R
import org.tory.ecofit.data.local.MarketItemData

class MarketViewModel(application: Application) : AndroidViewModel(application) {
    private val _itemList = MutableLiveData<List<MarketItemData>>()
    val itemList: LiveData<List<MarketItemData>>
        get() = _itemList

    fun setItemList(){
        _itemList.value = mutableListOf(
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
            MarketItemData(R.drawable.img_logo, 8000, "상품명"),
        )
    }
}