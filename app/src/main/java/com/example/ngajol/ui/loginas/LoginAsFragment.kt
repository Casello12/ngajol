package com.example.ngajol.ui.loginas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentLoginAsBinding
import com.example.ngajol.model.local.Status
import com.example.ngajol.ui.login.LoginFragment


class LoginAsFragment : Fragment() {

    private lateinit var binding : FragmentLoginAsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginAsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate()
    }


    private fun navigate() {
        binding.cardGuru.setOnClickListener {
            val toGuru = LoginAsFragmentDirections.actionLoginAsFragmentToLoginFragment2(Status.Guru).setStatus(Status.Guru)
            findNavController().navigate(toGuru)
        }

        binding.cardMurid.setOnClickListener {
            val toMurid = LoginAsFragmentDirections.actionLoginAsFragmentToLoginFragment2(Status.Murid)
            findNavController().navigate(toMurid)
        }
    }

}