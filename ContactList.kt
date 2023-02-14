class ContactList{
    private val contactList = mutableListOf<Person>()

    fun addContact(person: Person){
        contactList.add(person)
    }

    fun removeContact(index: Int){
        if (contactList.count() >= index)
        {
            contactList.removeAt(index)
        }
    }

    fun editContact(ID: Int){
        var newValue: String
        val PersonVaribales = arrayOf("firstName", "lastName", "phoneNumber1", "phoneNumber2", "phoneNumber3", "mailAddress")

        println("What information do you want to change?")
        println("firstName: " + contactList[ID].firstName)
        println("lastName: " + contactList[ID].lastName)
        println("phoneNumber1: " + contactList[ID].phoneNumber1)
        println("phoneNumber2: " + contactList[ID].phoneNumber2)
        println("phoneNumber3: " + contactList[ID].phoneNumber3)
        println("mailAddress: " + contactList[ID].mailAddress)
        var editElement = readln()

        if(editElement == PersonVaribales[0])
        {
            println("Write the new firstname:")
            newValue = readln()
            contactList[ID].firstName = newValue
        }
        else if(editElement == PersonVaribales[1])
        {
            println("Write the new lastname;")
            newValue = readln()
            contactList[ID].lastName = newValue
        }
        else if(editElement == PersonVaribales[2])
        {
            println("Write the new phone-number 1:")
            newValue = readln()
            contactList[ID].phoneNumber1 = newValue
        }
        else if(editElement == PersonVaribales[3])
        {
            println("Write the new phone-number 2:")
            newValue = readln()
            contactList[ID].phoneNumber2 = newValue
        }
        else if(editElement == PersonVaribales[4])
        {
            println("Write the new phone-number 3:")
            newValue = readln()
            contactList[ID].phoneNumber3 = newValue
        }
        else if(editElement == PersonVaribales[5])
        {
            println("Write the new mail:")
            newValue = readln()
            contactList[ID].mailAddress = newValue
        }
    }

    fun showContactList(){
        //Ska visas i alfabetisk ordning
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
