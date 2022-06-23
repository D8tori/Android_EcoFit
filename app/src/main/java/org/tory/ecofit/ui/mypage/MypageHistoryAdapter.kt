package org.tory.ecofit.ui.mypage

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.tory.ecofit.data.local.ChallengeHistoryData
import org.tory.ecofit.databinding.ItemHistoryListBinding

class MypageHistoryAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val itemList = mutableListOf<ChallengeHistoryData>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            ItemHistoryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return HistoryListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HistoryListViewHolder).bind(itemList[position])
    }

    inner class HistoryListViewHolder(private val binding: ItemHistoryListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ChallengeHistoryData) {
            binding.viewModel = data
            binding.tvHistoryTitle.text = data.title
            binding.tvHistoryDate.text = data.date
        }
    }

    override fun getItemCount() = itemList.size

    fun setList(HistoryItemList: List<ChallengeHistoryData>){
        itemList.clear()
        itemList.addAll(HistoryItemList)
        notifyDataSetChanged()
    }
}