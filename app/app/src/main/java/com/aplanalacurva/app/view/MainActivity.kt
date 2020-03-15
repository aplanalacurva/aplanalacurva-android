package com.aplanalacurva.app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aplanalacurva.app.R
import com.aplanalacurva.app.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.Presenter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
