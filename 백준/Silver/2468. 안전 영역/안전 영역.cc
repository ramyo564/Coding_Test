#include <bits/stdc++.h>
using namespace std;

struct Point
{
    int y, x;
};

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int N, height = 0, temp, ret = 0;

    cin >> N;
    vector<vector<int>> arr(N, vector<int>(N, 0));

    for (int i = 0; i < N; i++)
    {
        for (int r = 0; r < N; r++)
        {
            cin >> temp;
            arr[i][r] = temp;
            if (temp > height)
            {
                height = temp;
            }
        }
    }

    while (height > -1)
    {
        vector<vector<bool>> visited(N, vector<bool>(N, false));
        queue<Point> q;
        for (int i = 0; i < N; i++)
        {
            for (int r = 0; r < N; r++)
            {
                if (arr[i][r] > height)
                {
                    q.push({i, r});
                }
            }
        }

        int d_y[4] = {-1, 1, 0, 0};
        int d_x[4] = {0, 0, -1, 1};

        int t_ret = 0;
        queue<Point> q_2;

        while (!q.empty())
        {
            Point qq = q.front();
            q.pop();
            if (!visited[qq.y][qq.x])
            {
                visited[qq.y][qq.x] = true;
                t_ret++;
                q_2.push({qq.y, qq.x});

                while (!q_2.empty())
                {
                    Point search = q_2.front();
                    q_2.pop();
                    for (int e = 0; e < 4; e++)
                    {
                        int n_y = search.y + d_y[e];
                        int n_x = search.x + d_x[e];

                        if (n_y >= 0 && n_y < N && n_x >= 0 && n_x < N)
                        {
                            if (!visited[n_y][n_x] && arr[n_y][n_x] > height)
                            {
                                visited[n_y][n_x] = true;
                                q_2.push({n_y, n_x});
                            }
                        }
                    }
                }
            }
        }

        if(ret < t_ret){
            ret = t_ret;
        }
        height--;
    }

    cout << ret;

    return 0;
}
