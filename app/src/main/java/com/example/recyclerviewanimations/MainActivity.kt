package com.example.recyclerviewanimations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val navHostFragment: NavHostFragment =
      supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

    val navController: NavController = navHostFragment.navController

    val appBarConfiguration = AppBarConfiguration(navController.graph)

    setupActionBarWithNavController(navController, appBarConfiguration)
  }

  override fun onSupportNavigateUp() =
    Navigation.findNavController(this, R.id.nav_host_fragment)
        .navigateUp()
}