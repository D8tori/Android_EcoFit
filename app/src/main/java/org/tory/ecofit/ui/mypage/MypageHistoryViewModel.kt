package org.tory.ecofit.ui.mypage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.tory.ecofit.data.local.ChallengeHistoryData
import org.tory.ecofit.data.local.ChallengeItemData

class MypageHistoryViewModel(application: Application) : AndroidViewModel(application) {
    private val _itemList = MutableLiveData<List<ChallengeHistoryData>>()
    val itemList: LiveData<List<ChallengeHistoryData>>
        get() = _itemList

    fun setItemList(){
        _itemList.value = mutableListOf(
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-01"),
        )
    }
}