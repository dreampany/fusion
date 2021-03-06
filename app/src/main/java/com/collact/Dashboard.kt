package com.collact

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CalendarView
import com.awesome.dialog.AwesomeColorPickerDialog
import com.awesome.dialog.AwesomeDatePickerDialog
import com.awesome.dialog.AwesomeSwitchableDialog
import com.awesome.dialog.datepicker.utils.SelectionType
import com.awesome.shorty.AwesomeToast
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.content_dashboard.*
import java.util.*


class Dashboard : AwesomeColorPickerDialog.OnColorConfirmListener, AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        setSupportActionBar(toolbar)

        sharedDialog.setOnClickListener {

            AwesomeSwitchableDialog(this)
                    .setTopView(R.layout.topview)
                    .setBottomView(R.layout.bottomview)
                    .setTopViewColor(Color.parseColor("#00BCD4"))
                    .setBottomViewColor(Color.parseColor("#FFFFFF"))
                    .setTopViewIcon(R.drawable.ic_login, Color.parseColor("#FFFFFF"))
                    .setBottomViewIcon(R.drawable.ic_register, Color.parseColor("#00BCD4"))
                    .show()
        }


        colorPickerDialog.setOnClickListener {

            AwesomeDatePickerDialog(this)
                    .setIcon(R.drawable.ic_check_white_48dp)
                    .setIconTintColor(Color.WHITE)
                    .setCalendarSelectionType(SelectionType.RANGE)
                    .setCalendarAccentColor(resources.getColor(R.color.color_deep_purple))
                    .setPositiveButton("Done", View.OnClickListener {
                        AwesomeToast.success(this, "picked").show()
                    })
                    .show()

          //  startActivity(Intent(this, DefaultCalendarActivity::class.java))
           /* AwesomeColorPickerDialog(this)
                    .setConfirmButton("Done", this)
                    .show()*/

        }


    }

    override fun onColorConfirmed(color: Int) {
    }
}
