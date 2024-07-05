package com.example.ngajol.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate()
    }

    private fun navigate() {
        binding.cardJadwalNgaji.setOnClickListener {
            val toJadwalNgaji = HomeFragmentDirections.actionHomeFragmentToJadwalNgajiFragment()
            findNavController().navigate(toJadwalNgaji)
        }
        binding.cardJadwalSholat.setOnClickListener {
            val toJadwalSholat = HomeFragmentDirections.actionHomeFragmentToJadwalSholatFragment()
            findNavController().navigate(toJadwalSholat)
        }
        binding.cardQiblat.setOnClickListener {
            val toQiblat = HomeFragmentDirections.actionHomeFragmentToQiblatFragment()
            findNavController().navigate(toQiblat)
        }
        binding.ivSetting.setOnClickListener {
            val toSetting = HomeFragmentDirections.actionHomeFragmentToSettingFragment()
            findNavController().navigate(toSetting)
        }
    }

}