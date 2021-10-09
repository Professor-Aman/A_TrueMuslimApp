fun generateDummyList(size: Int): List<MyTasbeehItems> {

        val list = ArrayList<MyTasbeehItems>()

        for (i in 0 until size) {
           /* val drawable = when (i % 3) {
                0 -> R.drawable.icon_edit_counter
                1 -> R.drawable.icon_delete_counter
                else -> R.drawable.icon_edit_counter
            }*/

            val item = MyTasbeehItems(i,"Item $i", 5,500,10,R.drawable.icon_edit_counter,R.drawable.icon_delete_counter)
            list += item
        }
        val listSize = list.size
        txtMyTasbeehsCounts.text = listSize.toString()

        return list
    }
