import java.io.File

class ContactList{
    private val contactList = mutableListOf<Person>()

    //Lägger till en person i kontakt lista
    fun addContact(person: Person){
        contactList.add(person)
    }

    //Ta bort en person från listan på plats ID
    fun removeContact(ID: Int){
        /*Om antal personer i listan är större eller är lika med ID
        Ta bort personen på plats ID*/
        try{
            contactList.removeAt(ID)
            println("Person successfully removed!")
        }
        catch (e: Exception){
            println("The person with ID (${ID}) doesn't exist")
        }
    }
    fun Search(id: String){
        val contactListSearch = mutableListOf<Person>()
    try {
        for ((i) in contactList.withIndex()) {
            if (contactList[i].firstName == id) {
                contactListSearch.add(contactList[i])
            } else if (contactList[i].lastName == id) {
                contactListSearch.add(contactList[i])
            } else if (contactList[i].mailAddress == id) {
                contactListSearch.add(contactList[i])
            } else if (contactList[i].phoneNumber1 == id) {
                contactListSearch.add(contactList[i])
            } else if (contactList[i].phoneNumber2 == id) {
                contactListSearch.add(contactList[i])
            } else if (contactList[i].phoneNumber3 == id) {
                contactListSearch.add(contactList[i])
            }
        }
        for ((i) in contactListSearch.withIndex()) {
            println("------------------------------------------------------")
            println("firstName: " + contactListSearch[i].firstName)
            println("lastName: " + contactListSearch[i].lastName)
            println("phoneNumber1: " + contactListSearch[i].phoneNumber1)
            println("phoneNumber2: " + contactListSearch[i].phoneNumber2)
            println("phoneNumber3: " + contactListSearch[i].phoneNumber3)
            println("mailAddress: " + contactListSearch[i].mailAddress)
            println("------------------------------------------------------")
        }
    }
    catch (e: Exception){
        println("Error; Cloud not find A perosn who fit the peramator")
    }
    }

    fun editContact(ID: Int){
        var newValue: String
        val personVariables = arrayOf("firstName", "lastName", "phoneNumber1", "phoneNumber2", "phoneNumber3", "mailAddress")
        try{
            //Väljer vilken information som ska ändras
            println("What type information do you want to change?")
            println("firstName: " + contactList[ID].firstName)
            println("lastName: " + contactList[ID].lastName)
            println("phoneNumber1: " + contactList[ID].phoneNumber1)
            println("phoneNumber2: " + contactList[ID].phoneNumber2)
            println("phoneNumber3: " + contactList[ID].phoneNumber3)
            println("mailAddress: " + contactList[ID].mailAddress)
            var informationToEdit = readln()

            /*Kolla om typen av information som ska ändras stämmer,
            om det stämmer ska informationen ändras*/
            if(informationToEdit == personVariables[0])
            {
                println("Write the new firstname:")
                newValue = readln()
                contactList[ID].firstName = newValue
                println("Information successfully changed!")
            }
            else if(informationToEdit == personVariables[1])
            {
                println("Write the new lastname;")
                newValue = readln()
                contactList[ID].lastName = newValue
                println("Information successfully changed!")
            }
            else if(informationToEdit == personVariables[2])
            {
                println("Write the new phone-number 1:")
                newValue = readln()
                contactList[ID].phoneNumber1 = newValue
                println("Information successfully changed!")
            }
            else if(informationToEdit == personVariables[3])
            {
                println("Write the new phone-number 2:")
                newValue = readln()
                contactList[ID].phoneNumber2 = newValue
                println("Information successfully changed!")
            }
            else if(informationToEdit == personVariables[4])
            {
                println("Write the new phone-number 3:")
                newValue = readln()
                contactList[ID].phoneNumber3 = newValue
                println("Information successfully changed!")
            }
            else if(informationToEdit == personVariables[5])
            {
                println("Write the new mail:")
                newValue = readln()
                contactList[ID].mailAddress = newValue
                println("Information successfully changed!")
            }
            else{
                println("There is no information with the name ($informationToEdit)")
            }
        }
        catch (e: Exception){
            println("The person with ID ($ID) doesn't exist")
        }
    }

    fun showContactList(){
        //Vis kontakt lista. Om personen inte har telefonnummer visas inte telefonnummer.
        println("Contact List:")
        contactList.sortBy { it.firstName }

        for((i) in contactList.withIndex()){
            if(contactList[i].phoneNumber1 == "0"){
                println("ID: " + i + "\n" + contactList[i].firstName + " "  + contactList[i].lastName + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else if(contactList[i].phoneNumber2 == "0"){
                println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 +
                        "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else if(contactList[i].phoneNumber3 == "0"){
                println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                        contactList[i].phoneNumber2 + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else if(contactList[i].firstName == ""){
                println("Empty List!!!")
            }
            else{
                println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                        contactList[i].phoneNumber2 + "\n" + contactList[i].phoneNumber3 + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
        }
    }

    fun saveToTxtFile(){
        try{
            //Variabel till text filen
            val myFile = File("kotlinSave.txt")
            //Skriver information till text filen
            myFile.printWriter().use {
                    out ->

                for((i) in contactList.withIndex()){
                    if(contactList[i].phoneNumber1 == "0"){
                        out.println("ID: " + i + "\n" + contactList[i].firstName + " "  + contactList[i].lastName + "\n" + contactList[i].mailAddress)
                        out.println("------------------------------------------------------")
                    }
                    else if(contactList[i].phoneNumber2 == "0"){
                        out.println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 +
                                "\n" + contactList[i].mailAddress)
                        out.println("------------------------------------------------------")
                    }
                    else if(contactList[i].phoneNumber3 == "0"){
                        out.println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                                contactList[i].phoneNumber2 + "\n" + contactList[i].mailAddress)
                        out.println("------------------------------------------------------")
                    }
                    else if(contactList[i].firstName == ""){
                        out.println("Empty List!!!")
                    }
                    else{
                        out.println("ID: " + i + "\n" + contactList[i].firstName + " " + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                                contactList[i].phoneNumber2 + "\n" + contactList[i].phoneNumber3 + "\n" + contactList[i].mailAddress)
                        out.println("------------------------------------------------------")
                    }
                }
            }
        }
        catch (e: Exception){
            e.printStackTrace()
        }
    }

    fun readFromTxtFile(){
        try{
            //Läser information från text filen och skriver ut det
            val lines : List<String> =File("kotlinSave.txt").readLines()
            lines.forEach{line -> println(line)}
        }
        catch (e: Exception){
            e.printStackTrace()
        }
        finally {
            println("Read successfully!")
        }

    }
}
