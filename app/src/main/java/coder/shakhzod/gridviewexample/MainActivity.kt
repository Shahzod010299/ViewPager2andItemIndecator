package coder.shakhzod.gridviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import coder.shakhzod.gridviewexample.adapter.GridViewAdapter
import coder.shakhzod.gridviewexample.data.DataProvider
import coder.shakhzod.gridviewexample.databinding.ActivityMainBinding
import coder.shakhzod.gridviewexample.ui.ImageActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var litPlayer: List<Pair<Int,String>>
    private lateinit var adapter: GridViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        litPlayer = DataProvider().getImageList()
        adapter = GridViewAdapter(this,litPlayer);
        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { parent, view, position, id ->
            val inten = Intent(this, ImageActivity::class.java)
            inten.putExtra("itemID",position)
            startActivity(inten)
        }

    }
}