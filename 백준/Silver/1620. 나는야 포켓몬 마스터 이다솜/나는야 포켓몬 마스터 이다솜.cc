#include <bits/stdc++.h>
using namespace std;

int N;
int M;
string temp;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;

    unordered_map<int, string> map;
    unordered_map<string, int> map2;

    for (int i = 1; i < N + 1; i++)
    {
        cin >> temp;
        map[i] = temp;
        map2[temp] = i;
    }

    for (int i = 0; i < M; i++)
    {
        cin >> temp;
        if (atoi(temp.c_str()) == 0)
        {
            cout << map2[temp] << "\n";
        }
        else
        {
            cout << map[atoi(temp.c_str())] << "\n";
        }
    }

    return 0;
}