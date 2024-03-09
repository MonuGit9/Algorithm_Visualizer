package com.planetapps.algorithmsorting.domain.model

data class SortInfo(
    val currentItem:Int,
    val shouldSwap:Boolean,
    val hadNoEffect:Boolean
)
