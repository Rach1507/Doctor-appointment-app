package com.example.doctorbookingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.doctorbookingapp.R.id.submit_button as submit_button1


class LocationFragmentMain: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.location_fragment_main, container, false)

view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_myHomeFragment_to_myCategoryFragment)
        }
//        val button: Button= findViewById(R.id.submit_button)
//        button.setOnClickListener {
//            it.findNavController(view).navigate(R.id.action_myHomeFragment_to_myCategoryFragment)

        return view
        }



    }

