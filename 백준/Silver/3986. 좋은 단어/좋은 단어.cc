#include <bits/stdc++.h>
using namespace std;

int N, ret;
string temp;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;

    for (int i = 0; i < N; i++)
    {
        stack<char> st;
        cin >> temp;
        st.push(temp[0]);
        for (int j = 1; j < temp.length(); j++)
        {
            if(!st.empty() && temp[j] == st.top()){
                st.pop();
            }else{
                st.push(temp[j]);
            }
        }

        if(st.size() == 0){
            ret ++;
        }
    }
    cout << ret;

    return 0;
}