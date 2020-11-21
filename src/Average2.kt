class Average2 {
    public fun getWeightedAverageForStudent(num1 : Double , num2 : Double , num3 : Double) : Double{
        val A  = 2
        val B  = 3
        val C  = 5
        return (num1*A + num2*B + num3*C) / (A+B+C)
    }
}