/*四则计算器 计算3*4*/

fun main(vararg args:String){
    //先判断长度是否达到计算标准
    if (args.size < 3){
        return printResults()
    }

    val operators = mapOf(
        "+" to ::add,
        "-" to ::subtract,
        "*" to ::multiply,
        "/" to ::except
    )
    val opFuns = operators[args[1]]?:return printResults()
    println("Output: ${opFuns(args[0].toInt(),args[2].toInt())}")
}

fun add(args1: Int ,args2: Int): Int{
    return args1+args2
}

fun subtract(args1: Int ,args2: Int): Int{
    return args1-args2
}

fun multiply(args1: Int ,args2: Int): Int{
    return args1*args2
}

fun except(args1: Int ,args2: Int): Int{
    return args1/args2
}

fun printResults(){
    println(
        """
           Simple Calculator
           Input 3 * 4
           Output 12
        """.trimIndent()
    )
}