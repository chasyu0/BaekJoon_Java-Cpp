#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    // 입출력 속도 향상
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N; 
    cin >> N;
    int A[N];
    
    for (int i = 0; i < N; ++i) {
        cin >> A[i];  
    }
    
    sort(A, A+N);     // A 배열을 오름차순 정렬
    
    int M;
    cin >> M;
    for (int i = 0; i < M; ++i) {
        int X; 
        cin >> X; 
        
    bool found = binary_search(A, A + N, X);
    
    cout << (found ? 1 : 0) << "\n";
    }
    
    return 0;
}