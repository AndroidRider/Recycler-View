package com.androidrider.recycler_view

import com.androidrider.recycler_view.Models.DataModel
import com.androidrider.recycler_view.Models.mDataModel

object Constant {

    var dataList = ArrayList<mDataModel>() // second data

    fun fetchData(): ArrayList<mDataModel>{

        dataList.add(mDataModel(R.drawable.c_logo, "C", "C Programming Language"))
        dataList.add(mDataModel(R.drawable.cplus_logo, "C++", "C++ Programming Language"))
        dataList.add(mDataModel(R.drawable.c_sharp_logo, "C#", " C# Programming Language"))
        dataList.add(mDataModel(R.drawable.java_logo, "Java", "Java Programming Language"))
        dataList.add(mDataModel(R.drawable.kotlin_logo, "Kotlin", "Kotlin Programming Language"))
        dataList.add(mDataModel(R.drawable.python_logo, "Python", "Python Programming Language"))
        dataList.add(mDataModel(R.drawable.ruby_logo, "Ruby", "Ruby Programming Language"))
        dataList.add(mDataModel(R.drawable.hadoop_logo, "Hadoop", "Hadoop Programming Language"))
        dataList.add(mDataModel(R.drawable.php_logo, "PHP", "PHP Programming Language"))
        dataList.add(mDataModel(R.drawable.rails_logo, "Rails", "Rails Programming Language"))
        dataList.add(mDataModel(R.drawable.javascript_logo, "Java Script", "Java Script Programming Language"))
        dataList.add(mDataModel(R.drawable.perl_logo, "Perl", "Perl Programming Language"))
        dataList.add(mDataModel(R.drawable.dot_net_logo, ".Net", ".Net Programming Language"))
        dataList.add(mDataModel(R.drawable.ajax_logo, "Ajax", "Ajax Programming Language"))
        dataList.add(mDataModel(R.drawable.scala_logo, "Scala", "Scala Programming Language"))
        dataList.add(mDataModel(R.drawable.objective_c_logo, "Objective-C", "Objective-C Programming Language"))
        dataList.add(mDataModel(R.drawable.haskell_logo, "Haskell", "Haskell Programming Language"))
        dataList.add(mDataModel(R.drawable.sql_logo, "SQL", "SQL Programming Language"))
        dataList.add(mDataModel(R.drawable.rust_logo, "Rust", "Rust Programming Language"))
        dataList.add(mDataModel(R.drawable.html_logo, "HTML", "HTML Programming Language"))
        dataList.add(mDataModel(R.drawable.ada_logo, "Ada", "Ada Programming Language"))
        dataList.add(mDataModel(R.drawable.lisp_logo, "Lisp", "Lisp Programming Language"))
        dataList.add(mDataModel(R.drawable.fortran_logo, "Fortran", "Fortran Programming Language"))
        dataList.add(mDataModel(R.drawable.swift_logo, "Swift", "Swift Programming Language"))
        dataList.add(mDataModel(R.drawable.typescript_logo, "TypeScript", "TypeScript Programming Language"))
        dataList.add(mDataModel(R.drawable.cobol_logo, "COBOl", "COBOl Programming Language"))
        dataList.add(mDataModel(R.drawable.assembly_language_logo, "Assembly language", "Assembly Programming Language"))
        dataList.add(mDataModel(R.drawable.dart_logo, "Dart", "Dart Programming Language"))
        dataList.add(mDataModel(R.drawable.go_logo, "Go", "Go Programming Language"))
        dataList.add(mDataModel(R.drawable.r_logo, "R", "R Programming Language"))
        dataList.add(mDataModel(R.drawable.matlab_logo, "MatLab", "MatLab Programming Language"))
        dataList.add(mDataModel(R.drawable.nosql_logo, "NoSQL", "NoSQL Programming Language"))
//        dataList.add(mDataModel(R.drawable.ruby_logo, "", "Programming Language"))

        return dataList
    }

}