package coder.shakhzod.gridviewexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.shakhzod.gridviewexample.databinding.ItemImageBinding
import coder.shakhzod.gridviewexample.databinding.ItemImageViewPagerBinding


class ViewPager2Adapter(private val context: Context,
                        private val labelList: List<Pair<Int,String>>)
    : RecyclerView.Adapter<ViewPager2Adapter.ViewPagerHolder>() {

    class ViewPagerHolder(private var binding: ItemImageViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Pair<Int, String>) {
            binding.tvTitle.text = data.second
            binding.img.setImageResource(data.first)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = ItemImageViewPagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(labelList[position])
    }

    override fun getItemCount(): Int {
        return labelList.size
    }
}