fun main() {
    val x = parseInt("1")
    val y = parseInt("A")
    println(x)
    println(y)

}

/*求两个参数的和的函数*/
fun sumFun(a: Int, b: Int): Int {
    return a + b
}

/*将表达式作为函数体、返回值类型自动推断的函数*/
fun sumExpression(a: Int, b: Int) = a + b

/*函数返回无意义的值*/
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

/*条件表达式*/
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

/*在 Kotlin 中，if 也可以用作表达式：*/
fun maxOfExpression(a: Int, b: Int) = if (a > b) a else b

/*如果 str 的内容不是数字返回 null：*/
fun parseInt(str: String): Int? {
    if (str is String) {
        return str.length
    }
    return null

}

/*空值与 null 检测*/
fun printProdect(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x != null && y != null) {
        println(x + y)
    } else {
        println("'$arg1' or '$arg2' is not number")
    }
}

/* 循环 */
fun loop(){
    val items = listOf("A1","A2","A3")
    /* for循环 */
    for (item in items) {
        println(item)
    }

    /* while循环 */
    var index = 0
    while (index < items.size){
        println(items[index])
        index ++
    }
}

/* when 表达式 */
fun describe(obj:Any):String= when(obj){
    1          -> "One"
    "Hello"    -> "Greeting"
    is Long    -> "Long"
    !is String -> "Not a string"
    else       -> "Unknown"
}

/*使用区间（range）*/
fun range(x : Int){
    if (x in 1..10){
        println("fits in range")
    }

    var list = listOf("a","b","c")
    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
}

/*数据类型*/
fun type(){
    //val 可读变量 var 可读写变量
    val i = 1
    val s = "hello word"
    val d = 1.0
    val f = 1.2f
    val l = 100L

    //类型转换
    var int = 200
    val long: Long = int.toLong()

    var double = 2.0
    var flaot: Float = double.toFloat()
}


/*数组*/
fun arrAr(){
    val a1 = intArrayOf(1,2,3,4,5)
    val a2 = IntArray(5){it+1}
    val a3 = floatArrayOf(1f,2f,3f,4f,5f)
    val a4 = arrayOf("a1","a2")
    // for循环
    for (i in a1) {
        println(i)
    }

    a1.forEach { e-> println(e) }

    //判断数组中是否存在某元素
    if(1 in a1){
        println("1存在于数组中")
    }

    if (6 !in a1){
        println("6不存在于数组中")
    }

    // ===比较的是引用 ==比较的是内容
    println( a1 === a2)
    println(a1 == a2)
}

/*区间*/
fun range(){
    //闭区间
    val intRange1 = 1..10
    val charRange1 = 'a'..'z'
    println(charRange1.joinToString())
    //开区间
    val intRange2 = 1 until 10
    val charRange2 = 'a' until 'z'
    //倒序
    val intRange3 = 10 downTo  1
    val charRange3 = 'z' downTo 'a'
    //步长
    val intRange4 = 1..10 step (2)
    val charRange4 ='a'..'z' step (3)
    //遍历
    for (i in intRange1) {
        println(i)
    }

    val arr = intArrayOf(1,3,5,7)
    for (i in 0 until arr.size){
        println(arr[i])
    }
    for (i in arr.indices){
        println(i)
    }
    //包含关系
    if (1 in intRange1){
        println("包含")
    }
    if (11 !in intRange1){
        println("不包含")
    }
}


/*数组*/
fun list(){
    //list不可变 mutableListOf可变
    val list: List<Int> = listOf(1,2,3,4,5,6)
    val listMutableList: MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    val value = listMutableList[1]
    listMutableList[0] = 3

    //map不可变 mutableMapOf可变 Any==object
    val map: Map<String,Any> = mapOf("name" to "huanga","age" to 29)
    val mutableMap: MutableMap<String,Any> = mutableMapOf("name" to "huanga","age" to 29)
    val mapvalue = mutableMap["name"]
    mutableMap["name"] = "wangcan"

    //set不可变 可变
    val set: Set<Int> = setOf(1,2,3,4,5,6)
    val mutableSet: MutableSet<Int> = mutableSetOf(1,2,3,4,5,6)


    for(i in 0 ..10){
        listMutableList += i
    }
    for(i in 0 ..10){
        listMutableList -= i
    }

    //健值队
    val pair1 = "hello" to "word"
    val pair2 = Pair("hello","word")
    val(x,y) = pair1
    val first = pair1.first
    val second = pair1.second
    //三个元素
    val triple = Triple(1,2,3)
    val first1 = triple.first
    val second1 = triple.second
    val third = triple.third

    for (i in listMutableList) {
        println(i)
    }
    if (1 in listMutableList){
        println("包含1")
    }
    for (mutableEntry in mutableMap) {
        println(mutableEntry.key)
        println(mutableEntry.value)
    }
}




