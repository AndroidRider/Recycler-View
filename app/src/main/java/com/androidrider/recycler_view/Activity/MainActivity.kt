package com.androidrider.recycler_view.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidrider.recycler_view.Adapters.MyAdapter
import com.androidrider.recycler_view.Constant
import com.androidrider.recycler_view.Models.DataModel
import com.androidrider.recycler_view.R
import com.androidrider.recycler_view.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter
    var data = ArrayList<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.lvToolbar
        toolbar.setTitle("Recycler View")
        setSupportActionBar(toolbar)

        // below line is to add data to our array list.
        data.add(DataModel("DSA", "DSA Self Paced Course", R.drawable.ruby_logo))
        data.add(DataModel("JAVA", "JAVA Self Paced Course", R.drawable.rails_logo))
        data.add(DataModel("C++", "C++ Self Paced Course", R.drawable.cplus_logo))
        data.add(DataModel("Python", "Python Self Paced Course", R.drawable.cplus_logo))
        data.add(DataModel("Rails","Rails Self Paced Course",R.drawable.rails_logo))
        data.add(DataModel("Fork CPP","Fork CPP Self Paced Course",R.drawable.cplus_logo))
        data.add(DataModel("Kotlin","Kotlin Self Paced Course",R.drawable.kotlin_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))
        data.add(DataModel("Ruby","Ruby Self Paced Course",R.drawable.ruby_logo))


        recyclerView = binding.recyclerView

        // initializing our adapter class.
        myAdapter = MyAdapter(this, data)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = myAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_item, menu)
        val search = menu.findItem(R.id.search_action)
        val searchView = search.actionView as SearchView
//        val searchView = searchItem.actionView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String): Boolean {
                filter(newText)
                return true
            }
        })
        return true
    }

    private fun filter(text: String) {
        val filteredList = ArrayList<DataModel>()

        if (text.isBlank()) {
            // If search query is blank, show all items
            filteredList.addAll(data)
        } else {
            for (item in data) {
                if (item.title.lowercase(Locale.ROOT).contains(text.lowercase(Locale.getDefault()))) {
                    filteredList.add(item)
                }
            }
        }

        val noResultsTextView = binding.lvEmptyView
        if (filteredList.isEmpty()) {
            recyclerView.visibility = View.GONE
            noResultsTextView.visibility = View.VISIBLE
            noResultsTextView.text = "No Results Found"
        } else {
            recyclerView.visibility = View.VISIBLE
            noResultsTextView.visibility = View.GONE
            myAdapter.filterList(filteredList)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.defRv -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
