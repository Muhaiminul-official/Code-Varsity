
//    Pre - Increment(++i) : This operator increases the value of i by 1 before its value is used in an expression.

//    Post - Increment(i++) : This operator increases the value of i by 1 after its value is used in an expression.

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int x = 0;
  int y = 0;
  if (x++ && y++)
  {
    cout << x << " " << y << endl;
  }
  else
  {
    cout << y << " " << x << endl;
  }
  return 0;
}

// ===========================================
// OutPut : 0  1
// ===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int x = 0;
  int y = 0;
  if (++x && y++)
  {
    cout << x << " " << y << endl;
  }
  else
  {
    cout << y << " " << x << endl;
  }
  return 0;
}

// ===========================================
// OutPut : 1  1
// ===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int a = 1;
  int b = 1;
  if (a-- || b-- && ++a) // OR -- First Conditon Checked
  {
    cout << a << " " << b << endl;
  }
  else
  {
    cout << b << " " << a << endl;
  }
  return 0;
}

//===========================================
// OutPut : 0 1
//===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int a = 3;
  int b = 4;
  if (!a > -b)
  {
    cout << a << " " << b << endl;
  }
  else
  {
    cout << b << " " << a << endl;
  }
  return 0;
}
//===========================================
// OutPut : 3  4
//===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int x;
  x = 3, 4, 5;
  cout << x * x << " " << ++x << " " << x++ << " " << endl;

  x = (3, 4, 5);
  cout << x * x << " " << ++x << " " << x++ << " " << endl;

  return 0;
}

//===========================================
// OutPut : 9  4  4
//         25  6  6
//===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int a = 1, b = 0, c = 0;
  while (a > b > c)
  {
    b = a + b + c;
    ++a;
    cout << a << " " << b << " " << c << endl;
  }
  return 0;
}

//===========================================
// OutPut : 2 1 0
//          3 3 0
//===========================================

#include <iostream>
#include <string>
using namespace std;
int main()
{
  int a = 5, b = 6;
  a = ++a;
  cout << a;

  // static int a = 5, b = 6;
  // a=++a;
  // cout << a;

  return 0;
}

//=========================================
//  OutPut : 6
//=========================================

#include <iostream>
#include <string>
#include <conio.h>
using namespace std;

int myfun()
{
  static int x = 4;
  cout << x << endl;
  return (--x);
}
int main()
{
  while (myfun())
    ;
  getch();
}

// ========================================
// OutPut : 4  3  2  1  0
// ========================================