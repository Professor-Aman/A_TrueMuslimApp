package com.muaz.a_truemuslimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_new_tasbeeh_dialog.*
import kotlinx.android.synthetic.main.add_new_tasbeeh_dialog.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Add new Tasbeeh
        btnAddNewTasbeeh.setOnClickListener {
            //Inflate the dialog with custom view
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.add_new_tasbeeh_dialog, null)
            //AlertDialogBuilder
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
            //show dialog
            val  mAlertDialog = mBuilder.show()
            //login button click of custom layout
            mDialogView.btnContinue.setOnClickListener {
                //dismiss dialog
                mAlertDialog.dismiss()
                //get text from EditTexts of custom layout
                val tasbeehName = mDialogView.edtNameOfTasbeeh.text.toString()
                val countTasbeeh = mDialogView.edtCountsOfTasbeeh.text.toString()
                //set the input text in TextView
                Toast.makeText(this,"Name: "+tasbeehName+"\n Counts: "+countTasbeeh,Toast.LENGTH_LONG).show()

            }

        }

    }
}