/*
What is string::npos exactly?
It's just a very big number (like 4294967295 or even more), used as a special signal to mean “not found”.

You don’t need to remember the actual number. Just remember:

If .find() gives string::npos, then the substring was not found.

If it gives a normal number (like 0, 1, 2...), then it was found at that position.*/
#include<iostream>
using namespace std;
