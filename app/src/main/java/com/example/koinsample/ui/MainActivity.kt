package com.example.koinsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinsample.R
import com.example.koinsample.models.Marketer
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.getViewModel
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber

/*
    just b/c this is an activity we won't need koinComponent (Life cycle aware)
    this is because Koin already provides extension functions for Android configuration-aware components
    if it was just a regular class we would implement koinComponent to get access to all the koin functions
 */
class MainActivity : AppCompatActivity() {

    //this is a lazy injection which won't be initialized until it's used
    private val first: Marketer by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finally to get an instance of the viewmodel we just call the extension function which takes care of all that factory crap
        val viewModel = getViewModel<MainViewModel>()
        viewModel.printSomething()

        //directly get an instance
        val second: Marketer = get()
        Timber.d(second.toString())
        Timber.d(first.toString())
    }
}
