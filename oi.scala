import scala.math.random

val num=50000000;
val numRdd =sc.parallelize(1 to num)
val count = numRdd.map{
    n=>{
        val x=random*2-1
        val y=random*2-1
        if(x*x+y*y<1)
            1
        else
            0
        }
    }.reduce(_+_)

println(4.0*count/num)



val rdd=sc.makeRDD(Array(
    "2012-3-1 a",
    "2012-3-2 b",
    "2012-3-3 c",
    "2012-3-1 a",
    "2012-3-2 b",
    "2012-3-4 c",
    "2012-3-1 a",
    "2012-3-2 b",
    "2012-3-4 d",
    "2012-3-5 a",
    "2012-3-6 b",
    "2012-3-1 c",
    "2012-3-7 d",
    "2012-3-4 a",
    "2012-3-1 c"
))

import orgkkjfasf