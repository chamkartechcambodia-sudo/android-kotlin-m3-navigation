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
        // TODO (09) Call binding.playButton.setOnClickListener and navigate to the gameFragment
        // Use Navigation.createNavigateOnClickListener with
        // R.id.action_titleFragment_to_gameFragment
        binding.playButton.setOnClickListener (
          //  Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment2)
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment2)
        )
        return binding.root
    }
    // TODO (06) Add the Title Fragment to the Navigation Graph
    // Go to the navigation.xml file and select the design tab
    // Click the add icon with the + on it to add a new destination to the graph
    // Select fragment_title to add this fragment to the graph as the start destination

    // TODO (08) Connect the Title and Game Fragments with an Action
    // In the navigation editor, hover over the titleFragment.  Click on the circular connection
    // point and drag to gameFragment to create the Action
}