#include <iostream>
#include <algorithm>
using namespace std;

    /* x, y, w, h를 입력받는다.
    * 경계선까지 거리중 가장 최솟값 구한다. 
    */

int main() {
    int x, y, w, h;
    cin >> x >> y >> w >> h;

    //버전 안맞
    int result = std::min({x, y, w-x, h-y}); 

    cout << result << endl;        
    return 0;
}