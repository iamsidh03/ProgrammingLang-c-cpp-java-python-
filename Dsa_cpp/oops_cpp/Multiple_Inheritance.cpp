#include <iostream>
using namespace std;

class student {
protected:
    string name;
};

class study {
public:
    string specialization;

    void studyInfo() {
        cout << "I study " << specialization << endl;
    }
};

class passion {
public:
    string job;

    void happyWork() {
        cout << "I feel happy when I do " << job << endl;
    }
};

class happiness : public student, public study, public passion {
public:
    bool isHappy;

    // Constructor
    happiness(string name, string specialization, string job, bool isHappy) {
        this->name = name;
        this->specialization = specialization;
        this->job = job;
        this->isHappy = isHappy;
    }

    void display() {
        cout << "Name: " << name
             << "\nSpecialization: " << specialization
             << "\nJob: " << job
             << "\nHappy Status: " << (isHappy ? "Yes " : "No ")
             << endl;
    }
};

int main() {
    happiness h("Siddharth", "Computer Science", "Coding", true);

    h.display();
    h.studyInfo();
    h.happyWork();

    return 0;
}
