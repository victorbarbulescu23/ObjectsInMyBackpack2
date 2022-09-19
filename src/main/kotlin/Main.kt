fun main() {
    val myBackpack = arrayOf("Chromebook", "Pencils", "Notebooks", "Mouse", "Snacks")
    val qty = arrayOf("1", "5", "4", "1", "3")
    val origQty = qty

    var combArray = arrayOf<Array<String>>() //Declaring a 2D array
    //Row 1 is items, row 2 is current quantity, row 3 is original quantity
    combArray+= myBackpack
    combArray+= qty
    combArray+= origQty

    val rowCount = combArray[0].size-1
    var input = ""

    println("Would you like to search your backpack for items or add or subtract a number of your current items?")

    do {
        print("Type SEARCH to look for items. Type CHANGE to add or subtract a number of your current items. Type STOP to exit the program:  ")
        val userInput = readLine()!!.toString()
        if (userInput == "SEARCH"){
            do{
                print("What item are you looking for in your backpack? To stop, type BREAK: ")
                input = readLine().toString()
                for (i in 0..rowCount) {
                    if (input == combArray[0][i]) {
                        val item = combArray[0][i]
                        val quantity = combArray[1][i]
                        val originalQty = combArray[2][i]
                        println("Object Searched For: $item | Original Quantity: $originalQty | Current Quantity: $quantity")
                    }

                }
            }
            while (input != "BREAK")
        } else if (userInput == "CHANGE"){
            do{
                print("What item are you looking for in your backpack? To stop, type BREAK: ")
                input = readLine().toString()
                for (i in 0..rowCount) {
                    if (input == combArray[0][i]) {
                        val item = combArray[0][i]
                        var quantity = combArray[1][i].toInt()
                        val originalQty = combArray[2][i]
                        var math = 0
                        println()
                        print("The current quantity of your item is $originalQty. To add, type a positive number. To subtract, type a negative number: ")
                        math = readLine()!!.toInt()
                        quantity += math
                        if (quantity < 0){
                            println("ERROR: Quantity less than ZERO. Quantity SET TO ZERO")
                            quantity = 0
                        }
                        combArray[1][i] = quantity.toString()
                        println("Object Searched For: $item | Original Quantity: $originalQty | Added Quantity: $math | New Quantity: $quantity")
                    }

                }
            }
            while (input != "BREAK")
        }
    } while(userInput != "STOP")




}