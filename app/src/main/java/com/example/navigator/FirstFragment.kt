package com.example.navigator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root : View = inflater.inflate(R.layout.fragment_first, container, false)

        val btnNavigator :Button = root.findViewById<Button>(R.id.btn_navigator)

        btnNavigator.setOnClickListener {
            //findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(name = "mjm"))

        }

        return root
    }


}