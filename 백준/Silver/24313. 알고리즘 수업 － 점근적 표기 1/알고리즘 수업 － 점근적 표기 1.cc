#include <iostream>
using namespace std;

/* f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다. */

int main() {
    int a1, a0, c, n0; 
    cin >> a1 >> a0 >> c >> n0;
    
    if (a1 * n0 + a0 <= c * n0 && a1 <= c)
        cout << 1 << endl;
    else 
        cout << 0 << endl;
    return 0;
}