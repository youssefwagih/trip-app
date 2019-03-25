package com.trip.tripboss

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.trip.tripboss.passengers.PassengersFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.contentFrame, PassengersFragment.newInstance())
                .addToBackStack(null)
                .commit()

    }
}
