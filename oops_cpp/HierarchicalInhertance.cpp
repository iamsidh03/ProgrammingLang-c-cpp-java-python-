#include <iostream>
using namespace std;

// Base class
class Person {
protected:
    string name;
    int age;

public:
    Person(string name, int age) {
        this->name = name;
        this->age = age;
    }

    void displayPerson() {
        cout << "Name: " << name << "\nAge: " << age << endl;
    }
};

// Derived class 1
class Student : public Person {
    int rollNo;

public:
    Student(string name, int age, int rollNo) 
        : Person(name, age), rollNo(rollNo) {}

    void displayStudent() {
        displayPerson();
        cout << "Roll Number: " << rollNo << endl;
    }
};

// Derived class 2
class Employee : public Person {
    double salary;

public:
    Employee(string name, int age, double salary) 
        : Person(name, age), salary(salary) {}

    void displayEmployee() {
        displayPerson();
        cout << "Salary: " << salary << endl;
    }
};

// Derived class 3
class Teacher : public Person {
    string subject;

public:
    Teacher(string name, int age, string subject) 
        : Person(name, age), subject(subject) {}

    void displayTeacher() {
        displayPerson();
        cout << "Subject: " << subject << endl;
    }
};

int main() {
    Student s("Alice", 20, 101);
    Employee e("Bob", 30, 50000);
    Teacher t("Charlie", 40, "Mathematics");

    cout << "\n--- Student ---\n";
    s.displayStudent();

    cout << "\n--- Employee ---\n";
    e.displayEmployee();

    cout << "\n--- Teacher ---\n";
    t.displayTeacher();

    return 0;
}
