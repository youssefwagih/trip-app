package com.trip.tripboss.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trip.tripboss.R
import com.trip.tripboss.data.models.Passenger
import kotlinx.android.synthetic.main.passenger_list_item.view.*

class PassengersAdapter(val context: Context?, val passengersList : ArrayList<Passenger>) : RecyclerView.Adapter<PassengersAdapter.PassengersViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PassengersViewHolder {
        return PassengersViewHolder(LayoutInflater.from(context).inflate(R.layout.passenger_list_item, p0, false))
    }

    override fun getItemCount(): Int {
        return passengersList.size
    }

    override fun onBindViewHolder(passengersViewHolder: PassengersViewHolder, position: Int) {
        passengersViewHolder.itemView.NameTextView.text = passengersList.get(position).name
        passengersViewHolder.itemView.paidValueTextView.text = passengersList.get(position).paidValue.toString()
    }

    class PassengersViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }
}
