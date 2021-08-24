package com.example.doctorbookingapp

import android.app.PendingIntent.getActivity
import android.icu.util.Calendar
import android.icu.util.TimeZone
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.FragmentManager
import com.google.android.material.button.MaterialButton
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import org.w3c.dom.Text
import java.util.*

class getDetails : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_details)

        val buttonPickDate: MaterialButton =findViewById(R.id.PickDate3)

        val textView: TextView = findViewById(R.id.textView)
        val outlinedTextField:com.google.android.material.textfield.TextInputLayout = findViewById(R.id.outlinedTextField)
        val buttonBookFinal: MaterialButton =findViewById(R.id.BookFinal)

        val slot1: Button =findViewById(R.id.slot1Button)

        val slot2: Button =findViewById(R.id.slot2Button)

        val slot3: Button =findViewById(R.id.slot3Button)

        val slot4: Button =findViewById(R.id.slot4Button)

        val textFieldName: Text =findViewById(R.id.Name)
        val textFieldEmail: Text =findViewById(R.id.EmailTextField)


        val fullName = textFieldName.wholeText.toString()


        var timeslot:String

        // picking the slots

        slot1.setOnClickListener {
            timeslot = slot1.text.toString()


        }
        slot2.setOnClickListener {
            timeslot = slot2.text.toString()

        }
        slot3.setOnClickListener {
            timeslot = slot3.text.toString()

        }
        slot4.setOnClickListener {
            timeslot = slot4.text.toString()

        }




        buttonPickDate.setOnClickListener {

            // Create the date picker builder and set the title
            val builder = MaterialDatePicker.Builder.datePicker()
                .also {
                    var title = "Pick Date"
                }


            // create the date picker

            val constraintsBuilder = CalendarConstraints.Builder().setValidator(
                DateValidatorPointForward.now())
            val datePicker = builder.setCalendarConstraints(constraintsBuilder.build()).build()
            // set listener when date is selected
            datePicker.addOnPositiveButtonClickListener {

                // Create calendar object and set the date to be that returned from selection
                val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
                calendar.time = Date(it)

                var datePicked = """${calendar.get(Calendar.DAY_OF_MONTH)}- ${calendar.get(Calendar.MONTH) + 1}-${calendar.get(
                    Calendar.YEAR)}"""
                textView.setText(datePicked)

            }
           val fm: FragmentManager = supportFragmentManager
            datePicker.show(fm,"string")

        }

        //validating email

        val Email = textFieldEmail.wholeText.toString()

        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        if (!Email.matches(emailPattern.toRegex())){
            val error = "Enter valid email"
            outlinedTextField.error=error
        }

        else {
            outlinedTextField.error = null
        }

        //Final book appointment action

        buttonBookFinal.setOnClickListener {


//       TODO    send email , display another screen / popup


        }
    }
}