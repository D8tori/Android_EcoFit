package org.tory.ecofit.ui.challenge

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tory.ecofit.databinding.ActivityChallengeJoinBinding

class ChallengeJoinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChallengeJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChallengeJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()
    }

    private fun initClickListener(){
        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.buttonUpload.setOnClickListener{
            finish()
            //서버 전송
        }
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ChallengeJoinActivity::class.java)
            context.startActivity(intent)
        }
    }
}