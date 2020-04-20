package com.gaoxianglong.recyclerviewdemo

import android.app.Application
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(val fruitList: List<Fruit>): RecyclerView.Adapter<FruitAdapter.ViewHolder>() {
    private val TAG = "mylog"
    /**
     * 内部类
     * 继承与RecyclerView的ViewHolder
     * 在这个类中初始化item布局中的控件
     */
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val fruitImage:ImageView = view.findViewById(R.id.imageView)
        val fruitName:TextView = view.findViewById(R.id.textView)
    }

    /**
     * 这个函数里做加载item布局相关的逻辑
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return ViewHolder(view)
    }

    /**
     * 这里又是一个kotlin的简写
     * 这个函数的作用是获取数据的长度，所以可以直接采用类似赋值的形式
     */
    override fun getItemCount() = fruitList.size

    /**
     * 这个函数中进行数据和控件的绑定
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position] // 获取到对应的Fruit实例
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
        // 点击事件，尽量放到这个函数中，个人建议
        holder.fruitImage.setOnClickListener {
            Log.d(TAG,fruit.name+"的图片")
        }
        holder.fruitName.setOnClickListener {
            Log.d(TAG,fruit.name)
        }
    }
}