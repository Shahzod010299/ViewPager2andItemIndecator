package coder.shakhzod.gridviewexample.data

import coder.shakhzod.gridviewexample.R

class DataProvider {
    private val list: List<Pair<Int, String>> = listOf(
        Pair(R.drawable.img_1,"Mbappe"),
        Pair(R.drawable.img_2,"Neymar"),
        Pair(R.drawable.img_3,"Messi"),
        Pair(R.drawable.img_4,"Ramos"),
        Pair(R.drawable.img_5,"Ibragimovich"),
        Pair(R.drawable.img_6,"Veratti"),
        Pair(R.drawable.img_7,"Hakimi"),
        Pair(R.drawable.img_8,"Kavani"),
        Pair(R.drawable.img_1,"Mbappe"),
        Pair(R.drawable.img_2,"Neymar"),
        Pair(R.drawable.img_3,"Messi"),
        Pair(R.drawable.img_4,"Ramos"),
        Pair(R.drawable.img_5,"Ibragimovich"),
        Pair(R.drawable.img_6,"Veratti"),
        Pair(R.drawable.img_7,"Hakimi"),
        Pair(R.drawable.img_8,"Kavani"),
    )
    fun getImageList() : List<Pair<Int, String>> = list
}