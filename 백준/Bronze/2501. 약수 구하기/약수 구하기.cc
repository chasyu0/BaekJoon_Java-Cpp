#include <iostream>
using namespace std;

    /* 0번 N과 K를 입력받는다. 
    * 1번 N의 약수를 구한다. 
    * 2번 순서를 세는 변수와, 정답을 담는 변수 선언
    * 4번 조건문 약수중에 K번쨰 작은수 
    */

int main() {
    int N;
    cin >> N;
    int K;
    cin >> K;
    int count = 0;
    int result = 0;
    
    for(int i=1; i<=N; i++) {
        if(N % i == 0) {
            count++;
        if(count == K) {
            result = i;
            break;
            }
        }
    }
    
    cout << result << endl;
    return 0;
}