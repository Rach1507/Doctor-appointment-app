package com.example.doctorbookingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class CategoriesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)


        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mySecondFragment_to_myThirdFragment)
        }
        val moveTOList: Button=view.findViewById(R.id.containedButton1)

        moveTOList.setOnClickListener(){
            it.findNavController().navigate(R.id.action_mySecondFragment_to_myThirdFragment)
        }


        return view
    }
}
