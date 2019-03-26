package com.trip.tripboss.passengers

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import com.trip.tripboss.R
import com.trip.tripboss.create_trip.CreateTripFragment

class PassengersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.contentFrame, PassengersFragment.newInstance())
                .addToBackStack(null)
                .commit()

    }
}
