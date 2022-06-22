package org.tory.ecofit.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.tory.ecofit.ui.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(org.tory.ecofit.R.layout.activity_splash)
        moveMain(1)
    }

    private fun moveMain(sec: Int) {
        Handler().postDelayed(Runnable {
            MainActivity.start(this)
            finish()
        }, 1000 * sec.toLong())
    }
}