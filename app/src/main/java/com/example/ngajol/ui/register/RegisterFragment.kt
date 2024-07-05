package com.example.ngajol.ui.register

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentRegisterBinding
import com.example.ngajol.model.local.Status

class RegisterFragment : Fragment() {

    private lateinit var binding : FragmentRegisterBinding
    private lateinit var status : Status
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        status = arguments?.getSerializable("status") as Status
        Log.d("RegisterFragment", "nilai status $status")
        navigate()
    }

    private fun navigate() {
        binding.tvHasAccount.setOnClickListener {
            val toLogin = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment2(status)
            findNavController().navigate(toLogin)
        }
        binding.btnSubmit.setOnClickListener {
            val toHome = RegisterFragmentDirections.actionRegisterFragmentToHomeFragment()
            findNavController().navigate(toHome)
        }
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}