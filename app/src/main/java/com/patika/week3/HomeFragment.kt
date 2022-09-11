package com.patika.week3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.patika.week3.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding= FragmentHomeBinding.inflate(inflater)
        return fragmentHomeBinding.root
    }


    /**
     * outState içerisine bir key ile birlikte verimizi gönderiyoruz
     * bu sayede veri key içerisine kayıt edilmiş oluyor
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("Mehmet",fragmentHomeBinding.materialTextInputFragmentHome.text.toString())
    }

    /**
     * Uygulamamız onViewStateRestored fonksiyonunu çağırdığında
     * bir key vererek kayıt ettiğimiz verimizi aynı key adını kullanarak tekrar çağırıyoruz
     */
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        var restoredValue :String = savedInstanceState?.getString("Mehmet", "değer bulunamadı").toString()
        fragmentHomeBinding.materialTextInputFragmentHome.setText(restoredValue.toString())

    }






}