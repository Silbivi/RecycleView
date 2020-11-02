package com.example.recyclerview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item_view.view. *
import java.util.ArrayList


class RecyclerViewAdapter(private val context : MainActivity, private val streamlist : ArrayList<Streaming>):
RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item_view, parent, false))
        }
        override fun getItemCount() : Int{
            return streamlist.size
        }
        override fun onBindViewHolder(holder:ViewHolder, position:Int){
            holder.bindItems(streamlist[position])
        }
        class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
            val logo = view.logostream
            val name = view.namestream

            fun bindItems(data : Streaming){
                logo?.setImageBitmap(data.logo)
                name?.text=data.nama

                itemView.setOnClickListener {
                    val text = data.nama
                    Toast.makeText(itemView.context, text, Toast.LENGTH_LONG).show()
            }
        }
    }
}