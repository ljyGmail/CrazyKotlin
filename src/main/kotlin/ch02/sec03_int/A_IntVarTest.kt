package ch02.sec03_int

fun main(args: Array<String>) {
    // 下面代码是正确的
    var a: Int = 56
    // 下面代码需要隐式地将2999999999转换为Int型使用，因此编译器将会报错
    // var bigValue: Int = 2999999999
    // 下面代码是正确的
    var bigValue2: Long = 2999999999
    // println(bigValue)
    println(bigValue2)
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)

    // Int型变量不支持null值，所以下面代码是错误的
    // var notNull: Int = null
    // Int?相当于支持null值的Int型，所以下面代码是正确的
    var nullable: Int? = null

    var pm1: Int = 200 // pm1的类型是Java的int类型
    var pm2: Int = 200 // pm2的类型是Java的int类型
    println(pm1 === pm2) // 基本类型比较，输出true
    var ob1: Int? = 200 // ob1的类型是Java的Integer类型
    var ob2: Int? = 200 // ob2的类型是Java的Integer类型
    println(ob1 === ob2) // 引用类型比较，输出false
}