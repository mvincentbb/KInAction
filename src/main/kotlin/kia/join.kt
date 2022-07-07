@file: JvmName("StringFunctions")

package  kia

fun<T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix:String
): String{
    val result = java.lang.StringBuilder(prefix)
    for((index,element) in collection.withIndex()){
        if(index > 0) result.append(separator)
//            result.append(element)
    }

    result.append(postfix)
    return  result.toString()
}