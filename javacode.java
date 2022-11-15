import java.util.Scanner;
class java
{
    
//mini project coantaining 10 functions 
 static void Arithmetic_Progression(int n)                              // n is number of terms to be printed;
{Scanner sc=new Scanner(System.in);
    int first_term, common_diff;
    System.out.println ("Enter first term of Arithmetic Progression");
     first_term = sc.nextInt();                                                               //for first term of AP 
     System.out.println("Enter common difference of Arithmetic Progression");
     common_diff= sc.nextInt();
     System.out.println("AP");                                                              //for common difference 
    for (int term_number = 1; term_number <= n; term_number++){                       //loop for printing AP
        int term = first_term + (term_number - 1) * common_diff;
        System.out.print(term + " ");
    }
    System.out.println();
}

static void Geometric_Progression(int n)                                                     // n is number of terms to be printed;
{Scanner sc=new Scanner(System.in);
    int first_term, common_ratio;
    System.out.println("Enter first term of Geometric Progression");
     first_term= sc.nextInt();                                                               //first term of gp
    System.out.println( "Enter common ratio of Geometric Progression");
     common_ratio=sc.nextInt();                                                              //common ratio of GP
    System.out.println("Required Geometric Progression is: ");
    int term = first_term;
    System.out.println("GP");
    for (int term_number = 1; term_number <= n; term_number++){                       //loop for printing GP                        
        System.out.print(term + " ");
        term = term * common_ratio;
    }
    System.out.println();
}

static void Fibonacci_Series(int n)                                                         //n is terms to be printed in fibonacci series
{   System.out.print( "Fibonacci series" );
    int term1 = 1, term2 = 1;                                                        //first two terms of fibonacci series
    System.out.println( term1 + " " + term2 + " ");
    for (int term_number = 3; term_number <= n; term_number++){                      //loop for calculating next term in fibonacci series
        int temp = term1 + term2;
        term1 = term2;
        term2 = temp;
        System.out.print( term2 + " ");
    }
    System.out.println();
}

static void Hailstone_sequence(int n)                                                      //number of terms to be printed in hailstone series
{System.out.print("hailstone series"); 
    Scanner sc=new Scanner(System.in);
    int first_term;
    System.out.println("\nEnter a number to start hailstone sequence: \n");
     first_term=sc.nextInt();                                                              //First term of hailstone series
    int term = first_term;
    for (int term_number = 1; term_number <= n; term_number++){
                             //loop for calculating the hailstone series
        System.out.print(term + " ");                                                       
        if (term % 2 == 0){                                                          //conditions that satisfy the series
            term = term / 2;
        }else{
            term = 3 * term + 1;
        }
    }
    System.out.println();
}

static void Triangular_numbers(int n)                                              //number of terms in triangular numbers
{  System.out.print("triangular number");
    for (int term = 1; term <= n; term++){                                   //loop for printing triangular number
        int triangular = term * (term + 1) / 2;
        
        System.out.print( triangular + " ");
    }
    System.out.println();
}

static void Palindromic_numbers(int start_check, int end_check)                               //function to print palindrome number given between two given number    
{System.out.print("Palindrome series");
    for (int number = start_check; number <= end_check; number++){                       //loop for checking all number between given two number
        int temp = number;
        int rev = 0;
        while (temp!=0)                                                                     //loop for calculating reverse of number
        {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }   
                                             
        if (number == rev)                                                              //condition for cheking wether the number is palindrome or not
        {
            
            System.out.print (number + " ");
        }
    }
    System.out.println();
}

static void Prime_numbers(int start_check, int end_check)                                               //funtions for calculating prime number betweeen two number
{System.out.print("Prime number series");
    for (int number = start_check; number <= end_check; number++){                               //loop for cheking all numbers between the given two numbers
        int flag = 1;
        for (int divisor = 2; divisor <= number / 2; divisor++){                                 //loop for checking prime number
            if (number % divisor == 0){
                flag = 0;
            }
        }
        
        if(flag == 1){
            System.out.print(number+" ");
        }
    }
    System.out.println();
}

static void Armstrong_numbers(int start_check, int end_check)                                         //funtion for printting armsrtong number between 2 given number

{
    System.out.print("Armstrong");
    for (int number = start_check; number <= end_check; number++){                               //loop for checking all numbers between given two numbers 
        int temp=number;
        int sum =0;
        while(temp!=0){                                                                          //loop for cheking armstrong number
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        
        if(number == sum){
            System.out.println(number+" ");
        }
    }
    System.out.println();
}

static void Sum_of_Sq_Cube(int n)                                                                     //n is total number of terms
{  System.out.print("Sum of square and cube of number");
    for(int term_number=1;term_number<=n;term_number++){                                       //loop for calculating sum of cube and square of a giuven nmber
        int sum = term_number*term_number*(term_number+1);                                    
        System.out.print(sum+" ");
    }
    System.out.println();
}

static void Power_series(int n)                                                                        //n is total number of series
{ System.out.print("Power series");
     int answer=1;
    for(int power=1;power<=10;power++){                                                         //loop for calculating successive powe uptil n
        answer=answer*n;
        System.out.print(answer+" ");
    }
    System.out.println();
}

public static void main(String args[])
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
}
