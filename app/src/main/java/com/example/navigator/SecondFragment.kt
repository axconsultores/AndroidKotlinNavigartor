package com.example.navigator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import android.widget.TextView





class SecondFragment : Fragment() {


val args: SecondFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root : View = inflater.inflate(R.layout.fragment_second, container, false)

        val btnNavigator :Button = root.findViewById<Button>(R.id.btn_navigator)

        btnNavigator.setOnClickListener {
            //findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment(name = "Daniel"))
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