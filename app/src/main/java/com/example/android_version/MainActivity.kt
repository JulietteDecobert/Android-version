package com.example.android_version

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items = Array<AndVersion>(11, { AndVersion() })
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seedItems()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapter(items)
    }

    fun seedItems() {
        val nameArray = resources.getStringArray(R.array.name)
        val imgArray = intArrayOf(
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.oreo,
            R.drawable.nougat,
            R.drawable.gingerbread,
            R.drawable.ice_cream_sandwitch,
            R.drawable.jelly_bean,
            R.drawable.froyo,
            R.drawable.lollipop
        )
        for (k in 0..nameArray.size - 1) {
            items[k] = AndVersion(nameArray[k], imgArray[k])
        }
    }

    private fun updateObjectList(adapter: AndVersionAdapter) {
        adapter.notifyDataSetChanged()
    }
}