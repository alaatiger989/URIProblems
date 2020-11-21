import java.io.File
import java.io.FileReader
import java.io.FileWriter

class SalaryWithBonus {
    val fileName = "data2.txt"
    val percentageOfSales = 0.15
    var chkStatus : Boolean = false
    public fun EnterNewEmployee(empName : String , fixedSalary : Double , salesInMonth : Double)
    {
        var file = File(fileName)
        if (file.exists())
        {
            var fo = FileWriter(fileName , true)
            fo.write(empName+","+fixedSalary+","+salesInMonth + "\n")
            fo.close()
            println("Data Registered Successfully")
            println(file.absolutePath)
        }
        else{
            file.createNewFile()
            print("The file hasn't been found ... we 've created a new file in  " + file.absolutePath)
        }
    }
    public fun getSalaryWithBonus(empName: String)
    {
        try {
            var data = FileReader(fileName)
            var c:List<String>?
            c = data.readLines()
            var i : Int = 0
            while (i <= c.size)
            {
                var parts = c.get(i).split(",")
                if (parts.get(0).equals(empName))
                {

                    chkStatus = true
                    // From here implement what you need motherfucker
                    var the_percentage_from_sales = parts.get(2).toDouble() * percentageOfSales
                    println("Sales with Bonus For "+ parts.get(0) +" = U$ "+ (parts.get(1).toDouble() + the_percentage_from_sales))
                }
                if (chkStatus == true)
                {
                    break
                }
                else{
                    i++
                }

            }


        }
        catch (e:Exception)
        {

        }
    }
}