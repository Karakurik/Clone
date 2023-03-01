package com.example.fourthsemestr1.ui.fragments.list.recycler

import androidx.recyclerview.widget.DiffUtil
import com.example.fourthsemestr1.models.CityWeather

object CityWeatherDiffCallback : DiffUtil.ItemCallback<CityWeather>(){
    override fun areItemsTheSame(oldItem: CityWeather, newItem: CityWeather): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CityWeather, newItem: CityWeather): Boolean {
        return oldItem == newItem
    }
}

