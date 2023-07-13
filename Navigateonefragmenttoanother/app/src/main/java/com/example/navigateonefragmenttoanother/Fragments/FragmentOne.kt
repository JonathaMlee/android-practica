package com.example.navigateonefragmenttoanother.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigateonefragmenttoanother.R
import com.google.android.material.button.MaterialButton


class FragmentOne : Fragment() {

    private lateinit var btnNavigateFragmentOne: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_one, container, false)

        btnNavigateFragmentOne = view.findViewById(R.id.btnNavigateFragmentOne)

        btnNavigateFragmentOne.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        return view;

    }


}