//problem: Find max 10 numbers in a list having 10M entries.


import java.util.PriorityQueue

fun main() {
    val pq = PriorityQueue<Int>()
    val arr = arrayOf<Int>(33, 55,1001, 13, 46, 87, 402, 100, 340, 403, 506, 150, 1111, 2222, 45, 1245)
    var i = 0
    while(i<arr.size){
        if(pq.size <= 10){
            pq.add(arr[i])
            i++
            continue
        }
        pq.add(arr[i])
        pq.remove()
        i++
    }
    while(!pq.isEmpty()){
        println(pq.remove())
    }
}
