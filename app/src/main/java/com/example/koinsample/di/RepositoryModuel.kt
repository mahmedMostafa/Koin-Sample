package com.example.koinsample.di

import com.example.koinsample.repositories.MainRepository
import org.koin.dsl.module
/*
   we would include all of our repositories here
*/
val repositoryModule = module {

    //we call get to inform koin that there is a parameter which needs to be passed
    //and koin is smart enough to get it from its object graph
    single { MainRepository(get(),get()) }
}