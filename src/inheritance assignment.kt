fun main() {
    var toyota=Car("Benz","audi","white",4)
    toyota.carry(4)
    toyota.carry(7)
    toyota.identity()
    println(toyota.calculateParkingFees(8))
    var bus=Bus("nissan","relay","grey",28)
    bus.carry(32)
    println(bus.maxTripFare(100.0))
    println(bus.calculateParkingFees(3))

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){

        if (capacity>=people){
            println("Carrying $people passengers")
        }else{
            var x=people-capacity
            println("Over capacity by $x people")
        }

    }
    fun identity(){
        println("I am $color, $make, $model")
    }
  open  fun calculateParkingFees(hours:Int):Int{
        return (hours*20)
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make, model, color, capacity){


fun maxTripFare(fare:Double):Double{
    return fare*capacity
}
    override fun calculateParkingFees(hours: Int):Int{
        return (hours*capacity)
    }
}
