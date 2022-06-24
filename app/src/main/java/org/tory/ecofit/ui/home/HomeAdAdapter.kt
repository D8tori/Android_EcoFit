package org.tory.ecofit.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.tory.ecofit.R
import org.tory.ecofit.data.local.ChallengeItemData
import org.tory.ecofit.data.local.HomeAdData
import org.tory.ecofit.databinding.ItemAdBinding

class HomeAdAdapter : RecyclerView.Adapter<HomeAdAdapter.AdViewHolder>() {

    private var adList = emptyList<HomeAdData>()

    inner class AdViewHolder(
        private val binding: ItemAdBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(homeAdData: HomeAdData) {
            binding.viewModel = homeAdData

            Glide.with(itemView)
                .load(homeAdData.image)
                .error(R.drawable.img_logo)
                .fallback(R.drawable.img_logo)
                .into(binding.ivAd)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdViewHolder {
        val binding = ItemAdBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdViewHolder, position: Int) {
        holder.bind(adList[position])
    }

    override fun getItemCount(): Int = adList.size

    fun setAd(adList: List<HomeAdData>) {
        this.adList = adList
        notifyDataSetChanged()
    }
}