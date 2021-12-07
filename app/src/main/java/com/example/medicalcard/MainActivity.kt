package com.example.medicalcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.medicalcard.models.MedicalCard

class MainActivity : AppCompatActivity() {

    var medicalCard: MedicalCard?= null
    lateinit var id: EditText
    lateinit var btn:Button
    lateinit var fullName: EditText
    lateinit var birthDate: EditText
    lateinit var gender: EditText
    lateinit var bloodGroup: EditText
    lateinit var address: EditText





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        id = findViewById(R.id.id)
        fullName = findViewById(R.id.fullName)
        birthDate = findViewById(R.id.birthDate)
        gender = findViewById(R.id.gender)
        bloodGroup = findViewById(R.id.bloodGroup)
        address= findViewById(R.id.address)

        btn.setOnClickListener {
            val id = id.text.toString()
            val fullName = fullName.text.toString()
            val birthDate = birthDate.text.toString()
            val gender = gender.text.toString()
            val bloodGroup = bloodGroup.text.toString()
            val address = address.text.toString()

            val medicalCard: MedicalCard =
                MedicalCard(id, fullName, birthDate, gender, bloodGroup, address)

        val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("MEDICALCARD", medicalCard)
            startActivity(intent)
        }


        //medicalCard= MedicalCard (
          //  id = "aidanka07",
          //  fullName = "Aidana AKibaeva",
           // birthDate = Date(),
         //   gender = "female",
          //  bloodGroup = "2",
           // addressS = "Samanchina 1",
           // vacHistory = arrayListOf(
            //    Vaccine(
             //       vacName = "Корь",
             //       date = Date(),
            //       addressS = "Советская 1")),
          //  sicknessHistory = arrayListOf(
           //     Sickness(
                 //   name = "Ветрянка",
                 //   date = Date(),
                 //   status = "Отрицательный",
                 //   bloodType = "2",
                 //   addressS = "Советская 4"
               // )))





    }


    }
