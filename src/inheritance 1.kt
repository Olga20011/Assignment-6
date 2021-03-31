fun main(){
var gari=Car("benz","A-class","grey",4)
    gari.carry(4)
   println (gari. calculateParkingFees (23))
    var vuuuum=Bus("toyota","landcruisher","blue",60)
    println(vuuuum.maxTripFare(400.toDouble()*vuuuum.capacity))
    println(vuuuum.calculator(23))
    vuuuum.identity()
}
open class Motoka( var make:String, var model:String,var color:String,var capacity:Int){
    fun carry(people: Int) {
        var excess = people - capacity
        if (people == capacity) {
            println("Carrying $people passengers")

        } else {
            println("Over capacity by $excess passengers")
        }


    }

    fun identity() {
        println(" Iam a $color $make $model")

    }


    fun calculateParkingFees(hours: Int): Int {
        var total = 20 * hours
        return(total)
    }
}

class Car( make:String, model:String, color:String, capacity:Int):Motoka(make,model,color,capacity) {

}

class Bus( make:String, model:String, color:String, capacity:Int ):Motoka(make,model,color,capacity){
    fun calculator(hours: Int):Int{
        return hours*capacity
    }
    fun maxTripFare(fare:Double):Double{
        var max=0
        return max+fare
    }


}