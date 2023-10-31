//참고
#include <iostream>
#include<stack>
using namespace std;
stack<int>s;
int main () {
	stack<int>st;
	int max = 0, n, m, cnt = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> m;
		s.push(m);

	}
	while (s.size()) {
		if (max < s.top()) {
			max = s.top();
			cnt++;
		}
		s.pop();
	}
	cout << cnt;

}
