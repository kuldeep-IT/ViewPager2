package com.peerbitskuldeep.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.peerbitskuldeep.viewpager2.adapters.ViewPager2Apdater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = arrayListOf(R.drawable.right
            ,R.drawable.lr,
                R.drawable.lr,
        R.drawable.left)

        val adapter = ViewPager2Apdater(list)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){ tab, position ->
            tab.text = "Tab ${position+1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Tab Selected "+ tab?.text, Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Tab Unselected "+ tab?.text, Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Tab Reselected "+ tab?.text, Toast.LENGTH_SHORT).show()
            }
        })

    }
}