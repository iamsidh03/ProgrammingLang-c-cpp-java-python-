#include <iostream>
using namespace std;

class Human {
protected:
    string name;
    int age, weight;

    Human(string name,int age ,int weight){
        this->name = name;
        this->age = age;
        this->weight = weight;
    }

public:
        void work() {
        cout << "Human is working" << endl;
    }
    // Virtual destructor for base class
    virtual ~Human() {
        cout << "Human destructor called" << endl;
    }
};

class Student : public Human {
    int rollNumber, fees;

public:
    // Parameterized constructor
    Student(string name, int age, int weight, int rollNo, int fees):Human(name,age,weight) /* initializer list syntax */ {
        
        rollNumber = rollNo;
        this->fees = fees;
    }

    void display() {
        cout << "Name is " << name
             << "\nAge is " << age
             << "\nWeight is " << weight
             << "\nRoll Number: " << rollNumber
             << "\nFee is " << fees << endl;
    }

    ~Student() {
        cout << "Student destructor called" << endl;
    }
};

int main() {
    Student s1("John", 20, 60, 101, 5000);
    s1.display();
    s1.work();
}
