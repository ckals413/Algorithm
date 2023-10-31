#include<iostream>
#include<stack>
using namespace std;

int main() {
	int n,m;
	stack<int>s;
	string str;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> str;
		if (str == "push") {
			cin >> m;
			s.push(m);
		}
		else if (str == "pop") {
			if (!s.empty()) {
				cout << s.top() << endl;
				s.pop();
			}
			else
				cout << -1 << endl;
		}
		else if (str == "empty") {
			if (s.empty())
				cout << 1 << endl;
			else
				cout << 0 << endl;
		}
		else if (str == "top") {
			if (s.empty()) {
				cout << -1 << endl;
			}
			else
				cout << s.top() << endl;
		}
		else if (str == "size") {
			cout << s.size() << endl;
		}

	}
	
}
