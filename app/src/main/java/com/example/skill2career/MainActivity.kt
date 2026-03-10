package com.example.skill2career

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.skill2career.ui.AdminScreen
import com.example.skill2career.ui.StudentScreen
import com.example.skill2career.ui.StudentDetails
import com.example.skill2career.ui.theme.SKILL2careerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SKILL2careerTheme {

                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Box(modifier = Modifier.padding(innerPadding)) {

                        NavHost(
                            navController = navController,
                            startDestination = "login"
                        ) {

                            composable("login") {
                                LoginScreen { _, _, role ->
                                    if (role == "Student") {
                                        navController.navigate("studentDetails")
                                    } else {
                                        navController.navigate("admin")
                                    }
                                }
                            }

                            composable("studentDetails") {
                                StudentDetails(navController)
                            }

                            composable("studentScreen") {
                                StudentScreen()
                            }

                            composable("admin") {
                                AdminScreen()
                            }
                        }
                    }
                }
            }
        }
    }
}