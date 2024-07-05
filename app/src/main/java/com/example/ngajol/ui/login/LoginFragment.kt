package com.example.ngajol.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.databinding.FragmentLoginBinding
import com.example.ngajol.model.local.Status

class LoginFragment : Fragment() {
    private lateinit var binding : FragmentLoginBinding
    private lateinit var status : Status
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        status = arguments?.getSerializable("status") as Status
        navigate()
    }

    private fun navigate(){
        binding.btnSubmit.setOnClickListener{
            val toHome = LoginFragmentDirections.actionLoginFragment2ToHomeFragment()
            findNavController().navigate(toHome)
        }
        binding.tvHasAccount.setOnClickListener {
            val toRegister = LoginFragmentDirections.actionLoginFragment2ToRegisterFragment(status)
            findNavController().navigate(toRegister)
        }
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}