//피보나치 수열과 비슷함

#include <iostream>	
using namespace std;
int arr[1001];

int dp(int x) {
	if (x == 1)return 1;
	if (x == 2)return 2;
	if (arr[x] != 0)return arr[x]%10007;
	return arr[x] = (dp(x - 1) + dp(x - 2))%10007;
}


int main(void) {
	int n;
	cin >> n;
	cout << dp(n);

}