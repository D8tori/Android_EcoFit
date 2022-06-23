package org.tory.ecofit.ui.market

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.tory.ecofit.R
import org.tory.ecofit.data.local.MarketItemData
import org.tory.ecofit.data.model.response.MarketData
import org.tory.ecofit.data.model.response.ResponseMarketList
import org.tory.ecofit.databinding.ItemMarketListBinding

class MarketAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var itemList = emptyList<MarketData>()
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
        fun bind(marketItemData: MarketData) {
            binding.tvMarketPrice.text = marketItemData.price.toString()
            binding.tvMarketTitle.text = marketItemData.name

            Glide.with(itemView)
                .load(marketItemData.image)
                .error(R.drawable.img_logo)
                .fallback(R.drawable.img_logo)
                .into(binding.ivMarketImage)
        }
    }

    override fun getItemCount() = itemList.size

    fun setList(marketItemList: List<MarketData>){
        this.itemList = marketItemList
        notifyDataSetChanged()
    }
}