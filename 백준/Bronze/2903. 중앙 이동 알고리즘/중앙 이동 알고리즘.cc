#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    int side = pow(2, N) + 1;

    int total = pow(side, 2);
    cout << total << endl;

    return 0;
}