package class

class Car : Vehicle() {
    override val speed = "250 км/ч"
    override val color = "Черный"
    override val numOfWheels = "4"
    override val nomer = "666"
    override val firma = "ЖИГУЛИ"

    override fun displayinfo() {
        println("Характеристики: /n")
        println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
        super.displayinfo()
    }

    override fun makeSound() {
        println("Машина издает <Врынг Врынг>")
    }
}
