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

    fun printperson(ID: Int){
        println("First name;" + contactList[ID].firstName)
        println("First name;" + contactList[ID].lastName)
        println("First name;" + contactList[ID].phoneNumber1)
        println("First name;" + contactList[ID].phoneNumber2)
        println("First name;" + contactList[ID].phoneNumber3)
        println("First name;" + contactList[ID].mailAddress)
    }
    fun editContact(ID: Int){
        val PersonVaribales = arrayOf("firstName", "lastName", "phoneNumber1", "phoneNumber2", "phoneNumber3", "mailAddress")

        println("what information do you want to change?")
        printperson(ID)
        var WhatToChange = readln()

        if(WhatToChange == PersonVaribales[0])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
        else if(WhatToChange == PersonVaribales[1])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
        else if(WhatToChange == PersonVaribales[2])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
        else if(WhatToChange == PersonVaribales[3])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
        else if(WhatToChange == PersonVaribales[4])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
        else if(WhatToChange == PersonVaribales[5])
        {
            println("Write the new first name;")
            var newFirstname = readln()
            contactList[ID].firstName = newFirstname
        }
    }

    fun showContactList(){
        //Ska visas i alfabetisk ordning
        println("Contact List:")
        contactList.sortBy { it.firstName }

        for((i) in contactList.withIndex()){
            if(contactList[i].phoneNumber1 == "0"){
                println(contactList[i].firstName + "\n" + contactList[i].lastName + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else if(contactList[i].phoneNumber2 == "0"){
                println(contactList[i].firstName + "\n" + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 +
                        "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else if(contactList[i].phoneNumber3 == "0"){
                println(contactList[i].firstName + "\n" + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                        contactList[i].phoneNumber2 + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
            else{
                println(contactList[i].firstName + "\n" + contactList[i].lastName + "\n" + contactList[i].phoneNumber1 + "\n" +
                        contactList[i].phoneNumber2 + "\n" + contactList[i].phoneNumber3 + "\n" + contactList[i].mailAddress)
                println("------------------------------------------------------")
            }
    }
}
