package com.example.koinsample.repositories

import com.example.koinsample.models.Designer
import com.example.koinsample.models.Programmer
import timber.log.Timber

class MainRepository(
    private val programmer: Programmer,
    private val designer: Designer
) {


init {
    Timber.d("Injecting Main Repository")
}

    fun print(){
        Timber.d("This is a programmer ${programmer} , and a designer ${designer}")
    }
}