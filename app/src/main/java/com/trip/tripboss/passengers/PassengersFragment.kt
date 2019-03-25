package com.trip.tripboss.passengers

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trip.tripboss.R
import com.trip.tripboss.adapters.PassengersAdapter
import com.trip.tripboss.data.models.Passenger
import kotlinx.android.synthetic.main.fragment_passengers.*
import kotlinx.android.synthetic.main.fragment_passengers.view.*

class PassengersFragment : Fragment() {
    private var root: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_passengers, container, false)  // initialize it here
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val passengersList: ArrayList<Passenger> = ArrayList<Passenger>()

        passengersList.add(Passenger("Youssef", 50f))
        passengersList.add(Passenger("Ahmed", 80f))
        passengersList.add(Passenger("Hassan", 30f))

        rv_passengers_list.layoutManager = LinearLayoutManager(context)
        rv_passengers_list.adapter = PassengersAdapter(context, passengersList)

    }


    companion object {
        @JvmStatic
        fun newInstance() = PassengersFragment()
    }
}
