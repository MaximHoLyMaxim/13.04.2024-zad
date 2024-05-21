package class

class ElectricCar : Car(), FuelEfficient {
    val batteryCapacity = ""

    open class ElectricCar : Car(), FuelEfficient {
        open val batteryCapacity = "100 кВтч"
        override val speed = "280 км/ч"
        override val color = "Розовый"
        override val numOfWheels = "4"
        override val nomer = "6565"
        override val firma = "Nissan"
        override fun fuelEfficiency() {
            println("Характеристики: /n")
            println("Скорость: $speed n/ Цвет: $color n/ Количество колёс: $countOfWheels")
            println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
        }
    }
}
