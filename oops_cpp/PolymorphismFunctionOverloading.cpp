#include<iostrem>
using namespace std;

class Area{

    int calAre(int radius){
        return 3.14*radius*radius;
    }

    int calAre(int a,int b){
        return int a*int b;
    }
    void display(){
        
    }
};
int main(){
   Area calArea(4,6);
   Area calArea(4);
}