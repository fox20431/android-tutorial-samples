package com.hihusky.viewmodeldemo.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.*
import com.hihusky.livedatademo.R
import com.hihusky.viewmodeldemo.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = findViewById<TextView>(R.id.text)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        textView.text = viewModel.counter.toString()

        findViewById<Button>(R.id.button).setOnClickListener {
            ++viewModel.counter
            textView.text = viewModel.counter.toString()
        }

    }


}