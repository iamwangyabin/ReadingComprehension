# ReadingComprehension
就是一个比赛里的问答系统

val file=sc.textFile("C:/spark/README.md")

val rdd = file.flatMap(line => line.split(" "))

rdd.collect()
rdd.foreach(println)

val rdd2 = rdd.map(word => (word, 1))
rdd2.collect()
rdd2.foreach(println)


val rdd3=rdd2.reduceByKey(_ + _)
rdd3.collect()
rdd3.foreach(println)

##################################
import org.apache.spark.streaming._

val ssc=new

