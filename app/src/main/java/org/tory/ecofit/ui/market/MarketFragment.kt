package org.tory.ecofit.ui.market

import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.tory.ecofit.R
import org.tory.ecofit.databinding.FragmentMarketBinding

class MarketFragment : Fragment() {
    private lateinit var binding: FragmentMarketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMarketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setSubFood()
        setUpCycling()
        setLocalFood()
        setVegan()
        setEtc()
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
}