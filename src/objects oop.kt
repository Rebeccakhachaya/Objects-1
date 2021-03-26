fun main(){
var person=Human("Rose",20,50)
    person.eat(2 )
    println(person.weight)
    person.speak("I am a kenyan citizen")
    person.birthday()
    var student=details("Becky","Anyangu","becky@gmail.com","07567866",670)
    println(student.firstName)
    println(student.email)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight kgs of food")
        weight=foodWeight+weight
        return weight
    }
    fun speak(speach:String){
        println(speach)
    }
    fun birthday(){
        age=age+1
        println(age)

    }
}
data class details(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int){

}
