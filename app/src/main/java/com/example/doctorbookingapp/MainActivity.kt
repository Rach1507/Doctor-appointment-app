package com.example.doctorbookingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorbookingapp.dummy.DataSource
import java.util.*


class MainActivity : AppCompatActivity()  {


     final var DocRV: RecyclerView? = null

    private lateinit var blogAdapter: myAdapter

    // below line is for setting a layout manager for our recycler view.
    // here we are creating vertical list so we will provide orientation as vertical
    val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    // Arraylist for storing data
    private var courseModelArrayList: ArrayList<CourseModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       initRecyclerView()
        addDataSet()



        //var Recmail="tarunsraina@gmail.com"    // take receivers email through edittext
       //SendMail(Recmail)                       // call constructor

    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        findViewById<RecyclerView>(R.id.idRVCourse).apply {

            layoutManager = LinearLayoutManager(this@MainActivity)
            blogAdapter = myAdapter()
            findViewById<RecyclerView>(R.id.idRVCourse).adapter = blogAdapter
        }


        }
}
//            val navController = Navigation.findNavController(this, R.id.nav_host_fragment_container)

//        //onLocation
//        val inputText = outlinedTextField.editText?.text.toString()
//
//        outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
//
//
//
//
//
//
//
//
//        val items: List<String> = listOf("Bengaluru", "Mysuru", "Shimoga", "Chikmagalore")
//        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items)
//        (textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)






