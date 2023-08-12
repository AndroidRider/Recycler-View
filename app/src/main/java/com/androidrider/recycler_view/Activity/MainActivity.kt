package com.androidrider.recycler_view.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
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

        // Change overflow icon color programmatically
        val overflowIcon = toolbar.overflowIcon
        overflowIcon?.setTint(ContextCompat.getColor(this, R.color.white))

        // below line is to add data to our array list.
        data.add(DataModel("C", "C Programming Language", R.drawable.c_logo))
        data.add(DataModel("C++", "C++ Programming Language", R.drawable.cplus_logo))
        data.add(DataModel("C#", "C# Programming Language", R.drawable.c_sharp_logo))
        data.add(DataModel("Java", "Java Programming Language", R.drawable.java_logo))
        data.add(DataModel("Kotlin", "Kotlin Programming Language", R.drawable.kotlin_logo))
        data.add(DataModel("Python", "Python Programming Language", R.drawable.python_logo))
        data.add(DataModel("Ruby", "Ruby Programming Language", R.drawable.ruby_logo))
        data.add(DataModel("Hadoop", "Hadoop Programming Language", R.drawable.hadoop_logo))
        data.add(DataModel("PHP", "PHP Programming Language", R.drawable.php_logo))
        data.add(DataModel("Rails", "Rails Programming Language", R.drawable.rails_logo))
        data.add(DataModel("JavaScript", "JavaScript Programming Language", R.drawable.javascript_logo))
        data.add(DataModel("Perl", "Perl Programming Language", R.drawable.perl_logo))
        data.add(DataModel(".NET", ".NET Programming Language", R.drawable.dot_net_logo))
        data.add(DataModel("Ajax", "Ajax Programming Language", R.drawable.ajax_logo))
        data.add(DataModel("Scala", "Scala Programming Language", R.drawable.scala_logo))
        data.add(DataModel("Objective-C", "Objective-C Programming Language", R.drawable.objective_c_logo))
        data.add(DataModel("Haskell", "Haskell Programming Language", R.drawable.haskell_logo))
        data.add(DataModel("SQL", "SQL Programming Language", R.drawable.sql_logo))
        data.add(DataModel("Rust", "Rust Programming Language", R.drawable.rust_logo))
        data.add(DataModel("HTML", "HTML Programming Language", R.drawable.html_logo))
        data.add(DataModel("Ada", "Ada Programming Language", R.drawable.ada_logo))
        data.add(DataModel("Lisp", "Lisp Programming Language", R.drawable.lisp_logo))
        data.add(DataModel("Fortran", "Fortran Programming Language", R.drawable.fortran_logo))
        data.add(DataModel("Swift", "Swift Programming Language", R.drawable.swift_logo))
        data.add(DataModel("TypeScript", "TypeScript Programming Language", R.drawable.typescript_logo))
        data.add(DataModel("COBOL", "COBOL Programming Language", R.drawable.cobol_logo))
        data.add(DataModel("Assembly Language", "Assembly Programming Language", R.drawable.assembly_language_logo))
        data.add(DataModel("Dart", "Dart Programming Language", R.drawable.dart_logo))
        data.add(DataModel("Go", "Go Programming Language", R.drawable.go_logo))
        data.add(DataModel("R", "R Programming Language", R.drawable.r_logo))
        data.add(DataModel("MatLab", "MatLab Programming Language", R.drawable.matlab_logo))
        data.add(DataModel("NoSQL", "NoSQL Programming Language", R.drawable.nosql_logo))

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
