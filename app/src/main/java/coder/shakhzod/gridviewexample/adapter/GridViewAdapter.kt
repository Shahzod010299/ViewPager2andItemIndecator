package coder.shakhzod.gridviewexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import coder.shakhzod.gridviewexample.R

class GridViewAdapter(private val context: Context,
                      private val listPlayer: List<Pair<Int, String>>): BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun getCount(): Int {
        return listPlayer.size
    }

    override fun getItem(p0: Int): Any {
        return listPlayer[p0]
    }

    override fun getItemId(p0: Int): Long {
       return 0L
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.item_image, parent,false)
        }
        imageView = convertView!!.findViewById(R.id.img)
        textView = convertView.findViewById(R.id.tv_title)
        imageView.setImageResource(listPlayer[position].first)
        textView.text = listPlayer[position].second
        return convertView
    }
}