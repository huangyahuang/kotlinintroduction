package com.huangya.basic
/*
* 类和接口
* */
interface A {
    fun fun1()

    fun fun2()
}

class B : A{
    override fun fun1() {
        TODO("Not yet implemented")
    }

    override fun fun2() {
        TODO("Not yet implemented")
    }

}


abstract class C {
    abstract fun a()

    /*默认是final */
    fun b() {}

    /*open 才能被子类复写*/
    open fun c(){}
}

class D:C(),A{
    override fun a() {
        TODO("Not yet implemented")
    }

    override fun fun1() {
        TODO("Not yet implemented")
    }

    override fun fun2() {
        TODO("Not yet implemented")
    }

}

class Person(name:String,age:Int){
    /*默认有有get set 方法*/
    var name = name
    /*
    get(){
        return field
    }
    set(value:String){
        field = value;
    }
    */
    val age = age
}

fun main(){
    val person = Person("huangya",29)
    //属性引用
    var name = person::name;
    name.set("huangyaya")
    println("${name.get()}")
}