

#include <iostream>
using namespace std;
int main()
{
	int a[4];
	for (int i = 0; i < 4; i++) {
		cin >> a[i];
	}
	int b=0;
	for (int i = 0; i < 4; i++) {
		b += a[i];
	}
	int m = b / 60;
	int s = b % 60;
	cout << m << endl << s;



}

