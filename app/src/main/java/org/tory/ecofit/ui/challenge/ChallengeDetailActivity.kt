package org.tory.ecofit.ui.challenge

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import org.tory.ecofit.R
import org.tory.ecofit.databinding.ActivityChallengeDetailBinding
import org.tory.ecofit.databinding.FragmentChallengeBinding
import org.tory.ecofit.databinding.FragmentMarketBinding
import org.tory.ecofit.ui.market.MarketAdapter
import org.tory.ecofit.ui.market.MarketViewModel

class ChallengeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChallengeDetailBinding
    private val viewModel: ChallengeDetailViewModel by viewModels()
    private lateinit var challengeListAdapter: ChallengeDetailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChallengeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setItemList()
        setAdapter()
        setListObserver()
        initClickListener()
    }

    private fun setAdapter(){
        challengeListAdapter = ChallengeDetailAdapter()
        binding.rvChallengeList.adapter = challengeListAdapter
        binding.rvChallengeList.layoutManager = GridLayoutManager(this, 3)
    }

    private fun setListObserver(){
        viewModel.itemList.observe(this, Observer { itemList ->
            with(binding.rvChallengeList.adapter as ChallengeDetailAdapter) {
                setList(itemList)
            }
        })
    }

    private fun initClickListener(){
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ChallengeDetailActivity::class.java)
            context.startActivity(intent)
        }
    }
}