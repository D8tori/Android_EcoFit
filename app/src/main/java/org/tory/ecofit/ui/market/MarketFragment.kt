package org.tory.ecofit.ui.market

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import org.tory.ecofit.R
import org.tory.ecofit.databinding.FragmentMarketBinding
import org.tory.ecofit.ui.challenge.ChallengeDetailActivity

class MarketFragment : Fragment() {
    private lateinit var binding: FragmentMarketBinding
    private val viewModel: MarketViewModel by activityViewModels()
    private lateinit var marketListAdapter: MarketAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMarketBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setItemList()
        setMarketAdapter()
        setListObserver()
        setSubFood()
        setUpCycling()
        setLocalFood()
        setVegan()
        setEtc()
        initClickListener()
    }

    private fun setSubFood() {
        binding.clTagSubfood.setOnClickListener {
            binding.clTagSubfood.isSelected = binding.clTagSubfood.isSelected != true
        }
    }

    private fun setUpCycling() {
        binding.clTagUpcycling.setOnClickListener {
            binding.clTagUpcycling.isSelected = binding.clTagUpcycling.isSelected != true
        }
    }

    private fun setLocalFood() {
        binding.clTagLocalfood.setOnClickListener {
            binding.clTagLocalfood.isSelected = binding.clTagLocalfood.isSelected != true
        }
    }

    private fun setVegan() {
        binding.clTagVegan.setOnClickListener {
            binding.clTagVegan.isSelected = binding.clTagVegan.isSelected != true
        }
    }

    private fun setEtc(){
        binding.clTagEtc.setOnClickListener{
            binding.clTagEtc.isSelected = binding.clTagEtc.isSelected != true
        }
    }

    private fun setMarketAdapter(){
        marketListAdapter = MarketAdapter()
        binding.rvMarketList.adapter = marketListAdapter
        binding.rvMarketList.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun setListObserver(){
        viewModel.itemList.observe(viewLifecycleOwner) {itemList ->
            with(binding.rvMarketList.adapter as MarketAdapter) {
                setList(itemList.markets)
            }
        }
    }

    private fun initClickListener(){
        binding.ivAdd.setOnClickListener {
            val intent = Intent(context, MarketUploadActivity::class.java)
            context?.startActivity(intent)
        }
    }
}