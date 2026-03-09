#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
/*move all once to end*/
    int N;
    if (!(cin >> N)) return 0; 

    vector<long long> nonOnes;
    vector<long long> ones;
    long long temp;

    for (int i = 0; i < N; ++i) {
        cin >> temp;
        if (temp == 1) {
            ones.push_back(temp);
        } else {
            nonOnes.push_back(temp);
        }
    }

    nonOnes.insert(nonOnes.end(), ones.begin(), ones.end());


    for (int i = 0; i < N; ++i) {
        cout << nonOnes[i] << (i == N - 1 ? "" : " ");
    }

    cout << endl;

    return 0;
}

