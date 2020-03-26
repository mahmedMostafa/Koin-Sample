package com.example.koinsample.di

import com.example.koinsample.ui.MainViewModel
import org.koin.dsl.module

/*
    here we include all of our viewmodels
 */
val viewModelModule = module {

    //we call again get to get the main repository for us
    single { MainViewModel(get()) }
}