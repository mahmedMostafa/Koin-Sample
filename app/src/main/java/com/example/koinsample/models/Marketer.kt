package com.example.koinsample.models

import timber.log.Timber

data class Marketer(
    var age: Int = 10,
    var name: String = "",
    var experience: Int = 4
) {
    init {
        Timber.d("Initializing Marketer")
    }
}