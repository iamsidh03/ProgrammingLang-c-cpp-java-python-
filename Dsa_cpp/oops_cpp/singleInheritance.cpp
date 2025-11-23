/* this program check which one called first parent constructor or child constructor */

#include <iostream>
using namespace std;

class Human {
protected:
    Human() {
        cout << "Human constructor called" << endl;
    }

    ~Human() {
        cout << "Human destructor called" << endl;
    }
};

class Student : public Human {
public:
    Student() {
        cout << "Student constructor called" << endl;
    }

    ~Student() {
        cout << "Student destructor called" << endl;
    }
};

int main() {
    Student s1;
    return 0;
}
