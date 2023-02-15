fun main(args: Array<String>) {
    var i: Int
    var ID: Int
    var firstName: String
    var lastName: String
    var phoneNum1: String
    var phoneNum2: String
    var phoneNum3: String
    var mail: String

    //Objekt contactList skapas
    val contactList = ContactList()
    //Lägger till 3 personer i kontakt lista
    contactList.addContact(Person("David", "lastName" , "1234567", "0", "0", "David@gmail.com"))
    contactList.addContact(Person("Adam", "lastName2", "9876543", "9374683", "0", "Adam@gmail.com"))
    contactList.addContact(Person("Eva", "lastName3", "4676543", "235345", "3456456", "Eva@gmail.com"))

    //Meny med val
    do{
        println("1. Add contact")
        println("2. Remove contact")
        println("3. Edit contact")
        println("4. Show contact list")
        println("0. Exit")
        i = Integer.valueOf(readln())

        if(i == 1){
            print("Person firstname: ")
            firstName = readln()
            print("Person lastname: ")
            lastName = readln()
            print("Person phone-number 1 (if there is no phone number input 0): ")
            phoneNum1 = readln()
            print("Person phone-number 2 (if there is no phone number input 0): ")
            phoneNum2 = readln()
            print("Person phone-number 3 (if there is no phone number input 0): ")
            phoneNum3 = readln()
            print("Person mail: ")
            mail = readln()
            contactList.addContact(Person(firstName, lastName, phoneNum1, phoneNum2, phoneNum3, mail))
        }
        else if(i == 2){
            print("Person ID: ")
            ID = Integer.valueOf(readln())
            contactList.removeContact(ID)
        }
        else if(i == 3){
            print("Person ID: ")
            ID = Integer.valueOf(readln())
            contactList.editContact(ID)
        }
        else if(i == 4){
            contactList.showContactList()
        }
    }
    while (i != 0)




    println("Program arguments: ${args.joinToString()}")
}
