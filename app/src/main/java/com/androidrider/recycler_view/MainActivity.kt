package com.androidrider.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidrider.recycler_view.Adapters.MyAdapter
import com.androidrider.recycler_view.Constant.dataList
import com.androidrider.recycler_view.Models.MyDataModel
import com.androidrider.recycler_view.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)






        myAdapter = MyAdapter(this, Constant.getData())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recyclerView.adapter = myAdapter
    }
}