/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.trivia

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // TODO (05) Add private lateinit vars drawerLayout and appBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        // TODO (06) Initialize drawerLayout var from binding
        val navController = this.findNavController(R.id.myNavHostFragment)
        // TODO (07) Add the DrawerLayout as the second parameter to setupActionBarWithNavController

        // TODO (08) Create appBarConfiguration with the navController.graph and drawerLayout
        // TODO (09) Hook the navigation UI up to the navigation view. (navView)


    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
        // TODO (10) Replace navController.navigateUp with NavigationUI.navigateUp with drawerLayout par
    }
}
