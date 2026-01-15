#include <iostream>
using namespace std;

int main() {
    int T; 
    int C; 
    
    cin >> T;
    for(int i=0; i<T; ++i) {
        cin >> C;
    
        int Quarter = C / 25;
        C %= 25;

        int Dime = C / 10;
        C %= 10;
                
        int Nickel = C / 5;
        C %= 5;
                    
        int Penny = C;

        cout << Quarter << " " << Dime << " " << Nickel << " " << Penny << endl;
    }
        return 0;
}