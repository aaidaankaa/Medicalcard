package com.example.medicalcard.models

import java.io.Serializable

data class MedicalCard(
    var id: String,
    var fullName: String,
    var birthDate: String,
    var gender: String,
    var bloodGroup: String,
    var address: String?
) : Serializable


