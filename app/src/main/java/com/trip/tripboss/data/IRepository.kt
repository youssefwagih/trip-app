package com.trip.tripboss.data

import android.arch.lifecycle.LiveData
import com.trip.tripboss.data.models.Passenger

interface IRepository {
    fun getPassengers(): LiveData<List<Passenger>>

}