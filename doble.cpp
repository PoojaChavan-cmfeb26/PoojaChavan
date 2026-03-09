/*The bug is that the program uses call by value, 
meaning doubleIt() receives a copy of num,
 so changes made to n inside the function do not affect the original num in main().
before op 14 7 after correction op 14 14*/


#include <stdio.h> 

// Corrected: Uses reference &
void doubleIt(int &n) { 
    n = n * 2; 
    printf("Inside doubleIt: %d\n", n); 
} 

int main() { 
    int num = 7; 
    doubleIt(num); // Passes the actual variable, not a copy
    printf("In main after call: %d\n", num); 
    return 0; 
} 
