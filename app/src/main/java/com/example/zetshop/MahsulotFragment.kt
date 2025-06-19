package com.example.zetshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.example.zetshop.databinding.FragmentMahsulotBinding
import kotlin.math.abs

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MahsulotFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MahsulotFragment : Fragment() {
lateinit var binding: FragmentMahsulotBinding
lateinit var vpAdapter:ViewPagerAdapter
    lateinit var recAdapter:MahsulotRecAdapter

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
            FragmentMahsulotBinding.inflate(LayoutInflater.from(container?.context), container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var list = ArrayList<Mahsulot>()
        list.add(Mahsulot("180 000 $"))
        list.add(Mahsulot("650 000 $"))
        list.add(Mahsulot("250 000 $"))
        list.add(Mahsulot("140 000 $"))
        list.add(Mahsulot("120 000 $"))
        list.add(Mahsulot("140 000 $"))



        recAdapter = MahsulotRecAdapter(list)

        binding.itemmahsulot.adapter = recAdapter
        viewpager()

        binding.savatganarxbtn.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, MessageFragment()).commit()
        }


    }

    private fun viewpager() {

var transformer=CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(20))
        transformer.addTransformer{
            page,position->
            var r=1-abs(position)
            page.scaleY =0.80f+r*0.18f
        }
        binding.viewpager.setPageTransformer(transformer)

        installViewPager()
    }


    private fun installViewPager() {
        var arrayList=ArrayList<String>()

        arrayList.add("https://images.uzum.uz/d0mtuqi7s4fo7mqaa4hg/t_product_540_high.jpg")
        arrayList.add("https://images.uzum.uz/d0ld1ba7s4fo7mq9t6bg/t_product_540_high.jpg")
        arrayList.add("https://images.uzum.uz/cvcg2f3vgbkm5ehkika0/main_page_banner.jpg")
        arrayList.add("https://images.uzum.uz/d0e9nfgn274j5sclsod0/main_page_banner.jpg")



        vpAdapter=ViewPagerAdapter(arrayList,binding.viewpager)


        binding.viewpager.adapter=vpAdapter


        binding.viewpager.offscreenPageLimit=3
        binding.viewpager.clipToPadding=false
        binding.viewpager.clipChildren=false
        binding.viewpager.getChildAt(0).overScrollMode=RecyclerView.OVER_SCROLL_NEVER



    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MahsulotFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MahsulotFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}