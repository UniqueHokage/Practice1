import kotlin.math.*
fun main(args: Array<String>) {
    //1 задание
val exercises: Int = 13;
    var exercisesSolved = 0;

    //2 задание
    val myAge: Int = 18;
    println("2. Ваш возраст: $myAge")

    //3 задание
    var averageAge: Double = 18.0;
    averageAge = (averageAge + 30)/2;
    println("3. Среднее арифметическое: $averageAge")

    //4 задание
    val testNumber: Int = 26
    val evenOdd = testNumber % 2
    println("4. Остаток от деления: $evenOdd")
    // Остаток не изменился потому что делится без остатка

    //5 задание
    var answer: Double = 0.0;
    answer += (1 + 10) * 10 shr 3
    println("5. Результат: $answer")

    //6 задание
    var age = 0;
    age = 16
    print(age)
    age = 30
    print(age)
    // константа не изменяется

    //7 задание
    val a = 46
    val b = 15

    //1
    val answer1: Int = (a * 100) + b
    //2
    val answer2: Int = (a * 100) + (b * 100)
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println("\n7. Ответы 1. $answer1 + 2. $answer2 + 3. $answer3")

    //8 задание
    val zad8 = ((5 * 3) - ((4 / 2) * 2))
    println("8. $zad8")

    //9 задание
    val aa = 34.0;
    val bb = 21.0;
    val average = (aa + bb)/2
    println("9.Среднее арифм.: $average")

    //10 задание
    val fahrenheit = 96.3;
    val celcius =   (fahrenheit - 32) / 1.8
    println("10. Температура в C: $celcius")

    //11 задание
    //val position = 0..63

    //12 задание
    val degrees = 60.0;
    val radians = degrees * PI / 180
    println("12. Радианы: $radians")

    //13 задание
    val x1 = 12.0;
    val y1 = 10.3;
    val x2 = 2.1;
    val y2 = 4.3;
    val distance = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    println("13. Расстояние $distance")


}