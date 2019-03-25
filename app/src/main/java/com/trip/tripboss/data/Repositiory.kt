package com.trip.tripboss.data

import android.arch.lifecycle.LiveData
import com.trip.tripboss.data.models.Passenger

class Repositiory : IRepository {
    override fun getPassengers(): LiveData<List<Passenger>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}