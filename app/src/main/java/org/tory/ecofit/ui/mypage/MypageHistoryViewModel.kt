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
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-20"),
            ChallengeHistoryData("플라스틱 줄이기 챌린지", "2022-06-15"),
            ChallengeHistoryData("로컬 푸드 소비 챌린지", "2022-06-14"),
            ChallengeHistoryData("에코플로깅 챌린지", "2022-06-10"),
            ChallengeHistoryData("플라스틱 줄이기 챌린지", "2022-06-03"),
            ChallengeHistoryData("플라스틱 줄이기  챌린지", "2022-06-01"),
        )
    }
}