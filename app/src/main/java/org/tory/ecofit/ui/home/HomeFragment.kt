package org.tory.ecofit.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import org.tory.ecofit.R
import org.tory.ecofit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    private var scrollPosition: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.setAdList()

        setCharacterAdapter()
        setAdObserve()
    }

    private fun setCharacterAdapter() {
        val characterListAdapter = HomeAdAdapter()
        binding.vpAd.adapter = characterListAdapter
        binding.vpAd.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        binding.vpAd.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            // Paging 완료되면 호출
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                scrollPosition = position
                Log.d("ViewPagerFragment", "Page ${scrollPosition + 1}")
            }
        })
    }

    private fun setAdObserve(){
        viewModel.adList.observe(viewLifecycleOwner) {adList ->
            with(binding.vpAd.adapter as HomeAdAdapter) {
                setAd(adList)
            }
        }
    }
}