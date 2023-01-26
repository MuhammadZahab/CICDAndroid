package com.elementary.retirementcalculatorcicd

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    lateinit var btnDone: Button

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDone = findViewById(R.id.btn_done)

        textView = findViewById(R.id.textview)
        AppCenter.start(
            application, "2c33d110-7d02-4802-a0ec-2dd755846fd6",
            Analytics::class.java, Crashes::class.java
        )

        btnDone.setOnClickListener(View.OnClickListener {
            textView.setText("I am clicked")

        })
    }
}
