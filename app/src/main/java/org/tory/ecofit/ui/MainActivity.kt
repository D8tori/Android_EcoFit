package org.tory.ecofit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import org.tory.ecofit.R
import org.tory.ecofit.databinding.ActivityMainBinding
import org.tory.ecofit.ui.challenge.ChallengeFragment
import org.tory.ecofit.ui.home.HomeFragment
import org.tory.ecofit.ui.market.MarketFragment
import org.tory.ecofit.ui.mypage.MypageFragment

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val homeFragment by lazy { HomeFragment() }
    private val challengeFragment by lazy { ChallengeFragment() }
    private val marketFragment by lazy { MarketFragment() }
    private val mypageFragment by lazy { MypageFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setBottomNavigation()
        initView()
    }

    private fun initView(){
        binding.bnvMain.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
        val height = binding.bnvMain.measuredHeight

        val layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        layoutParams.setMargins(0, 0, 0, height)
        binding.fcvMain.layoutParams = layoutParams
    }

    private fun setBottomNavigation() {
        binding.bnvMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> changeFragment(getString(R.string.main_home))
                R.id.menu_challenge -> changeFragment(getString(R.string.main_challenge))
                R.id.menu_market -> changeFragment(getString(R.string.main_market))
                R.id.menu_mypage -> changeFragment(getString(R.string.main_mypage))
            }
            true
        }
        changeFragment(getString(R.string.main_home))
    }

    private fun changeFragment(tag: String) {
        val fm = supportFragmentManager
        val fragment = fm.findFragmentByTag(tag) ?: when (tag) {
            getString(R.string.main_home) -> homeFragment
            getString(R.string.main_challenge) -> challengeFragment
            getString(R.string.main_market) -> marketFragment
            getString(R.string.main_mypage) -> mypageFragment
            else -> null
        } ?: return

        if (fragment.isVisible) return
        val transaction = fm.beginTransaction()

        fm.fragments
            .filter { it.isVisible }
            .forEach {
                transaction.hide(it)
            }

        if (fragment.isAdded) {
            transaction.show(fragment)
        } else {
            transaction.add(R.id.fcv_main, fragment, tag)
        }

        transaction.commit()
    }
}