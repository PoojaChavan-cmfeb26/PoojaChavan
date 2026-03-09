#include <stdio.h>

int main() {
    printf("Size of short int: %zu bytes\n", sizeof(short int));
    printf("Size of int: %zu bytes\n", sizeof(int));
    printf("Size of long int: %zu bytes\n", sizeof(long int));
    printf("Size of long long int: %zu bytes\n", sizeof(long long int));
    printf("Size of unsigned int: %zu bytes\n", sizeof(unsigned int));
    printf("Size of float: %zu bytes\n", sizeof(float));
    printf("Size of double: %zu bytes\n", sizeof(double));
    printf("Size of long double: %zu bytes\n", sizeof(long double));
    printf("Size of char: %zu bytes\n", sizeof(char));

    /*
    Answers to the questions (based on a typical 64-bit machine):

    Q1. Which two types have the same size on your machine?
    'int' and 'unsigned int' usually have the same size. 'char' is typically 1 byte, 
    and 'short int' is typically 2 bytes, which are also often consistent across machines.

    Q2. Does unsigned int have a different size than int?
    No, typically they have the same size in bytes. The difference is how they interpret 
    the bits (signed vs. unsigned integers).
    */

    return 0;
}
