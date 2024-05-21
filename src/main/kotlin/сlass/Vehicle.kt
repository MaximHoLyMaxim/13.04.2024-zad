package class

open val speed = ""
open val color = ""
open val countOfWheels = ""
open val nomer = ""
open val firma = ""

abstract fun makeSound()

open fun displayinfo() {
    println("Характеристики: /n")
    println("Скорость: $speed Цвет: $color Количество колёс: $countOfWheels")
    println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
}
