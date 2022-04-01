fun main() {
    var car = Car("Toyota", "Camry", "pink", 30)
    car.carrying(50)
    car.identity()

    var x = car.calculateParkingFees(2)
    println(x)

    var bus=Bus("doubledeck","Nissan","yellow",40)
    println(bus.maxTripFare(15.5))
    println(bus.calculateParkingFees(200,3))


}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carrying(people:Int){
        var x=people
        if (people<= capacity)
    println("Carrying $people passengers")
        else{
            println("Over capacity by $x people")
        }

}
fun identity(){
    println("I am $color $make $model")

}
fun calculateParkingFees(hours:Int):Int{
    var fees=hours*20
    return fees

}
}
class Bus(var make:String,var model:String,var color:String,var capacity:Int){
    fun maxTripFare(fare:Double):Double{
        var  fare =60.5
        return fare
    }
    fun calculateParkingFees(fee:Int,hour:Int):Int{
        var fee=hour*fee
        return fee
    }

}


