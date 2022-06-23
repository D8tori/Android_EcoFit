package org.tory.ecofit.ui.challenge

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.tory.ecofit.R
import org.tory.ecofit.databinding.FragmentChallengeBinding

class ChallengeFragment : Fragment() {
    private lateinit var binding: FragmentChallengeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChallengeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButton()
    }

    private fun setButton(){
        binding.clChoice1.setOnClickListener{
            val intent = Intent(context, ChallengeDetailActivity::class.java)
            context?.startActivity(intent)
        }

        binding.clChoice2.setOnClickListener{
            val intent = Intent(context, ChallengeDetailActivity::class.java)
            context?.startActivity(intent)
        }

        binding.clChoice3.setOnClickListener{
            val intent = Intent(context, ChallengeDetailActivity::class.java)
            context?.startActivity(intent)
        }

        binding.clChoice4.setOnClickListener{
            val intent = Intent(context, ChallengeDetailActivity::class.java)
            context?.startActivity(intent)
        }
    }
}