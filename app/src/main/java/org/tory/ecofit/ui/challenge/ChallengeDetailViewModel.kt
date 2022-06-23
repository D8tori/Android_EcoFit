package org.tory.ecofit.ui.challenge

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.tory.ecofit.R
import org.tory.ecofit.data.local.ChallengeItemData
import org.tory.ecofit.data.local.MarketItemData

class ChallengeDetailViewModel(application: Application) : AndroidViewModel(application) {
    private val _itemList = MutableLiveData<List<ChallengeItemData>>()
    val itemList: LiveData<List<ChallengeItemData>>
        get() = _itemList

    fun setItemList(){
        _itemList.value = mutableListOf(
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
            ChallengeItemData(R.drawable.img_logo),
        )
    }
}