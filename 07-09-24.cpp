#include<iostream>
#include<string>
using namespace std;

void PtrFun(void){
  static int a = 2;
  int b = 1;
  a += ++b;
  cout << a << " " << b << endl;
}

int b = 0;
int main()
{
  static int a = 1;
  PtrFun();
  a += 1;
  PtrFun();
  cout << a << " " << b << endl;
  return 0;
}

//===========================================
// OutPut : 4  2
//          6  2
//          2  0
//===========================================

#include <iostream>
#include <string>
using namespace std;

int fun(int *a, int x)
{
  if (x <= 0)
    return 0;
  else if (*a % 2 == 0)
    return *a + fun(a + 1, x - 1);
  else
    return *a - fun(a + 1, x - 1);
}

int main()
{
  int a[] = {
      12, 7, 13, 4, 11, 6};
  cout << fun(a, 6) << endl;
  return 0;
}


//===========================================
// OutPut : 15
//===========================================