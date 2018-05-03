package com.sunilson.firenote.presentation.application

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.google.firebase.database.FirebaseDatabase
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class BaseApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder().application(this).build().inject(this)
        //Activate Disk Persistence of Firebase
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector
    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector
}