#include <bits/stdc++.h>
using namespace std;

int N, K;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> K;
    string temp;
    unordered_map<string, string> num_ky_map;
    unordered_map<string, int> st_ky_map;
    for (int i = 0; i < N; i++)
    {
        cin >> temp;
        num_ky_map[to_string(i + 1)] = temp;
        st_ky_map[temp] = i + 1;
    }
    for (int i = 0; i < K; i++){
        cin >> temp;
        if(num_ky_map.count(temp)){
            cout << num_ky_map[temp] << '\n';
        }else {
            cout << st_ky_map[temp] << '\n';
        }
    }

    return 0;
}