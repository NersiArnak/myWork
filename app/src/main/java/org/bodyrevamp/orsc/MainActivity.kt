package org.bodyrevamp.orsc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.bodyrevamp.orsc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        window.statusBarColor = ContextCompat.getColor(this, R.color.navi_blue)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.specific_blue)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.myResults -> {
                    navController.navigate(
                        R.id.ResultsFragment, null,
                        NavOptions.Builder()
                            .setLaunchSingleTop(true)
                            .setPopUpTo(R.id.ResultsFragment, true)
                            .build()
                    )
                    binding.toolbar.findViewById<TextView>(R.id.text_main).text = getString(R.string.results_main_text)
                }
                R.id.training -> {
                    navController.navigate(
                        R.id.TrainingsFragment, null,
                        NavOptions.Builder()
                            .setLaunchSingleTop(true)
                            .build()
                    )
                    binding.toolbar.findViewById<TextView>(R.id.text_main).text = getString(R.string.training_main_text)
                }
                R.id.timer -> {
                    navController.navigate(
                        R.id.TimerFragment, null,
                        NavOptions.Builder()
                            .setLaunchSingleTop(true)
                            .build()
                    )
                    binding.toolbar.findViewById<TextView>(R.id.text_main).text = getString(R.string.timer_main_text)
                }
                R.id.nutrition -> {
                    navController.navigate(
                        R.id.NutritionFragment, null,
                        NavOptions.Builder()
                            .setLaunchSingleTop(true)
                            .build()
                    )
                    binding.toolbar.findViewById<TextView>(R.id.text_main).text = getString(R.string.nutrition_main_text)
                }
                R.id.settings -> {
                    navController.navigate(
                        R.id.SettingsFragment, null,
                        NavOptions.Builder()
                            .setLaunchSingleTop(true)
                            .build()
                    )
                    binding.toolbar.findViewById<TextView>(R.id.text_main).text = getString(R.string.settings_main_text)
                }
            }
            true
        }
    }
}
