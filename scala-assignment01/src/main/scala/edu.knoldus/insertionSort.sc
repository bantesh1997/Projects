def insertionSort(list: List[Int]): List[Int] ={
  val copy_list= new Array[Int](5)
  for(i1 <- 0 until list.length)
  {
    copy_list(i1)=list(i1)
  }
  //list.foreach(i2=> println(i2))
  for (i <- 0 until copy_list.size) {
      val key = copy_list(i)
       var j = i-1

    while(j>=0 && copy_list(j)>key){
      val swap=copy_list(j)
      copy_list(j+1) = swap
      j=j-1
    }
    copy_list(j+1)=key
  }
  copy_list.toList
}

val list = List(1,4,-3,5,2)
insertionSort(list)