#include<iostream>
using namespace std;
//last occurrence of a a character in array
int lastocc(string &s,char& tar,int idx,int ans=-1){ 
    /*approrach  move the string from left to right when equal to target return the index*/
    //base case
  
    if(idx>=s.size()){
        return ans;
    }
    if(s[idx]==tar){
        ans=idx;
    }
    return lastocc(s,tar,idx+1,ans);
}
// Function to find last occurrence of a character in a C-style char array
int findLastOccurrence(const char* arr, char target) {
    std::string str(arr);  // Convert char array to std::string
    size_t pos = str.rfind(target);

    return (pos != std::string::npos) ? static_cast<int>(pos) : -1;
}
int main(){
    // string s;
    // cin>>s; //abcddefg
    // char tar; //d
    // cin>>tar;
    // int idx =0;
    // int ans = lastocc(s,tar,idx);
    // cout<<ans<<endl;






    const char* input = "programming";
    char ch = 'g';

    int index = findLastOccurrence(input, ch);

    if (index != -1) {
        std::cout << "Last occurrence of '" << ch << "' is at index: " << index << std::endl;
    } else {
        std::cout << "Character not found." << std::endl;
    }
    return 0;
}