package com.androidrider.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidrider.recycler_view.Adapters.MyAdapter
import com.androidrider.recycler_view.Models.MyDataModel
import com.androidrider.recycler_view.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: MyAdapter
    lateinit var dataList: ArrayList<MyDataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList = ArrayList()

        dataList.add(MyDataModel(R.drawable.c_logo, "C", "C Programming Language"))
        dataList.add(MyDataModel(R.drawable.cplus_logo, "C++", "C++ Programming Language"))
        dataList.add(MyDataModel(R.drawable.java_logo, "Java", "Java Programming Language"))
        dataList.add(MyDataModel(R.drawable.kotlin_logo, "Kotlin", "Kotlin Programming Language"))
        dataList.add(MyDataModel(R.drawable.python_logo, "Python", "Python Programming Language"))
        dataList.add(MyDataModel(R.drawable.ruby_logo, "Ruby", "Ruby Programming Language"))
        dataList.add(MyDataModel(R.drawable.hadoop_logo, "Hadoop", "Hadoop Programming Language"))
        dataList.add(MyDataModel(R.drawable.php_logo, "PHP", "PHP Programming Language"))
        dataList.add(MyDataModel(R.drawable.rails_logo, "Rails", "Rails Programming Language"))
        dataList.add(MyDataModel(R.drawable.javascript_logo, "Java Script", "Java Script Programming Language"))
        dataList.add(MyDataModel(R.drawable.perl_logo, "Perl", "Perl Programming Language"))
        dataList.add(MyDataModel(R.drawable.dot_net_logo, ".Net", ".Net Programming Language"))
        dataList.add(MyDataModel(R.drawable.ajax_logo, "Ajax", "Ajax Programming Language"))
//        dataList.add(MyDataModel(R.drawable.ruby_logo, "", ""))



        myAdapter = MyAdapter(this, dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recyclerView.adapter = myAdapter
    }
}