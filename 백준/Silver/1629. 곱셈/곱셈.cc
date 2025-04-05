#include <bits/stdc++.h>
using namespace std;

long long A, B, C;

long long mod_pow(long long a, long long b, long long c) {
    long long result = 1;
    a %= c;
    while (b > 0) {
        if (b % 2 == 1) result = (result * a) % c;
        a = (a * a) % c;
        b /= 2;
    }
    return result;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> A >> B >> C;
    cout << mod_pow(A, B, C) << "\n";
    return 0;
}