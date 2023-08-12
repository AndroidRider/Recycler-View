package com.androidrider.recycler_view.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.androidrider.recycler_view.Models.mDataModel
import com.androidrider.recycler_view.databinding.ListItemBinding

class mAdapter(private val context: Context, private val dataList: ArrayList<mDataModel>):
    RecyclerView.Adapter<mAdapter.MyViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

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
        // No any variable initialized because binding used.
        //but this class is very important
    }


}