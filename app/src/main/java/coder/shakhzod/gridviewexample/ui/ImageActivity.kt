package coder.shakhzod.gridviewexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coder.shakhzod.gridviewexample.adapter.ViewPager2Adapter
import coder.shakhzod.gridviewexample.data.DataProvider
import coder.shakhzod.gridviewexample.databinding.ActivityImageBinding
import com.google.android.material.tabs.TabLayoutMediator


class ImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageBinding
    private lateinit var adapter: ViewPager2Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemId = intent.getIntExtra("itemID",0)

        adapter = ViewPager2Adapter(this,DataProvider().getImageList())
        binding.vp2.adapter = adapter
        binding.vp2.currentItem = itemId


        val tabLayoutMediator = TabLayoutMediator(
            binding.tabLayout, binding.vp2, true
        ) { tab, position ->

        }
        tabLayoutMediator.attach()
    }
}