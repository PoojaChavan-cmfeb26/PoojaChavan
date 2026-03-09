
#include <iostream>


int absolute(int n) {

    return (n < 0) ? -n : n;
}


int clamp(int val, int lo, int hi) {

    return (val < lo) ? lo : (val > hi) ? hi : val;
}

int main() {

    int val1 = -15, lo1 = -10, hi1 = 10;
    int val2 = 0, lo2 = -10, hi2 = 10;
    int val3 = 25, lo3 = -10, hi3 = 10;
    int val4 = -3, lo4 = 0, hi4 = 5;


    std::cout << "val\tlo\thi\tabsolute(val)\tclamp(val, lo, hi)\n";
    std::cout << val1 << "\t" << lo1 << "\t" << hi1 << "\t" << absolute(val1) << "\t\t" << clamp(val1, lo1, hi1) << "\n";
    std::cout << val2 << "\t" << lo2 << "\t" << hi2 << "\t" << absolute(val2) << "\t\t" << clamp(val2, lo2, hi2) << "\n";
    std::cout << val3 << "\t" << lo3 << "\t" << hi3 << "\t" << absolute(val3) << "\t\t" << clamp(val3, lo3, hi3) << "\n";
    std::cout << val4 << "\t" << lo4 << "\t" << hi4 << "\t" << absolute(val4) << "\t\t" << clamp(val4, lo4, hi4) << "\n";

    return 0;
}
