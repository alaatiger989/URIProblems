import java.io.File
import java.io.FileReader
import java.io.FileWriter

class Salary {
    val fileName = "data.txt"
    var chkStatus:Boolean = false
    public fun EnterNewEmployee(empNO : Int , hoursInMonth : Double , moneyPerHour : Double ) {
        var file = File(fileName)
        try {
            if (file.exists())
            {
                var fo = FileWriter(fileName , true)
                fo.write(empNO.toString()+","+hoursInMonth.toString()+","+moneyPerHour.toString()+"\n")
                fo.close()
                println("Data Registered Successfully")
            }
            else{
                println("The file is not existed")
                file.createNewFile()
                println("The file has been Created in " + file.absolutePath)
            }
        }catch (e:Exception)
        {

        }
    }

    public fun getSalary(empNO: Int){
        try {
            var data = FileReader(fileName)
            var c:List<String>?
            c = data.readLines()
            var i:Int = 0
            do {
//                println(c.get(i))
                val parts = c.get(i).split(",")
                if (parts.get(0).equals(empNO.toString()))
                {
                    chkStatus = true
                    // Here you can implement what you need
                    println("Number = " + parts.get(0))
                    println("Salary = U$ " + parts.get(1).toDouble() * parts.get(2).toDouble())
                }
                if(chkStatus == true)
                {
                    break
                }
                else{
                    i++
                }
            }while (i <= c.size)
        }
        catch (e:Exception)
        {

        }
    }
}