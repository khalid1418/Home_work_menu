package com.example.home_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.home_work.databinding.ActivityMain2Binding
import com.example.home_work.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when(item.itemId){
            R.id.setting -> {
                val intent =Intent(this , MainActivity2::class.java)
                startActivity(intent)
            }
             R.id.contact_us -> {
                 val intent = Intent(this,MainActivity3::class.java)
                 startActivity(intent)

             }
            R.id.login -> item.title = "log out"
        else -> super.onOptionsItemSelected(item)
         }
        return true

        }
    }

