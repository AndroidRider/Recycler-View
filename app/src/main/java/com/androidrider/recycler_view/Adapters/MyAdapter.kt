package com.androidrider.recycler_view.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.androidrider.recycler_view.Models.MyDataModel
import com.androidrider.recycler_view.databinding.ListItemBinding

class MyAdapter(private val context: Context, private val dataList: ArrayList<MyDataModel>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

//        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
//        return MyViewHolder(view)

        val binding = ListItemBinding.inflate(LayoutInflater.from(context), parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.binding.image.setImageResource(dataList.get(position).profile)
        holder.binding.title.text = dataList.get(position).name
        holder.binding.desc.text = dataList.get(position).address

        holder.binding.container.setOnClickListener {
            Toast.makeText(context, dataList.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(var binding:ListItemBinding) : RecyclerView.ViewHolder(binding.root){

    }

//    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
//
//    }
}