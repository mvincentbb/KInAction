package kia

import java.util.Collections

class Chapter3 {
    fun<T> joinToString(
    collection: Collections<T>,
    separator: String,
    prefix: String,
    postfix:String
    ): String{
        val result = java.lang.StringBuilder(prefix)
        for((index,element) in collection.withIndex()){
            if(index > 0) result.append(separator)
            result.append(element)
        }

        result.append(postfix)
        return  result.toString()
    }
}