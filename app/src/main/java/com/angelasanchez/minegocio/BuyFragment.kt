package com.angelasanchez.minegocio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView



class BuyFragment : Fragment() {


    private lateinit var btn_w: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragment: View = inflater.inflate(R.layout.fragment_buy, container, false)

            val data1: TextView = fragment.findViewById(R.id.data1)
            val data2: TextView = fragment.findViewById(R.id.data2)
            val data3: TextView = fragment.findViewById(R.id.data3)

        data1.setOnClickListener(View.OnClickListener {
                val data = Bundle()
                data.putString("buy",resources.getString(R.string.text_order))
                data.putString("Shipping cost","20000")
                data.putString("Subtotal","20000")
                data.putString("Total","20000")

                activity?.supportFragmentManager?.beginTransaction()
                    ?.setReorderingAllowed(true)
                    ?.replace(R.id.fragment_container_view,BuyFragment::class.java,data,"buy")
                    ?.addToBackStack("")
                    ?.commit()

            })
        data2.setOnClickListener(View.OnClickListener {
            val data = Bundle()
            data.putString("buy",resources.getString(R.string.text_cost))
            data.putString("Shipping cost","40000")
            data.putString("Subtotal","60000")
            data.putString("Total","90000")

            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,BuyFragment::class.java,data,"buy")
                ?.addToBackStack("")
                ?.commit()

        })
        data3.setOnClickListener(View.OnClickListener {
            val data = Bundle()
            data.putString("buy",resources.getString(R.string.text_total))
            data.putString("Shipping cost","50000")
            data.putString("Subtotal","50000")
            data.putString("Total","50000")


            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,BuyFragment::class.java,data,"buy")
                ?.addToBackStack("")
                ?.commit()

        })

            return fragment
        }





}





