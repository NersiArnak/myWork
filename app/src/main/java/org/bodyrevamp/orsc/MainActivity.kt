package org.bodyrevamp.orsc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
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


        val navController = findNavController(R.id.nav_host_fragment_content_main)  // Находит контроллер навигации по идентификатору фрагмента навигации
        appBarConfiguration = AppBarConfiguration(navController.graph)  // Создает конфигурацию панели действий на основе графа навигации
        setupActionBarWithNavController(navController, appBarConfiguration)  // Настраивает панель действий для работы с контроллером навигации

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {  // Определяет, какой элемент был выбран
                R.id.myActivity -> {  // Если выбран фрагмент "TrainingFragment"
                    navController.navigate(  // Переходит к указанному фрагменту
                        R.id.TrainingsFragment, null,  // Использует идентификатор фрагмента и передает навигационные параметры (null в данном случае)
                        NavOptions.Builder()  // Создает новый объект Builder для настройки параметров навигации
                            .setLaunchSingleTop(true)  // Указывает, что фрагмент должен быть запущен в одиночном режиме верхнего уровня
                            .setPopUpTo(R.id.TrainingsFragment, true)  // Указывает, что при переходе на этот фрагмент нужно удалить из стека навигации все предыдущие экраны
                            .build()  // Строит объект NavOptions
                    )
                }

                R.id.workout -> {
                    binding.textMain.text = "Тренировки"
                    true
                }
                R.id.timer -> {
                    binding.textMain.text = "Таймер"
                    true
                }
                R.id.nutrition-> {
                    binding.textMain.text = "Питание"
                    true
                }
                R.id.settings -> {
                    binding.textMain.text = "Настройки"
                    true
                }
            }
            true
        }
    }
}
