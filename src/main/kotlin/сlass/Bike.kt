package class

import jdk.internal.org.objectweb.asm.util.Printer

class Bike : Vehicle(){
    override val speed = "30 км/ч"
    override val color = "Черный"
    override val numOfWheels = "2"
    override val nomer = "-"
    override val firma = "Bike-Bike"

    override fun displayinfo() {
        println("Характеристики: /n")
        println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
        super.displayinfo()
    }
    override fun makeSound() {
        println("Велик издает <Жив жив>")
    }
}
