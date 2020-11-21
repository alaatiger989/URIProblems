fun main(args : Array<String>){
    print("Enter the number of Question : ")
    val number_of_question = readLine()!!
    when(number_of_question.toInt())
    {
        1 -> {
            var firstQuestion = SumOf2Numbers()
            println("Enter Two Numbers For Summation : ")
            print("Enter number #1 : ")
            val number_1_reader = readLine()!!
            print("Enter number #2 : ")
            val number_2_reader = readLine()!!
            println("Sum = " + firstQuestion.getSumOfTwoNumbers(number_1_reader.toInt() , number_2_reader.toInt() ))
        }
        2 -> {
            var secondQuestion = AreaOfCircle()
            println("Enter the radius Of Circle For Area : ")
            val radius_reader = readLine()!!
            println("Area of Circle = " + secondQuestion.getAreaOfCircle(radius_reader.toDouble()))
        }
        3 -> {
            var thirdQuestion = SimpleSum()
            print("Enter First Number : ")
            val number_1_reader = readLine()!!
            print("Enter Second Number : ")
            val number_2_reader = readLine()!!
            println("Simple Sum = " + thirdQuestion.getSimpleSum(number_1_reader.toInt() , number_2_reader.toInt()))
        }
        4 -> {
            var fourthQuestion = SimpleProduct()
            print("Enter No.1 : ")
            val number1_reader = readLine()!!
            print("Enter No.2 : ")
            val number2_reader = readLine()!!
            println("Simple Product = " + fourthQuestion.getSimpleProduct(number1_reader.toInt() , number2_reader.toInt()))
        }
        5 -> {
            var fifthQuestion = Average1()
            print("Enter no.1 : ")
            val number1_reader = readLine()!!
            print("Enter no.2 : ")
            val number2_reader = readLine()!!
            println("Weighted Average = " + Math.round(fifthQuestion.getWeightedAverage(number1_reader.toDouble() , number2_reader.toDouble()) * (Math.pow(10.0 , 5.0))) / Math.pow(10.0 , 5.0))
        }
        6 -> {
            var sixthQuestion = Average2()
            print("Enter no.1 : ")
            val number_1_reader = readLine()!!
            print("Enter no.2 : ")
            val number_2_reader = readLine()!!
            print("Enter no.3 : ")
            val number_3_reader = readLine()!!
            println("Student Average = " + Math.round(sixthQuestion.getWeightedAverageForStudent(number_1_reader.toDouble() , number_2_reader.toDouble() , number_3_reader.toDouble()) * Math.pow(10.0 , 1.0)) / Math.pow(10.0 , 1.0))
        }
        7 -> {
            var seventhQuestion = Difference()
            print("Enter no.1 : ")
            val number_1_reader = readLine()!!
            print("Enter no.2 : ")
            val number_2_reader = readLine()!!
            print("Enter no.3 : ")
            val number_3_reader = readLine()!!
            print("Enter no.4 : ")
            val number_4_reader = readLine()!!
            println("Differece = " + seventhQuestion.getDifference(number_1_reader.toInt()
                                                                    , number_2_reader.toInt()
                                                                    , number_3_reader.toInt()
                                                                    , number_4_reader.toInt()))
        }
        8 -> {

            println("1 : Enter new Employee : ")
            println("2 : Read Data of Employee : ")
            print("Enter the Operation your need : ")
            val op = readLine()!!.toInt()
            var eighthQuestion = Salary()
            when(op)
            {
                1 -> {
                    print("Enter Employee Number : ")
                    val emp_number = readLine()!!.toInt()
                    print("Enter The Hours Per Money : ")
                    val hours_per_month_reader = readLine()!!.toDouble()
                    print("Enter The Money Per Hour : ")
                    val money_per_hour_reader = readLine()!!.toDouble()
                    eighthQuestion.EnterNewEmployee(emp_number , hours_per_month_reader , money_per_hour_reader)
                }
                2 -> {
                    print("Enter the Employee Number : ")
                    val emp_number = readLine()!!.toInt()
                    eighthQuestion.getSalary(emp_number)
                }
            }
        }
        9 -> {
            var ninethQuestion = SalaryWithBonus()
            println("1 : Enter the new Employee")
            println("2 : Calculate Salary with Bonus")
            print("Enter the number of Operation : ")
            val number_of_operation = readLine()!!.toInt()
            when(number_of_operation)
            {
                1 -> {
                    print("Enter Employee Name : ")
                    val emp_name = readLine()!!
                    print("Enter The Fixed Salary Per Month : ")
                    val fixed_salary_per_month = readLine()!!.toDouble()
                    print("Enter The Sales Per Month : ")
                    val sales_per_month = readLine()!!.toDouble()
                    ninethQuestion.EnterNewEmployee(emp_name , fixed_salary_per_month , sales_per_month)
                }
                2 -> {
                    print("Enter the Employee Name : ")
                    val emp_name = readLine()!!
                    ninethQuestion.getSalaryWithBonus(emp_name)
                }
            }


        }
    }



}
