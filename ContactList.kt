class ContactList{
    private val contactList = mutableListOf<Person>()

    fun addContact(person: Person){
        contactList.add(person)
    }

    fun removeContact(person: Person, index: Int){
        if (contactList.count() >= index)
        {
            contactList.removeAt(index)
        }
    }

    fun editContact(person:Person){

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
