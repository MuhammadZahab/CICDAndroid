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
        AppCenter.start(
            application, "690d49ca-880b-4848-965e-6668dcd94a75",
            Analytics::class.java, Crashes::class.java
        )

        btnDone.setOnClickListener(View.OnClickListener {
//            textView.setText("hello")

            Crashes.generateTestCrash()
        })
    }
}