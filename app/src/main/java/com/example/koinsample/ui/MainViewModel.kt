package com.example.koinsample.ui

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.koinsample.repositories.MainRepository
import timber.log.Timber

class MainViewModel constructor(
    private val repository: MainRepository
) : ViewModel() {


    init {
        Timber.d("Injecting Main ViewModel")
    }


    fun printSomething() {
        repository.print()
    }
}