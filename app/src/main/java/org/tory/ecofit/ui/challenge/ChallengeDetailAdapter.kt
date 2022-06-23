package org.tory.ecofit.ui.challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.tory.ecofit.data.local.ChallengeItemData
import org.tory.ecofit.data.local.MarketItemData
import org.tory.ecofit.databinding.ItemChallengeDetailListBinding
import org.tory.ecofit.databinding.ItemMarketListBinding
import org.tory.ecofit.ui.market.MarketAdapter

class ChallengeDetailAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val itemList = mutableListOf<ChallengeItemData>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            ItemChallengeDetailListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ChallengeListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ChallengeListViewHolder).bind(itemList[position])
    }

    inner class ChallengeListViewHolder(private val binding: ItemChallengeDetailListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ChallengeItemData) {
            binding.viewModel = data
            binding.ivMarketImage.setImageResource(data.img)
        }
    }

    override fun getItemCount() = itemList.size

    fun setList(challengeItemList: List<ChallengeItemData>){
        itemList.clear()
        itemList.addAll(challengeItemList)
        notifyDataSetChanged()
    }

}