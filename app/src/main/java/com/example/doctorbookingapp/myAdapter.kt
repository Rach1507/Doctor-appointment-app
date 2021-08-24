package com.example.doctorbookingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class myAdapter  :RecyclerView.Adapter<RecyclerView.ViewHolder>(){



    private var items: List<CourseModel> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CourseModelViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        )


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CourseModelViewHolder ->{
                holder.bind(items.get(position))

            }


        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(bloglist: List<CourseModel>){
        items=bloglist
    }
    class CourseModelViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val DocName = itemView.findViewById<TextView>(R.id.doc_name)
        val DocImage = itemView.findViewById<ImageView>(R.id.doc_image)
        val DocSpl = itemView.findViewById<TextView>(R.id.doc_spl)



/*

        init {

            itemView.setOnClickListener(this){ View ->
                val position: Int = adapterPosition
                Toast.makeText(
                    itemView.context,
                    " ${DocName} accepted your appointment",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
*/
        


        fun bind(blogPost: CourseModel){
            DocName.setText(blogPost.getName())
            DocSpl.setText(blogPost.getSpl())
            DocImage.setImageResource(blogPost.getImage())



        }


    }

}