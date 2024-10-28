#include<iostream>
#include<string>
using namespace std;

int fun(){
  int static num = 7;
  return --num;
}
int main()
{
  for (fun(); fun(); fun()){
    cout << fun() << endl;
  }
    return 0;
}

//===========================================
// OutPut : 5  2 (post decrement)
//          intfinite (pre decrement)
//===========================================

#include <iostream>
#include <string>
using namespace std;

void fun1(char s1, char s2)
{
  char temp = s1; // Store the pointer to the first string
  s1 = s2;        // Point s1 to the second string
  s2 = temp;       // Point s2 to the first string
}

void fun2(char **s1, char **s2)
{
  char *temp = *s1; // Store the pointer to the first string
  *s1 = *s2;        // Point s1 to the second string
  *s2 = temp;       // Point s2 to the first string
}

int main()
{
  char *s1 = "Hello"; // Initialize s1 as a pointer to a string literal
  char *s2 = "World"; // Initialize s2 as a pointer to a string literal

  fun1(*s1, *s2);                  //Don't Swap the strings using fun1
  cout << s1 << " " << s2 << endl; // Output: World Hello

  fun2(&s1, &s2);                  // Swap the strings back using fun2
  cout << s1 << " " << s2 << endl; // Output: Hello World

  return 0;
}
