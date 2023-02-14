fun main(args: Array<String>) {
    var i: Int
    var firstName: String
    var lastName: String
    var phoneNum1: String
    var phoneNum2: String
    var phoneNum3: String
    var mail: String
    
    val contactList = ContactList()
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
    }
    while (i != 0)

    println("Program arguments: ${args.joinToString()}")
}
