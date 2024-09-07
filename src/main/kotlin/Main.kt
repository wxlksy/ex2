// Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS.
// На выходе получаем:
// A - 3
// D - 2
// S - 3

//Выполнил: Самойлов Кирилл Сергеевич ИП-22-7к

fun main()
{
    val s = "AASADDSS"
    val countS = mutableMapOf<Char, Int>()

    for (char in s)
    {
        if (char in countS)
        {
            countS[char] = countS[char]!! + 1
        }
        else
        {
            countS[char] = 1
        }
    }

    for (char in countS.keys.sorted())
    {
        println("$char - ${countS[char]}")
    }
}