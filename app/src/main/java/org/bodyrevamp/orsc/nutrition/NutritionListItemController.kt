package org.bodyrevamp.orsc.nutrition

import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import org.bodyrevamp.orsc.R
import ru.surfstudio.android.easyadapter.controller.BindableItemController
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder

class NutritionListItemController : BindableItemController<NutritionListItem, NutritionListItemController.Holder>() {

    override fun getItemId(data: NutritionListItem): String =
        data.hashCode().toString()

    override fun createViewHolder(parent: ViewGroup): Holder =
        Holder(parent)

    inner class Holder(parent: ViewGroup) : BindableViewHolder<NutritionListItem>(
        parent,
        R.layout.nutrition_list_item
    ) {
        override fun bind(data: NutritionListItem) {
            Glide.with(itemView.context).load(data.image).into(itemView.findViewById(R.id.imageNutrition))

            itemView.findViewById<TextView>(R.id.titleNutrition).text = data.title
            itemView.findViewById<TextView>(R.id.descriptionNutrition).text = data.description
        }
    }
}
