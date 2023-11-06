package com.nasuhcandurmaz.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcom", Toast.LENGTH_LONG).show()


    }


    fun save (view : View){

        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are u sure")
        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity, "Saved", Toast.LENGTH_LONG).show()
            }

        })

        alert.setNegativeButton("No") { p0, p1 ->
            Toast.makeText(this@MainActivity, "Not Saved", Toast.LENGTH_LONG).show()


        }
        alert.show()

    }
}