package kia



//class Chapter3 {
    fun<T> joinToStringTwo(
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

    fun main(args : Array<String>){
        val list = listOf(1,2,3)
        println(joinToStringTwo(list, "; ", "(", ")"))

    }
//}
