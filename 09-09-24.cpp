#include <iostream>
#include <string>
using namespace std;

int fun1(int a, int b)
{
  int c;
  c = a, a = b, b = c;

  return 0;
}

int fun2(int *a, int *b)
{
  int c;
  c = *a, *a = *b, *b = c;

  return 0;
}

int main()
{
  int a = 4, b = 5, c = 6;
  fun1(a, b);
  fun2(&b, &c);
  cout << "c-a-b:  " << c - a - b << endl;
  return 0;
}


//===========================================
// OutPut : c-a-b:  -5
//===========================================

#include <iostream>
#include <string>
using namespace std;

int f1(void);
int f2(void);
int f3(void);

int x = 10; // Global variable x initialized to 10

int main()
{
  x = x + f1() + f2() + f3() + f2(); // x is modified by adding the results of these function calls
  cout << x << endl;                 // Prints the value of x after all the function calls
  return 0;
}

int f1(void)
{
  int x = 25; // Local variable x (different from the global one)
  x++;        // Increment local x, so x becomes 26
  return x;   // Return 26
}

int f2(void)
{
  static int x = 50; // Static local variable, retains its value between calls
  x++;               // Increment static x, so the first time it becomes 51
  return x;          // Return the updated value of x
}

int f3(void)
{
  x *= 10;  // Modify the global variable x by multiplying it by 10
  return x; // Return the updated global x
}
//=========================================== 
// OutPut : 239
//===========================================

#include <iostream>
#include <string>
using namespace std;

int main()
{
  static int a[] = {10, 20, 30, 40, 50};             // Array 'a' initialized with values
  static int *p[] = {a, a + 3, a + 4, a + 1, a + 2}; // 'p' is an array of pointers, pointing to elements of 'a'
  int **ptr = p;                                     // 'ptr' points to the first element of array 'p'

  ptr++; // Increment 'ptr' to point to the second element of 'p'

  cout << ptr - p << " " << **ptr << endl; // Print the difference between 'ptr' and 'p', and dereference 'ptr'

  return 0;
}


//===========================================
// OutPut : 1  40
//===========================================

#include<iostream>
#include<string>
using namespace std;

int Jum(int x, int y){
  x = 2 * x + y;
  return x;
}

int main()
{
  int x = 2, y = 5;
  y = Jum(y, x);
  x = Jum(y, x);
  cout << x << endl;
  return 0;
}