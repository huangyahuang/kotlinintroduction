//函数 函数是
fun main(){
    //函数引用
    val x:(Foo,String,Long)->Any = Foo::bar
    val x0:Function3<Foo,String,Long,Any> = Foo::bar
    yy(x);

    defaultParameter(y = "hello ")

    val(a,b,c) = returnValues();//伪多返回值

}


fun yy(p:(Foo,String,Long)->Any){
}

//默认参数
fun defaultParameter(x:Int=5,y:String,z:Long=0L){

}
class Foo{
    //方法
    fun bar(p0: String,p1: Long):Any{
        TODO()
    }
}

//变长参数
fun vararg(vararg p: String){
    println(p.contentToString())
}

//多返回指
fun returnValues():Triple<Int,Long,Double>{
    return Triple(1,2L,3.0)
}