package com.example.desserttimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import timber.log.Timber

const val KEY_REVENUE = "key_revenue"
class MainActivity : AppCompatActivity() {

    private lateinit var dessertTimer: DessertTimer

    private var revenue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dessertTimer = DessertTimer(this.lifecycle)

        if(savedInstanceState != null) {
            revenue = savedInstanceState.getInt(KEY_REVENUE)
        }

        revenue = 100
    }

    override fun onStart() {
        super.onStart()
        // Timber.i("onStart called")
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_REVENUE, revenue)
        Timber.i("onSaveInstanceState called")
    }

}
