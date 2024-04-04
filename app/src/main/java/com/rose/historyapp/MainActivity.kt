package com.rose.historyapp

//Deborah Habtom Tesfagiorgis
//ST10460782
//(Video link Here)
//(GitLink Here)

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declaring, my variables

    private lateinit var searchButton: Button
    private lateinit var clearButton: Button
    private lateinit var editText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing variables

        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        editText = findViewById(R.id.editText)
        resultTextView = findViewById(R.id.resultTextView)

        //creating a functioning clear button

        clearButton.setOnClickListener {
            editText.text.clear()
        }

        //creating a functioning search button with variables that will

        searchButton.setOnClickListener {
            // Create variables for historical figures selected for the project.
            val num = editText.text.toString().toIntOrNull()
            
            // If number is null, it should be set between 20 and 100.
            if (num != null && num in 20..100) {
                val specialNum = when (num) {
                    47 -> "Revolutionary and Emperor\n, Napoleon Bonaparte"
                    50 -> "King of rock and roll\n, Michael Jackson"
                    36 -> "Actress, singer and model\n, Marilyn Monroe"
                    37 -> "France's last reigning Queen\n, Marie Antoinette"
                    48 -> "American Founding Father\n Alexander Hamilton"
                    27 -> "Singer and songwriter\n, Amy Winehouse"
                    25 -> "Rapper, songwriter and singer\n, Tupac"
                    41 -> "The first King of the Zulu's,\nShaka Zulu"
                    32 -> "Emperor and conqueror,\n Alexander the Great"
                    35 -> "Composer of the Classical\n period, Wolfgang Mozart"
                    else -> null
                }

                //message that will appear should the age not match up with any figures

                val message = if (specialNum != null) "$specialNum."
                else "No historical figure \n found for this age."
                resultTextView.text = message

            } else {
                resultTextView.text = "This age is out of range."
            }
        }
    }
}