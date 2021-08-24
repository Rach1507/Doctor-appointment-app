package com.example.doctorbookingapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.fragment.app.FragmentContainer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.doctorbookingapp.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.list_item, container, false)


      /* view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mySecondFragment_to_myThirdFragment)
        }*/
        val moveTOList: Button=view.findViewById(R.id.buttonBook)

        moveTOList.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_docListFragment_to_secondBlankFragment)
        }


        return view
    }


    }


