fun main(args: Array<String>) {

    val person = Person("Eva", "lastName", "07312345678", "0", "0", "Mail@gmail.com")
    val person2 = Person("Adam", "lastName22", "0723456784", "01273122", "0", "Mail2@gmail.com")
    val person3 = Person("David", "lastName22", "0723456784", "01273122", "012321314", "Mail2@gmail.com")
    val contactList = ContactList()

    contactList.addContact(person)
    contactList.addContact(person2)
    contactList.addContact(person3)
    contactList.showContactList()
    contactList.removeContact(1)
    println("Newlist: \n")
    contactList.showContactList()

    println("Program arguments: ${args.joinToString()}")
}
