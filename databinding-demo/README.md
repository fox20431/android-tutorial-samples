https://developer.android.com/topic/libraries/data-binding#kotlin

在 build.gradle 中开启 data binding.

```kts
android {
    buildFeatures {
        dataBinding = true
    }
}
```

在 xml 中增加 data标签

在 activity 中设置 data binding

```kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        binding.user = User("Test", "User")
    }
```

在 xml 插入数据