package org.tory.ecofit.ui.market

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tory.ecofit.R
import org.tory.ecofit.databinding.ActivityMarketUploadBinding

class MarketUploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMarketUploadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarketUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)
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

    private fun initClickListener(){
        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.buttonUpload.setOnClickListener{
            //서버 전송
        }
    }


        companion object {
        fun start(context: Context) {
            val intent = Intent(context, MarketUploadActivity::class.java)
            context.startActivity(intent)
        }
    }
}