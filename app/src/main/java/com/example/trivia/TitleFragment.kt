package com.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.trivia.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener (
          //  Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment2)
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment2)
        )
        // TODO (02) Create the new menu resource
        // Right click on the res folder within the Android project and select New Resource File
        // Name it overflow_menu with resource type menu.  Add an About menu item with the ID of
        // the aboutFragment.
        // TODO (03) Call setHasOptionsMenu(true)
        // This tells Android that our fragment has an Options Menu, so it will call
        // onCreateOptionsMenu
        return binding.root
    }
    // TODO (04) Override onCreateOptionsMenu
    // Use the passed-in MenuInflater to inflate the overflow_menu

    // TODO (05) Override onOptionsItemSelected
    // Return true if NavigationUI.onNavDestinationSelected returns true, else return
    // super.onOptionsItemSelected.
}