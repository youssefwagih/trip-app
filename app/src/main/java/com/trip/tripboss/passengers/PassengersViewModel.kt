package com.trip.tripboss.passengers

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import com.trip.tripboss.data.IRepository
import com.trip.tripboss.data.Repositiory
import com.trip.tripboss.data.models.Passenger

class PassengersViewModel(val context: Context) : ViewModel() {
    val repositiory: IRepository = Repositiory()

    fun getPassengers(): LiveData<List<Passenger>> {
        return repositiory.getPassengers()
    }

    class Factory(val context: Context) : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {

            return PassengersViewModel(context) as T
        }
    }

}