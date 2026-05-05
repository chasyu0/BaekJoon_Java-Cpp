#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    long long product = 1;
    int sum = 0;
    
    for (int n : num_list) {
        product *= n; 
        sum += n;
    }     
    
    if (product < sum*sum) {
        return 1;
    } else {
        return 0;
    } 
}