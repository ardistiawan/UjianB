package com.example.ardhiujianb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val tab = findViewById<TabLayout>(R.id.tabLayout)
        var fragment : Fragment = calon1Fragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position) {
                    0 -> fragment = calon1Fragment()
                    1 -> fragment = calon2Fragment()
                    2 -> fragment = calon3Fragment()
                }

                val fT = supportFragmentManager.beginTransaction()
                fT.replace(R.id.frameLayout, fragment)
                fT.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}