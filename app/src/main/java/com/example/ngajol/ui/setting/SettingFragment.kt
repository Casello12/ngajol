package com.example.ngajol.ui.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {


    private lateinit var binding : FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate()
    }

    private fun navigate(){
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.arrowAbout.setOnClickListener {
            val toAbout = SettingFragmentDirections.actionSettingFragmentToAboutFragment()
            findNavController().navigate(toAbout)
        }
        binding.arrowProfile.setOnClickListener {
            val toProfile = SettingFragmentDirections.actionSettingFragmentToProfileFragment()
            findNavController().navigate(toProfile)
        }
        binding.arrowLogout.setOnClickListener {
            // TODO Menambahkan logika timed out hapus dari preferences
        }
    }


}