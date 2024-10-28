#include <iostream>
#include <string>
using namespace std;
int main()
{
  int s = 0, g;
  int n;
  cout << "Enter the value of n: " << endl;
  cin >> n;
  while (n > 0)
  {
    if (n % 2 == 1)
      n /= 10;
    cout << "n: " << n << endl;
    g = n % 10;
    cout << "g: " << g << endl;
    s = s + g;
    cout << "s: " << s << endl;
    n /= 5;
    cout << "n: " << n << endl
         << endl;
  }
  cout << "S: " << s << endl
       << endl
       << endl;
  return 0;
}

// ===========================================
// OutPut : n : 657   g : 7   s : 7     n : 131

//          n : 13   g : 3    s : 10   n : 2

//          n : 2    g : 2    s : 12    n : 0

//                                      S : 12
// ===========================================

#include <iostream>
#include <string>
using namespace std;

int main()
{
  for (int m = 5; m <= 20; m += 5)
  {
    if (m % 3 == 0)
      break;
    else if (m % 5 == 0)
    cout << m << endl;
      continue;
  }
  return 0;
}

//============================================
// OutPut : 5     10
//============================================

#include<iostream>
#include<string>
using namespace std;
int main()
{
  for (int i = 5; i <= 10 ; i++)
  {
    if((i+2)%2 == 0)
    continue;
    else
      cout << "i: " << i << endl;
  }
    return 0;
}

//============================================
// OutPut :  i=5   i: 7   i: 9
//============================================

#include <iostream>
#include <string>
using namespace std;
int main()
{

  for (int i = 1; i <= 10; i++)
  {
    cout << "i: " << i++ << endl;
  }

  return 0;
}

//============================================
// OutPut : i: 1  i : 3   i : 5  i : 7   i : 9
//============================================

#include <iostream>
#include <string>
using namespace std;

int sum(int x)
{
  int s = 0;
  if (x == 1)
    return x;
  s = x + sum(x - 1);
  return s;
}

int main()
{
  int a;
  a = sum(5);
  cout << "a: " << a << endl;
  return 0;
}

//=============================================
// OutPut:  a = 15
//=============================================

#include <iostream>
#include <string>
using namespace std;

int fun1(int x);
int fun2(int x);

int main()
{
  cout << "Value of fun(5) is: " << fun1(5) << endl;
  return 0;
}
int fun1(int x)
{
  if (x <= 1)
    return 1;
  else
    return x * fun2(x - 1);
}
int fun2(int x)
{
  if (x <= 1)
    return 1;
  else
    return x * fun1(x - 1);
}

// =============================================
// Value of fun(5) is : 120
// =============================================

//  Tail Recursion

#include <iostream>
#include <string>
using namespace std;

void fun(int x)
{
  if (x == 0)
    return;
  --x;
  cout << "x: " << x << endl;
  fun(x);
  cout << "fun stack value: " << x << endl;
}

int main()
{
  fun(3);
  return 0;
}

//==============================================
// x : 2 
// x : 1 
// x : 0 
// fun stack value : 0 
// fun stack value : 1 
// fun stack value : 2
//==============================================
