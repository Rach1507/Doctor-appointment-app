package com.example.doctorbookingapp.dummy

import com.example.doctorbookingapp.CourseModel
import com.example.doctorbookingapp.R

class DataSource {

    companion object{
        fun createDataSet(): ArrayList<CourseModel>{
            val list=ArrayList<CourseModel>()

            list.add(

                CourseModel(
                    "Subramanyan","Dermatology", R.drawable.doc1
                )
            )
            list.add(
                CourseModel(
                    "Devi shetty", "radiology", R.drawable.doc6
                )
            )
            list.add(
                CourseModel(
                    "Ashok rajgopal", "opthamology", R.drawable.doc3
                )
            )
            list.add(

                CourseModel(
                    "Mohammed rela", "oncology", R.drawable.doc4
                )
            )
            list.add(
                CourseModel(
                    "ramakantha panda", "Pediatrics", R.drawable.doc5
                )
            )
            list.add(
                CourseModel(
                    "Girish kannavalli", "Cardiology", R.drawable.doc7
                )
            )
            list.add(

                CourseModel(
                    "indira hunuja", "Pathology", R.drawable.docn
                )
            )
            list.add(
                CourseModel(
                    "Subramanyan","Dermatology", R.drawable.doc8
                )
            )
            list.add(
                CourseModel(
                    "Devika nair", "radiology", R.drawable.docn
                )
            )
            list.add(
                CourseModel(
                    "Ashok chandra", "opthamology", R.drawable.doc9
                )
            )
            list.add(
                CourseModel(
                    "Mohammed rahim", "oncology", R.drawable.docmoh
                )
            )
            list.add(
                CourseModel(
                    "ramakrishna", "Pediatrics", R.drawable.doc10
                )
            )
            list.add(
                CourseModel(
                    "Gokhale TR", "Cardiology", R.drawable.doc11
                )
            )
            list.add(
                CourseModel(
                    "mukharjee K", "Pathology", R.drawable.doc12
                )
            )
            list.add(
                CourseModel(
                    "Shekhar kumar","Dermatology", R.drawable.doc13
                )
            )
            list.add(
                CourseModel(
                    "Alok sharma", "radiology", R.drawable.doc14
                )
            )
            list.add(
                CourseModel(
                    "Devi nagavalli", "opthamology", R.drawable.doc6
                )
            )
            list.add(
                CourseModel(
                    "Srikanth", "oncology", R.drawable.doc15
                )
            )
            list.add(
                CourseModel(
                    "Vijay", "Pediatrics", R.drawable.doc16
                )
            )
            list.add(
                CourseModel(
                    "rahul krishna", "Cardiology", R.drawable.doc19
                )
            )
            list.add(
                CourseModel(
                    "Sachin", "Pathology", R.drawable.doc20
                )
            )



            list.shuffle()

            return list
        }
    }
}