package org.tory.ecofit.ui.market

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.tory.ecofit.R
import org.tory.ecofit.data.local.MarketItemData
import org.tory.ecofit.databinding.ItemMarketListBinding

class MarketAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val itemList = mutableListOf<MarketItemData>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            ItemMarketListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return MarketListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MarketListViewHolder).bind(itemList[position])
    }

    inner class MarketListViewHolder(private val binding: ItemMarketListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(marketItemData: MarketItemData) {
            binding.viewModel = marketItemData
            binding.ivMarketImage.setImageResource(marketItemData.img)
            binding.tvMarketPrice.text = marketItemData.price.toString()
            binding.tvMarketTitle.text = marketItemData.title
        }
    }

    override fun getItemCount() = itemList.size

    fun setList(marketItemList: List<MarketItemData>){
        itemList.clear()
        itemList.addAll(marketItemList)
        notifyDataSetChanged()
    }
}