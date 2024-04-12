package org.bodyrevamp.orsc.nutrition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import org.bodyrevamp.orsc.NUTRITION
import org.bodyrevamp.orsc.databinding.FragmentNutritionListBinding
import ru.surfstudio.android.easyadapter.EasyAdapter
import ru.surfstudio.android.easyadapter.ItemList

class NutritionListFragment : Fragment() {

    private var _binding: FragmentNutritionListBinding? = null
    private val binding get() = _binding!!

    private val easyAdapter = EasyAdapter()
    private val nutritionListItemController = NutritionListItemController()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNutritionListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewNutritionList.adapter = easyAdapter
        easyAdapter.setItems(ItemList.create(NUTRITION, nutritionListItemController))

        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayShowHomeEnabled(false)
    }
}