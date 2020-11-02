package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.BitmapFactory
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val Streamlist: ArrayList<Streaming> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Streamlist.add(
            Streaming(
                "Netflix",
                BitmapFactory.decodeResource(
                    resources, R.drawable.netplik
                )
            )
        )
        Streamlist.add(
            Streaming(
                "Viu",
                BitmapFactory.decodeResource(
                    resources, R.drawable.viu
                )
            )
        )
        Streamlist.add(
            Streaming(
                "HooQ",
                BitmapFactory.decodeResource(
                    resources, R.drawable.hooq
                )
            )
        )
        layoutManager = LinearLayoutManager(this)
        streaminglist.layoutManager = layoutManager
        streaminglist.adapter = RecyclerViewAdapter(this, Streamlist)
    }
}