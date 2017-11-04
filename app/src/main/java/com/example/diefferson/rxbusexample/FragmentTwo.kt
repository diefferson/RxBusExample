package com.example.diefferson.rxbusexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.fragment_fragment_two.*
import java.util.*


/**
 * Created by diefferson on 04/11/2017.
 */

class FragmentTwo : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity.application as MyApplication)
                .bus()!!
                .toObservable(Events.MyEvent::class.java)
                .subscribe({
                   tv_clicked.visibility = View.VISIBLE
                })

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_fragment_two, container, false)
    }

    companion object {

        fun newInstance(): FragmentTwo {

            return FragmentTwo()
        }
    }

}


