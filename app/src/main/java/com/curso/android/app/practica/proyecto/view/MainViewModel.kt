package com.curso.android.app.practica.proyecto.view

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun compareTexts(text1: String, text2: String): Boolean {
        return text1 == text2
    }
}
