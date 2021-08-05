package com.example.alertmessage


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Program Opened" , Toast.LENGTH_LONG).show()

        btnSave.setOnClickListener {

            val name = etName.text.toString()
            val surname = etSurname.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()



            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Save")
            alert.setMessage("Do you want to save?")
            alert.setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(applicationContext,"Saved", Toast.LENGTH_LONG).show()
                tvInfo.text = "Name: $name\n" +
                        "Surname: $surname\n" +
                        "Age: $age\n" +
                        "Country: $country"
            }
            alert.setNegativeButton("No"){dialog, which ->
                Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
            }
            alert.show()

        }
    }
}