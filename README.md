# JavaContact



### **Project Description: Contact Manager**

**Purpose:**  
The purpose of this application is to manage a contact list, where each contact consists of a name and a phone number. Users can add, view, search, and delete contacts from the address book.

### **Key Components of the Project:**

1. **Class `Contact`:**
   - **Attributes:**
     - `name`: The name of the contact (type `String`).
     - `phoneNumber`: The phone number of the contact (type `String`).
   - **Methods:**
     - `getName()`: Returns the contact's name.
     - `getPhoneNumber()`: Returns the contact's phone number.
     - `setName()`: Sets the contact's name.
     - `setPhoneNumber()`: Sets the contact's phone number.
     - `toString()`: Returns a string representation of the contact (e.g., `name: John, Phone number: 123456789`).

2. **Class `ContactManager` - Console-based:**
   - Manages a list of contacts, represented by an `ArrayList<Contact>`.
   - **Functionality:**
     - **Add Contact:** Allows the user to input a new contact's name and phone number.
     - **View Contacts:** Displays all the contacts in the address book.
     - **Search Contact:** Allows the user to search for a contact by name.
     - **Delete Contact:** Allows the user to delete a contact by name.
   - The program presents a console interface that shows a menu with available options for the user.

3. **Class `ContactManagerGUI` - GUI-based:**
   - This version of the application uses a **graphical user interface (GUI)** built with **Swing** (Java's library for GUI).
   - The main window contains:
     - **Text Area:** For displaying the list of contacts or search results.
     - **Text Fields:** For entering a contact's name and phone number.
     - **Buttons:** For adding, searching, viewing, and deleting contacts from the address book.
   - **Functionality in GUI:**
     - **Add Contact:** Users can enter the contact name and phone number in text fields and click a button to add it to the list.
     - **View Contacts:** Displays all contacts in the list.
     - **Search Contact:** Allows the user to search for a contact by name and shows the result in the text area.
     - **Delete Contact:** Allows the user to remove a contact from the list.
   - User actions (such as clicking a button) are handled by event listeners that call the corresponding methods (add, search, view, delete).

### **Program Workflow:**

1. **Starting the Program:**
   - The user starts the program (either in console or GUI mode).
   - If using the GUI version, a window with the graphical interface is opened.
   - If using the console version, the program displays a menu with options (add, search, view, delete).

2. **Adding a Contact:**
   - The user enters the name and phone number of the contact.
   - The contact is added to the contact list.

3. **Viewing Contacts:**
   - The user can view all contacts in the list.
   - Contacts are displayed in the text area or on the console.

4. **Searching for a Contact:**
   - The user can search for a contact by entering the name.
   - If the contact is found, the information is displayed in the text area.

5. **Deleting a Contact:**
   - The user can delete a contact from the list by entering the name.
   - If the contact is found, it is removed from the list.

### **Technologies Used:**
- **Java**: The core programming language.
- **Swing**: Java's GUI library for creating the graphical user interface.
- **ArrayList**: Used to store the contacts in a dynamic list.

### **Final Notes:**
This Contact Manager project allows users to efficiently manage their contact list, either via a console-based interface or a graphical user interface. It's a great project for demonstrating Java programming skills, including object-oriented design, data structures (ArrayLists), and GUI development using Swing.
