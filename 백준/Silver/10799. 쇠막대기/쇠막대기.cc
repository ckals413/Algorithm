#include<iostream>
#include<stack>
using namespace std;

int main() {
	stack<char>st;
	string s;
	int sum = 0;
	cin >> s;
	for (int i = 0; i < s.length(); i++) {
		if (s[i] == '(')
			st.push(s[i]);
		else {
			if (s[i - 1] == '(') {
				st.pop();
				sum += st.size();
			}
			else {
				st.pop();
				sum++;
			}
		}
	}
	cout << sum;
	return 0;
}



