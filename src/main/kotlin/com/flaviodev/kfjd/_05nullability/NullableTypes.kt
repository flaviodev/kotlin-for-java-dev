package com.flaviodev.kfjd._05nullability

val s1: String = "always not null"
val s2: String? = "can be null or non-null"

val s3: String? = null

val length: Int? = s3?.length

fun main() {

    if(s3 != null)
        println(s3.length)

    //It's the same

    println(s3?.length)

    // elvis operator
    println(s3?.length ?: 0)

    val v1: Int? = 1
    val v2: Int? = null

    // elvis precedence
    println(v2 ?: 2 * 2 + v1!!)

    // not-nul assertion -> throww NPE
    println(s3!!.length)

    // prefer ?. ?: to !!
}