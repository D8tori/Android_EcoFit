package org.tory.ecofit.ui.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.tory.ecofit.R
import org.tory.ecofit.databinding.ActivityMypageDetailBinding
import org.tory.ecofit.ui.challenge.ChallengeDetailAdapter

class MypageDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMypageDetailBinding
    private val viewModel: MypageHistoryViewModel by viewModels()
    private lateinit var historyListAdapter: MypageHistoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMypageDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setItemList()

        setAdapter()
        setListObserver()
        initClickListener()
    }

    private fun setAdapter() {
        historyListAdapter = MypageHistoryAdapter()
        binding.rvHistoryList.adapter = historyListAdapter
        binding.rvHistoryList.layoutManager = LinearLayoutManager(this)
    }

    private fun setListObserver() {
        viewModel.itemList.observe(this, Observer { itemList ->
            with(binding.rvHistoryList.adapter as MypageHistoryAdapter) {
                setList(itemList)
            }
        })
    }

    private fun initClickListener() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

}