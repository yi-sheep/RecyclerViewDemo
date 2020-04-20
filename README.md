# RecyclerViewDemo

这一期我们来看看RecyclerView的基础用法。

1.创建item布局

    布局中一个ImageView,一个TextView。分别用于显示水果图片和水果名称

2.创建数据对象类

```kotlin
class Fruit(val name:String,val imageId:Int)
```

3.创建Adapter(适配器)

```kotlin
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
```
4.使用RecyclerView控件

    在主布局中拖入RecyclerView

```kotlin
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
        ...
    }
}
```

这样RecylerView的基础用法就完了，很简单把，它不需要再做什么优化了。