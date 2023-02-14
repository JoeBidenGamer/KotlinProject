class ContactList{
    private val contactList = mutableListOf<Person>()

    fun addContact(person: Person){
        contactList.add(person)
    }

}