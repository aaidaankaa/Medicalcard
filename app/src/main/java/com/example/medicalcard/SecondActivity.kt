package com.example.medicalcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.medicalcard.models.MedicalCard

class SecondActivity : AppCompatActivity() {
    
    lateinit var idS: TextView
    lateinit var fullNameS: TextView
    lateinit var birthDateS: TextView
    lateinit var genderS: TextView
    lateinit var bloodGroupS: TextView
    lateinit var addressS: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        
        idS = findViewById(R.id. idS)
        fullNameS = findViewById(R.id.fullNameS)
        birthDateS = findViewById(R.id.birthDateS)
        genderS = findViewById(R.id. genderS)
        bloodGroupS = findViewById(R.id.bloodGroupS)
        addressS = findViewById(R.id.addressS)
        
        
        val medicalCard = intent.getSerializableExtra("MEDICALCARD") as MedicalCard
        
        
        idS.text = medicalCard.id
        fullNameS.text = medicalCard.fullName
        birthDateS.text = medicalCard.birthDate
        genderS.text = medicalCard.gender
        bloodGroupS.text = medicalCard.bloodGroup
        addressS.text = medicalCard.address
        
    }
}