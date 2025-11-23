#include<iostream>
using namespace std;
#include<vector>
class Animal{

    public:
   virtual  void speak(){
        cout<<"huhu\n"<<endl;
    }
};

class Dog: public Animal{

    public:
    void speak(){
        cout<<"Bark\n";
    }
};
class Cat : public Animal{
    public:
    void speak(){
        cout<<"Meow\n";
    }
};
    


int main(){

/*  Animal *p;
 p=new Dog();
 p->speak(); */

    Animal *p;
    vector<Animal*> animals;
    animals.push_back(new Dog());
    animals.push_back(new Cat());
    animals.push_back(new Dog());
    animals.push_back(new Cat());
    animals.push_back(new Animal());  // this will print "huhu"


    for(int i = 0; i < animals.size(); i++){
        p = animals[i];
        p->speak();
    }
 
}