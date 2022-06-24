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
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_1.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_3.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_4.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_5.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_6.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_3.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_4.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_5.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_1.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_1.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_3.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_4.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_5.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_6.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_3.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_4.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_5.jpeg"),
            ChallengeItemData("http://118.67.133.207/static/reduce_plastic_1.jpeg"),
        )
    }
}