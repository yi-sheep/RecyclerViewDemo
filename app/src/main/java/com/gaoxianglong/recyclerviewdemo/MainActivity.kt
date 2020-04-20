package com.gaoxianglong.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruit()
//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation= LinearLayoutManager.HORIZONTAL // 将布局变为横向滚动，默认是竖向滚动
        // 网格布局，第一个参数表示一排是多少个，第二个参数是滚动方向
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager// 设置布局样式为线性布局
        val adapter = FruitAdapter(fruitList) // 初始化适配器
        recyclerView.adapter = adapter // 设置适配器
    }

    private fun initFruit() {
        fruitList.add(Fruit("Apple", R.drawable.apple_pic))
        fruitList.add(Fruit("Banana", R.drawable.banana_pic))
        fruitList.add(Fruit("Orange", R.drawable.orange_pic))
        fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
        fruitList.add(Fruit("Pear", R.drawable.pear_pic))
        fruitList.add(Fruit("Grape", R.drawable.grape_pic))
        fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
        fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
        fruitList.add(Fruit("cherry", R.drawable.cherry_pic))
        fruitList.add(Fruit("mango", R.drawable.mango_pic))
        fruitList.add(Fruit("Apple", R.drawable.apple_pic))
        fruitList.add(Fruit("Banana", R.drawable.banana_pic))
        fruitList.add(Fruit("Orange", R.drawable.orange_pic))
        fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
        fruitList.add(Fruit("Pear", R.drawable.pear_pic))
        fruitList.add(Fruit("Grape", R.drawable.grape_pic))
        fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
        fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
        fruitList.add(Fruit("cherry", R.drawable.cherry_pic))
        fruitList.add(Fruit("mango", R.drawable.mango_pic))
        fruitList.add(Fruit("Apple", R.drawable.apple_pic))
        fruitList.add(Fruit("Banana", R.drawable.banana_pic))
        fruitList.add(Fruit("Orange", R.drawable.orange_pic))
        fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
        fruitList.add(Fruit("Pear", R.drawable.pear_pic))
        fruitList.add(Fruit("Grape", R.drawable.grape_pic))
        fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
        fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
        fruitList.add(Fruit("cherry", R.drawable.cherry_pic))
        fruitList.add(Fruit("mango", R.drawable.mango_pic))
        fruitList.add(Fruit("Apple", R.drawable.apple_pic))
        fruitList.add(Fruit("Banana", R.drawable.banana_pic))
        fruitList.add(Fruit("Orange", R.drawable.orange_pic))
        fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
        fruitList.add(Fruit("Pear", R.drawable.pear_pic))
        fruitList.add(Fruit("Grape", R.drawable.grape_pic))
        fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
        fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
        fruitList.add(Fruit("cherry", R.drawable.cherry_pic))
        fruitList.add(Fruit("mango", R.drawable.mango_pic))
        fruitList.add(Fruit("Apple", R.drawable.apple_pic))
        fruitList.add(Fruit("Banana", R.drawable.banana_pic))
        fruitList.add(Fruit("Orange", R.drawable.orange_pic))
        fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
        fruitList.add(Fruit("Pear", R.drawable.pear_pic))
        fruitList.add(Fruit("Grape", R.drawable.grape_pic))
        fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
        fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
        fruitList.add(Fruit("cherry", R.drawable.cherry_pic))
        fruitList.add(Fruit("mango", R.drawable.mango_pic))
    }
}
