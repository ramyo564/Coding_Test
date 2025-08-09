#include <bits/stdc++.h>
using namespace std;

int N, K, ret;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> K;

    int arr[N] = {};

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    sort(arr, arr + N);

    int r = N - 1;
    int l = 0;

    while (r != l)
    {
        if (arr[r] + arr[l] == K)
        {
            ret++;
            l++;
        }
        else if (arr[r] + arr[l] < K)
        {
            l++;
        }
        else
        {
            r--;
        }
    }
    cout << ret;

    return 0;
}