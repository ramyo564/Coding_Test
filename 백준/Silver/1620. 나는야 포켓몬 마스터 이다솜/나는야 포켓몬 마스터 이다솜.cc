#include <bits/stdc++.h>
using namespace std;

int N, M;
unordered_map<string, string> mp;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;

    for (int i = 0; i < N; i++)
    {
        string st, num;
        cin >> st;
        num = to_string(i + 1);
        mp[st] = (num);
        mp[num] = st;
    }

    for (int i = 0; i < M; i++)
    {
        string st;
        cin >> st;

        cout << mp[st] << "\n";
    }

    return 0;
}
