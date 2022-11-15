#include <iostream>

using namespace std;
//mini project coantaining 10 functions 
void Arithmetic_Progression(int n)                              // n is number of terms to be printed;
{
    int first_term, common_diff;
    cout << "Enter first term of Arithmetic Progression\n";
    cin >> first_term;                                                               //for first term of AP 
    cout << "Enter common difference of Arithmetic Progression\n";
    cin >> common_diff;                                                              //for common difference 
    cout << "Required Arithmetic Progression is: \n";
    for (int term_number = 1; term_number <= n; term_number++){                       //loop for printing AP
        int term = first_term + (term_number - 1) * common_diff;
        cout << term << " ";
    }
    cout << "\n\n";
}

void Geometric_Progression(int n)                                                     // n is number of terms to be printed;
{
    int first_term, common_ratio;
    cout << "Enter first term of Geometric Progression\n";
    cin >> first_term;                                                               //first term of gp
    cout << "Enter common ratio of Geometric Progression\n";
    cin >> common_ratio;                                                              //common ratio of GP
    cout << "Required Geometric Progression is: \n";
    int term = first_term;
    for (int term_number = 1; term_number <= n; term_number++){                       //loop for printing GP                        
        cout << term << " ";
        term = term * common_ratio;
    }
    cout << "\n\n";
}

void Fibonacci_Series(int n)                                                         //n is terms to be printed in fibonacci series
{
    int term1 = 1, term2 = 1;                                                        //first two terms of fibonacci series
    cout << term1 << " " << term2 << " ";
    for (int term_number = 3; term_number <= n; term_number++){                      //loop for calculating next term in fibonacci series
        int temp = term1 + term2;
        term1 = term2;
        term2 = temp;
        cout << term2 << " ";
    }
    cout << "\n";
}

void Hailstone_sequence(int n)                                                      //number of terms to be printed in hailstone series
{
    int first_term;
    cout << "\nEnter a number to start hailstone sequence: \n";
    cin >> first_term;                                                              //First term of hailstone series
    int term = first_term;
    for (int term_number = 1; term_number <= n; term_number++){                      //loop for calculating the hailstone series
        cout << term << " ";                                                       
        if (term % 2 == 0){                                                          //conditions that satisfy the series
            term = term / 2;
        }else{
            term = 3 * term + 1;
        }
    }
    cout << "\n";
}

void Triangular_numbers(int n)                                              //number of terms in triangular numbers
{
    for (int term = 1; term <= n; term++){                                   //loop for printing triangular number
        int triangular = term * (term + 1) / 2;
        cout << triangular << " ";
    }
    cout << "\n";
}

void Palindromic_numbers(int start_check, int end_check)                               //function to print palindrome number given between two given number    
{
    for (int number = start_check; number <= end_check; number++){                       //loop for checking all number between given two number
        int temp = number;
        int rev = 0;
        while (temp)                                                                     //loop for calculating reverse of number
        {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }                                        
        if (number == rev)                                                              //condition for cheking wether the number is palindrome or not
        {
            cout << number << " ";
        }
    }
    cout << "\n";
}

void Prime_numbers(int start_check, int end_check)                                               //funtions for calculating prime number betweeen two number
{
    for (int number = start_check; number <= end_check; number++){                               //loop for cheking all numbers between the given two numbers
        int flag = 1;
        for (int divisor = 2; divisor <= number / 2; divisor++){                                 //loop for checking prime number
            if (number % divisor == 0){
                flag = 0;
            }
        }
        if(flag == 1){
            cout<<number<<" ";
        }
    }
    cout << "\n";
}

void Armstrong_numbers(int start_check, int end_check)                                         //funtion for printting armsrtong number between 2 given number

{
    for (int number = start_check; number <= end_check; number++){                               //loop for checking all numbers between given two numbers 
        int temp=number;
        int sum =0;
        while(temp){                                                                          //loop for cheking armstrong number
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        if(number == sum){
            cout<<number<<" ";
        }
    }
    cout << "\n";
}

void Sum_of_Sq_Cube(int n)                                                                     //n is total number of terms
{
    for(int term_number=1;term_number<=n;term_number++){                                       //loop for calculating sum of cube and square of a giuven nmber
        int sum = term_number*term_number*(term_number+1);                                    
        cout<<sum<<" ";
    }
    cout<<"\n";
}

void Power_series(int n)                                                                        //n is total number of series
{
    long long int answer=1;
    for(int power=1;power<=10;power++){                                                         //loop for calculating successive powe uptil n
        answer=answer*n;
        cout<<answer<<" ";
    }
    cout<<"\n";
}

int main()
{
    Arithmetic_Progression(5);
    Geometric_Progression(5);
    Fibonacci_Series(10);
    Hailstone_sequence(5);
    Triangular_numbers(5);
    Palindromic_numbers(10, 200);
    Prime_numbers(10,100);
    Armstrong_numbers(100,999);
    Sum_of_Sq_Cube(5);
    Power_series(8);
}
