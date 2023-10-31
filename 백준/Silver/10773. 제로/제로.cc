#include<iostream>
#include<stack>

using namespace std;
int main() {
	stack<int>s;
	int n,m;
	int sum = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> m;
		if (m == 0) {
			s.pop();
		}
		else
			s.push(m);

	}
	int stack_size = s.size();
	for (int i = 0; i < stack_size; i++) { // 여기서 for문안에 s.size()를 바로 넣었더니 다른 값을 출력함 
		sum += s.top();
		s.pop();
	}
	cout << sum << endl;
}