package com.machari.firebasesso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.navigation.NavController

import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        NavigationUI.setupWithNavController(bottomNavigationView, drawerNavController)
    }

    fun menuClick(v: View) {
        when (v.id) {
            R.id.checkDepositMenuItem -> drawerNavController.navigate(R.id.checkDepositFragment)
            R.id.transferMenuItem -> drawerNavController.navigate(R.id.transferMoneyFragment)
            R.id.billPayMenuItem -> drawerNavController.navigate(R.id.billPayFragment)
        }
    }
}
