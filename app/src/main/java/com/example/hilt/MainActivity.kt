package com.example.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var animal: Animal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animal.speek()
        animal.dogSpeek()
    }
}

class Animal @Inject constructor(private val dog: Dog) {

    fun speek() {
        println(" I can speek");
    }

    fun dogSpeek() {
        dog.speekYourlanguage()
    }

}

class Dog @Inject constructor() {

    fun speekYourlanguage() {
        println("speeking : bhaooo bhao")
    }
}
