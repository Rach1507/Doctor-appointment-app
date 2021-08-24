package com.example.doctorbookingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import java.io.File
import com.example.doctorbookingapp.R.id.submit_button as submit_button1


class LocationFragmentMain: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.location_fragment_main, container, false)

        view.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_myHomeFragment_to_myCategoryFragment)
            // Navigation.findNavController(view).navigate(R.id.action_locationFragment_to_secondBlankFragment)
        }
        val button: Button = view.findViewById(R.id.submit_button)
        button.setOnClickListener {
            it.findNavController().navigate(R.id.action_myHomeFragment_to_myCategoryFragment)
          /*  val loc:EditText=view.findViewById(R.id.locationField)
            val fileName="data.txt"
            val file= File(fileName)
            file.createNewFile()
            file.writeText(loc.toString()+"\n")*/


        }

        return view

    }
}

