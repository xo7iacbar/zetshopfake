package com.example.zetshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zetshop.databinding.FragmentSavsaqlanganBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SavsaqlanmaganFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SavsaqlanmaganFragment : Fragment() {
    lateinit var binding: FragmentSavsaqlanganBinding
    lateinit var recAdapter3:SavatRecAdapter2
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentSavsaqlanganBinding.inflate(LayoutInflater.from(container?.context), container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var list = ArrayList<Savat>()
        list.add(Savat("180 000 $"))
        list.add(Savat("650 000 $"))
        list.add(Savat("250 000 $"))
        list.add(Savat("140 000 $"))
        list.add(Savat("120 000 $"))
        list.add(Savat("140 000 $"))



        recAdapter3 = SavatRecAdapter2(list)

        binding.itemsavatmahsulot.adapter = recAdapter3
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SavsaqlanmaganFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SavsaqlanmaganFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}