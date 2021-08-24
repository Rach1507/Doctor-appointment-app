package com.example.doctorbookingapp

data class CourseModel    // Constructor
    (// Getter and Setter
   private var name: String,private var spl: String, private var DocImage: Int
) {


    fun setName(name: String){
        this.name=name
    }

    fun setspl(spl: String){
        this.spl=spl
    }
    fun setImage(DocImage: Int) {
        this.DocImage = DocImage
    }
    fun getImage(): Int {
        return this.DocImage
    }
    fun getName(): String {
        return this.name
    }
    fun getSpl(): String {
        return this.spl
    }
}