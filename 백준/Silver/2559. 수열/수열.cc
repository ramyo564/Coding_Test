#include <bits/stdc++.h>
using namespace std;

int N, K;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int ret = 0, temp = 0;
    cin >> N >> K;
    int arr[N] = {};

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < K; i++)
    {
        ret += arr[i];
    }

    temp = ret;
    int j = 0;
    for (int i = K; i < N; i++)
    {
        temp = temp - arr[j] + arr[i];
        if (ret < temp)
        {
            ret = temp;
        }
        j++;
    }

    cout << ret;

    return 0;
}