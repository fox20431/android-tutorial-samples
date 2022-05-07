package com.hihusky.livedatademo.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.*
import com.hihusky.livedatademo.R
import com.hihusky.livedatademo.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var viewModel: MainViewModel
    lateinit var textView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textView = findViewById(R.id.text)
        viewModel = ViewModelProvider(this, /*匿名对象*/object: ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(0) as T
            }
        })[MainViewModel::class.java]
        textView.text = viewModel.counter.value.toString()

        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.plusOne()
        }

        viewModel.counter.observe(this, Observer { count ->
            textView.text = count.toString()
        })

    }


}