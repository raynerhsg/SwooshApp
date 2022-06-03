package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_searching.*

class SearchingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchingLeagueText.text =
            "Looking for a ${player?.league} ${player?.skill} league near you..."

    }
}