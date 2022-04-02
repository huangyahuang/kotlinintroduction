fun main() {
    val x = parseInt("1")
    val y = parseInt("A")
    println(x)
    println(y)

}

/*求两个参数的和的函数*/
fun sumFun(a: Int, b: Int): Int {
    return a + b;
}

/*将表达式作为函数体、返回值类型自动推断的函数*/
fun sumExpression(a: Int, b: Int) = a + b;

/*函数返回无意义的值*/
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}");
}

/*条件表达式*/
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a;
    }
    return b;
}

/*在 Kotlin 中，if 也可以用作表达式：*/
fun maxOfExpression(a: Int, b: Int) = if (a > b) a else b;

/*如果 str 的内容不是数字返回 null：*/
fun parseInt(str: String): Int? {
    if (str is String) {
        return str.length;
    }
    return null;

}

/*空值与 null 检测*/
fun printProdect(arg1: String, arg2: String) {
    val x = parseInt(arg1);
    val y = parseInt(arg2);
    if (x != null && y != null) {
        println(x + y);
    } else {
        println("'$arg1' or '$arg2' is not number");
    }
}

/* 循环 */
fun loop(){
    val items = listOf("A1","A2","A3")
    /* for循环 */
    for (item in items) {
        println(item);
    }

    /* while循环 */
    var index = 0;
    while (index < items.size){
        println(items[index]);
        index ++;
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
        println("fits in range");
    }

    var list = listOf("a","b","c")
    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
}


