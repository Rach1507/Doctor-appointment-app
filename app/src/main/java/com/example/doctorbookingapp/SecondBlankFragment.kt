package com.example.myapplication

import android.app.ProgressDialog.show
import android.content.Context
import android.icu.util.Calendar
import android.icu.util.TimeZone
import android.net.Credentials
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import com.example.doctorbookingapp.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.snackbar.Snackbar
import java.lang.RuntimeException
import com.google.android.material.textfield.TextInputEditText as Text
import java.util.*



class SecondBlankFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second_blank, container, false)

       /* val moveTOList: Button = view.findViewById(R.id.slot1Button)

        moveTOList.setOnClickListener() {
            it.findNavController().navigate(R.id.action_secondBlankFragment_to_finalfragment)
        }*/

        val buttonPickDate: MaterialButton = view.findViewById(R.id.PickDate3)

        val textView: TextView = view.findViewById(R.id.textView)
        val outlinedTextField: com.google.android.material.textfield.TextInputLayout =
            view.findViewById(R.id.outlinedTextField)
        val buttonBookFinal: MaterialButton = view.findViewById(R.id.BookFinal)

        val slot1: Button = view.findViewById(R.id.slot1Button)

        val slot2: Button = view.findViewById(R.id.slot2Button)

        val slot3: Button = view.findViewById(R.id.slot3Button)

        val slot4: Button = view.findViewById(R.id.slot4Button)

        val textFieldEmail: Text = view.findViewById(R.id.Name)
        val textFieldName: Text =view.findViewById(R.id.EmailTextField)


        //  val fullName = textField.Name.wholeText.toString()


        var timeslot: String

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

            val constraintsBuilder =
                CalendarConstraints.Builder().setValidator(DateValidatorPointForward.now())
            val datePicker = builder.setCalendarConstraints(constraintsBuilder.build()).build()
            // set listener when date is selected
            datePicker.addOnPositiveButtonClickListener {

                // Create calendar object and set the date to be that returned from selection
                val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
                calendar.time = Date(it)

                var datePicked =
                    """${calendar.get(Calendar.DAY_OF_MONTH)}- ${calendar.get(Calendar.MONTH) + 1}-${
                        calendar.get(Calendar.YEAR)
                    }"""
                textView.setText(datePicked)

            }
              val fm: FragmentManager = (getActivity() as AppCompatActivity).supportFragmentManager
            //val fm: FragmentManager = getActivity().supportFragmentManager
             datePicker.show(fm, "MyTAG")

         }

            //validating email

        val fullName = textFieldName.text.toString()

        val Email = textFieldEmail.text.toString()

          /*  val Email = textFieldEmail.wholeText.toString()

            val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

            if (!Email.matches(emailPattern.toRegex())) {
                val error = "Enter valid email"
                outlinedTextField.error = error
            } else {
                outlinedTextField.error = null
            }*/

            //Final book appointment action
          /*  open class AppExecutors(
                private val diskIO: Executor,
                private val networkIO: Executor,
                private val mainThread: Executor
            ) {
                constructor(): this(
                    Executors.newSingleThreadExecutor(),
                    Executors.newFixedThreadPool(3),
                    MainThreadExecutor()
                )

                fun diskIO(): Executor {
                    return diskIO
                }

                fun networkIO(): Executor {
                    return networkIO
                }

                fun mainThread(): Executor {
                    return mainThread
                }

                private inner class MainThreadExecutor : Executor {
                    private val mainThreadHandler = Handler(Looper.getMainLooper())
                    override fun execute(command: Runnable) {
                        mainThreadHandler.post(command)
                    }
                }
            }

        lateinit var appExecutors: AppExecutors


            fun onAttach(context: Context?) {
                appExecutors = AppExecutors()
                super.onAttach(context)
            }*/
            buttonBookFinal.setOnClickListener {


             /*   val gmail:String="tarunsraina483@gmail.com"
                val pass:String="blacy728"
                val msg:String="Appointment confirmed on "+textView.text.toString()+ " your doctor is "+" Dr. Prashnath Simha."
                var props=Properties()
                props.put("mail.smtp.auth","true")
                props.put("mail.smtp.starttls.enable","true")
                props.put("mail.smtp.host","smtp.gmail.com")
                props.put("mail.smtp.port","587")

                var session=Session.getInstance(props,object:javax.mail.Authenticator(){
                    override fun getPasswordAuthentication(): PasswordAuthentication {
                        return PasswordAuthentication(gmail,pass)
                    }
                } )

                try{
                    var message=MimeMessage(session)
                    message.setFrom(InternetAddress(gmail))
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(Email))
                    message.setSubject("Sending gmail without opening gmail")
                    message.setText(msg)
                    Transport.send(message)
                }
                catch (e:MessagingException)
                {
                    throw RuntimeException()
                }*/
                val moveTOList: Button = view.findViewById(R.id.BookFinal)


                moveTOList.setOnClickListener() {

                    val email = textFieldEmail.text.toString()
                    it.findNavController().navigate(R.id.action_secondBlankFragment_to_finalfragment)

                    if( !TextUtils.isEmpty(email) ){
                  //  if(!textFieldEmail.text.toString().equals(""))
                    //{



//              TODO all the other code for navigating to other fragment
                    }
                    else {

                        val error = "Enter valid email"


                        Snackbar.make(view, error, Snackbar.LENGTH_SHORT).show()
                     //   val contextView = view.findViewById<View>(R.id.)

                       /* val s="Enter valid email address"

                        Snackbar.make(view.context, R.string., Snackbar.LENGTH_SHORT)
                            .show()
                        val toast = Toast.makeText(view.context, "Enter valid email address", Toast.LENGTH_LONG)
                        toast.show()*/

//               val error = "Enter valid email"
//               outlinedTextField.error=error
                    }



                }


                //       TODO    send email , display another screen / popup


            }



            return view
        }

    }
