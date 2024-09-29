// #include<iostream>
// #include<string>
// using namespace std;

// int main()
// {
//       int n, count=0;
//       cout << "Enter the number  you want to verify: ";
//       cin >> n;

//       if(n<=1){
//         count++;
//       }
//       for(int i = 2; i < n; i++){
//         if(n%i == 0){
//           count++;
//           break;
//         }
//       }
//       if(count == 0){
//         cout << "Prime Number" << endl;
//       }
//       else{
//         cout << "Not a Prime Number" << endl;
//       }
   
// return 0;
// } 


//============================================
// OutPut : Prime Number
//============================================


// #include<iostream>
// #include<string>
// #include<cmath>
// using namespace std;
// bool isPrime(int n)
// {
//   if (n <= 1)
//     return false; // 1 or less is not prime
//   if (n == 2)
//     return true; // 2 is prime
//   // for (int i = 2; i < n; i++)
//   for (int i = 2; i <= sqrt(n); i++)
//   {
//     if (n % i == 0)
//       return false; // If divisible by any number other than 1 or itself, it's not prime
//   }
//   return true; // If no divisors are found, it's prime
// }
// int main()
// {

//   int n;
//   cout << "Enter the number you want to verify: ";
//   cin >> n;
//   if (isPrime(n))
//   {
//     cout << n << " is a prime number." << endl;
//   }
//   else
//   {
//     cout << n << " is not a prime number." << endl;
//   }
// return 0;
// }

//============================================
// OutPut : 7 is a prime number.
//============================================

// #include<iostream>
// #include<string>
// using namespace std;
// int main()
// {
//   int a, b;
//   cout << "Enter the value of a: " << endl;
//   cin >> a;
//   cout << "Enter the value of b: " << endl;
//   cin >> b;
//   a = a + b;
//   b = a - b;
//   a = a - b;
//   cout << "a: " << a << endl;
//   cout << "b: " << b << endl;
//   return 0;
// }


//============================================
// OutPut : a: 5
//          b: 3
//===========================================



// #include <iostream>
// using namespace std;

// int main()
// {
//   int a, b;
//   cout << "Enter the value of a: " << endl;
//   cin >> a;
//   cout << "Enter the value of b: " << endl;
//   cin >> b;

//   // Swap using logical conditions
//   a = (a == b) ? a : (b = (a, a = b)); // Swap logic

//   cout << "a: " << a << endl;
//   cout << "b: " << b << endl;

//   return 0;
// }

//============================================
// OutPut : a: 3
//          b: 5
//===========================================


// #include <iostream>
// using namespace std;

// int main()
// {
//   int a, b;
//   cout << "Enter the value of a: " << endl;
//   cin >> a;
//   cout << "Enter the value of b: " << endl;
//   cin >> b;

//   // Swap a and b using XOR
//   a = a ^ b; // Step 1: a now holds the XOR of a and b
//   b = a ^ b; // Step 2: b gets the original value of a
//   a = a ^ b; // Step 3: a gets the original value of b

//   cout << "a: " << a << endl; // Display swapped values
//   cout << "b: " << b << endl;

//   return 0;
// }

//============================================
// OutPut : a: 5
//          b: 3
//===========================================