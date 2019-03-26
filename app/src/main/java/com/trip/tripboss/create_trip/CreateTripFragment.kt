package com.trip.tripboss.create_trip

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trip.tripboss.R
import com.trip.tripboss.passengers.PassengersActivity
import com.trip.tripboss.passengers.PassengersFragment
import kotlinx.android.synthetic.main.fragment_create_trip.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [CreateTripFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [CreateTripFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class CreateTripFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_trip, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        createTripButton.setOnClickListener({
            startActivity(Intent(activity,PassengersActivity::class.java))
        })
    }


    companion object {
        @JvmStatic
        fun newInstance() = CreateTripFragment()
    }
}
