package org.tory.ecofit.ui.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.tory.ecofit.R
import org.tory.ecofit.databinding.FragmentMypageBinding
import org.tory.ecofit.ui.market.MarketUploadActivity

class MypageFragment : Fragment() {
    private lateinit var binding: FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initClickListener()
    }

    private fun initClickListener(){
        binding.tvChallengeHistory.setOnClickListener{
            val intent = Intent(context, MypageDetailActivity::class.java)
            context?.startActivity(intent)
        }
    }
}