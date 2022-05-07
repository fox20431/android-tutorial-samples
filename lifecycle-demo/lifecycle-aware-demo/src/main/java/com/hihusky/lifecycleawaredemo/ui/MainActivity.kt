package com.hihusky.lifecycleawaredemo.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.hihusky.livedatademo.R

const val TAG = "MyObserver"

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    class MyObserver : DefaultLifecycleObserver {
        override fun onCreate(owner: LifecycleOwner) {
            Log.d(TAG,"created")
        }
        override fun onStart(owner: LifecycleOwner) {
            Log.d(TAG,"start")
        }
        override fun onStop(owner: LifecycleOwner) {
            Log.d(TAG,"stop")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyObserver())
    }


}