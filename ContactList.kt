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
}
