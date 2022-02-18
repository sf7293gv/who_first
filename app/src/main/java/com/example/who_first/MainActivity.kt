package com.example.who_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var viewResultButton: Button
    private lateinit var team1: EditText
    private lateinit var team2: EditText
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewResultButton = findViewById(R.id.random_team_button)
        team1 = findViewById(R.id.team_1_text)
        team2 = findViewById(R.id.team_2_text)
        resultText = findViewById(R.id.result_text)


        viewResultButton.setOnClickListener {
            showRandomTeam()
        }
    }

    private fun showRandomTeam() {
        val team1_text = team1.text.toString()
        val team2_text = team2.text.toString()
        if (team1_text.isBlank() || team2_text.isBlank()) {
            Toast.makeText(this, getString(R.string.no_team_entered_error), Toast.LENGTH_SHORT).show()
        } else {
            val teamToShow = listOf(team1_text, team2_text).random()
            resultText.setText(teamToShow)
        }
    }



}