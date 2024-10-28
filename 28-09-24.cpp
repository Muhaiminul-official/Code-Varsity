
#include<iostream>
#include<string>
using namespace std;
bool isPrime(int x){
  if(x==0||x==1){
    return false;
  }else if(x%2==0 && x!=2){
    return false;
  }else{
    for (int i = 3; i < sqrt(x);i+=2){
        if(x%i==0){
          return false;
        }
    }
  }
  return true;
}
int main()
{
      int n, count=0;
      cout << "Enter the number  you want to verify: ";
      cin >> n;

      
      if(isPrime(n)){
        cout << "Prime Number" << endl;
      }
      else{
        cout << "Not a Prime Number" << endl;
      }
   
return 0;
} 


//============================================
// OutPut : Prime Number
//============================================


#include<iostream>
#include<string>
#include<cmath>
using namespace std;
bool isPrime(int n)
{
  if (n <= 1)
    return false; // 1 or less is not prime
  if (n == 2)
    return true; // 2 is prime
  // for (int i = 2; i < n; i++)
  for (int i = 2; i <= sqrt(n); i++)
  {
    if (n % i == 0)
      return false; // If divisible by any number other than 1 or itself, it's not prime
  }
  return true; // If no divisors are found, it's prime
}
int main()
{

  int n;
  cout << "Enter the number you want to verify: ";
  cin >> n;
  if (isPrime(n))
  {
    cout << n << " is a prime number." << endl;
  }
  else
  {
    cout << n << " is not a prime number." << endl;
  }
return 0;
}

//============================================
// OutPut : 7 is a prime number.
//============================================

#include<iostream>
#include<string>
using namespace std;
int main()
{
  int a, b;
  cout << "Enter the value of a: " << endl;
  cin >> a;
  cout << "Enter the value of b: " << endl;
  cin >> b;
  a = a + b;
  b = a - b;
  a = a - b;
  cout << "a: " << a << endl;
  cout << "b: " << b << endl;
  return 0;
}


//============================================
// OutPut : a: 5
//          b: 3
//===========================================



#include <iostream>
using namespace std;

int main()
{
  int a, b;
  cout << "Enter the value of a: " << endl;
  cin >> a;
  cout << "Enter the value of b: " << endl;
  cin >> b;

  // Swap using logical conditions
  a = (a == b) ? a : (b = (a, a = b)); // Swap logic

  cout << "a: " << a << endl;
  cout << "b: " << b << endl;

  return 0;
}

//============================================
// OutPut : a: 3
//          b: 5
//===========================================


#include <iostream>
using namespace std;

int main()
{
  int a, b;
  cout << "Enter the value of a: " << endl;
  cin >> a;
  cout << "Enter the value of b: " << endl;
  cin >> b;

  // Swap a and b using XOR
  a = a ^ b; // Step 1: a now holds the XOR of a and b
  b = a ^ b; // Step 2: b gets the original value of a
  a = a ^ b; // Step 3: a gets the original value of b

  cout << "a: " << a << endl; // Display swapped values
  cout << "b: " << b << endl;

  return 0;
}

//============================================
// OutPut : a: 5
//          b: 3
//===========================================

#include<iostream>
#include<string>
using namespace std;
int main()
{

  int n;
  cout << "Enter the value of n: " << endl;
  cin >> n;
  int reverse = 0;
  while(n !=0){
    reverse = reverse * 10 + n % 10;
    n = n / 10;
  }
  cout << "Reverse: " << reverse << endl;

  return 0;
}

//============================================
// OutPut : Reverse: 321
//===========================================

#include <iostream>
#include <cmath> // For pow() function
using namespace std;

// Function to count the number of digits in a number
int countDigits(int number)
{
  int count = 0;
  while (number != 0)
  {
    count++;
    number /= 10;
  }
  return count;
}

// Function to check if a number is an Armstrong number
bool isArmstrong(int number)
{
  int num = number;
  int sum = 0;
  int digits = countDigits(number);

  while (num != 0)
  {
    int digit = num % 10;
    sum += pow(digit, digits);
    num /= 10;
  }

  return sum == number;
}

int main()
{
  int  upperLimit;

 

  cout << "Enter the upper limit: ";
  cin >> upperLimit;

  cout << "Armstrong numbers between are: " << endl;

  for (int i = 0; i <= upperLimit; i++)
  {
    if (isArmstrong(i))
    {
      cout << i << " ";
    }
  }

  cout << endl;
  return 0;
}
