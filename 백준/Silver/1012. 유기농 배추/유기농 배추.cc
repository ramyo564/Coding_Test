#include <bits/stdc++.h>
using namespace std;

int N, M, K, T, row, col;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    struct Point
    {
        int row, col;
    };

    cin >> T;
    

    for (int t = 0; t < T; t++)
    {
        cin >> N >> M >> K;
        int ret = 0;
        vector<vector<int>> arr(M, vector<int>(N, 0));
        vector<vector<bool>> visited(M, vector<bool>(N, false));
        queue<Point> q;

        for (int r = 0; r < K; r++)
        {
            cin >> col >> row;
            arr[row][col] = 1;
            q.push(Point{row, col});
        }

        int d_row[4] = {0, 0, -1, 1};
        int d_col[4] = {-1, 1, 0, 0};

        while (!q.empty())
        {
            Point peek = q.front();
            q.pop();

            if (!visited[peek.row][peek.col])
            {
                ret++;
                queue<Point> q_2;
                Point start = {peek.row, peek.col};
                q_2.push(start);
                visited[peek.row][peek.col] = true;

                while (!q_2.empty())
                {
                    Point peek_2 = q_2.front();
                    q_2.pop();
                    for (int i = 0; i < 4; i++)
                    {
                        int new_row = peek_2.row + d_row[i];
                        int new_col = peek_2.col + d_col[i];

                        if (new_row >= 0 && new_row < M && new_col >= 0 && new_col < N)
                        {
                            if (!visited[new_row][new_col] && arr[new_row][new_col] == 1)
                            {
                                q_2.push({new_row, new_col});
                                visited[new_row][new_col] = true;
                            }
                        }
                    }
                }
            }
        }
        cout << ret << '\n';
    }
    
    

    return 0;
}