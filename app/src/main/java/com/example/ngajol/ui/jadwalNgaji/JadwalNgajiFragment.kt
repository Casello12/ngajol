package com.example.ngajol.ui.jadwalNgaji

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentJadwalNgajiSholatBinding

class JadwalNgajiFragment : Fragment() {

    private lateinit var binding : FragmentJadwalNgajiSholatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJadwalNgajiSholatBinding.inflate(layoutInflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate()

    }

    private fun navigate() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.btnAdd.setOnClickListener {
            val toCreate = JadwalNgajiFragmentDirections.actionJadwalNgajiFragmentToCreateNgajiFragment()
            findNavController().navigate(toCreate)
        }
    }


}