package com.example.koinsample.di

import com.example.koinsample.models.Designer
import com.example.koinsample.models.Marketer
import com.example.koinsample.models.Programmer
import org.koin.dsl.module


val teamModule = module {

    //this is to create objects every time it gets called unlike single which creates a singleton
    //it's just like telling koin create a new instance of this service anywhere the service is required
    //this is just for demonstration purposes
    factory { Programmer() }

    //again for demonstration purposes
    single { Designer() }


    //we will do field injection with this service
    single {Marketer()}

}