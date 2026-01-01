package com.example.navigator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlin.getValue


class ThirdFragment : Fragment() {

    val args: ThirdFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root : View = inflater.inflate(R.layout.fragment_third, container, false)
        val btnNavigator :Button = root.findViewById<Button>(R.id.btn_navigator)


        btnNavigator.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)

        }

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name : String = args.name
        val tvName = view.findViewById<TextView>(R.id.txtName)
        tvName.text  = name
    }



}