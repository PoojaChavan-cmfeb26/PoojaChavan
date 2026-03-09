#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
#include <iostream>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    // Dynamically allocate a 2D matrix dep copy
    int** matrix = new int*[N];
    for (int i = 0; i < N; i++) {
        matrix[i] = new int[M];
    }

    // Read elements and calculate sum
    int sum = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> matrix[i][j];
            sum += matrix[i][j];
        }
    }

    // Print result
    cout << "Sum = " << sum << endl;

    // Free allocated memory
    for (int i = 0; i < N; i++) {
        delete[] matrix[i];
    }
    delete[] matrix;

    return 0;
}