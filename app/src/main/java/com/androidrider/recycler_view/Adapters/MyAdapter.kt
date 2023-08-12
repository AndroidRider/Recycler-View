package com.androidrider.recycler_view.Adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.androidrider.recycler_view.Models.DataModel
import com.androidrider.recycler_view.R

class MyAdapter(private val context:Context, private var dataList: ArrayList<DataModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        // below line is to inflate our layout.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        // returning the size of array list.
        return dataList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.image.setImageResource(dataList.get(position).image)
        holder.title.text = dataList.get(position).title
        holder.description.text = dataList.get(position).description

        holder.container.setOnClickListener {
            Toast.makeText(context, dataList.get(position).title, Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // creating variables for our views.
        var title: TextView
        var description: TextView
        var image: ImageView
        var container: LinearLayout
        init {
            // initializing our views with their ids.
            title = itemView.findViewById(R.id.title)
            description = itemView.findViewById(R.id.desc)
            image = itemView.findViewById(R.id.image)
            container = itemView.findViewById(R.id.container)
        }
    }

    // method for filtering our recyclerview items.
    fun filterList(filterList: ArrayList<DataModel>) {
        dataList = filterList
        notifyDataSetChanged()
    }


}