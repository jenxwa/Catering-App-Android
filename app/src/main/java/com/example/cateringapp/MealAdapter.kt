package com.example.cateringapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.cateringapp.databinding.MealCardviewBinding

class MealAdapter(private val meals: List<Meal>) : RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val binding = MealCardviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealViewHolder(binding)
    }

    override fun getItemCount(): Int = meals.size

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val meal = meals[position]
        holder.setData(meal)
    }

    inner class MealViewHolder(private val binding: MealCardviewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(meal: Meal) {
//TODO
        }
    }
}

data class Meal(
    val name: String,
    val price: Double
    // Add other properties as needed
)
