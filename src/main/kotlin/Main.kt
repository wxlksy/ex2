fun main()
{
    val inp = "AASADDSS"
    val countS = mutableMapOf<Char, Int>()

    for (char in inp)
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