#include <bits/stdc++.h>
using namespace std;

int N;
int ret;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> N;
    
    for (int i = 0; i < N; i++)
    {
        stack<char> st;
        string s;
        cin >> s;
        for (int j = 0; j < s.length(); j++)
        {
            if(st.empty() || st.top() != s[j]){
                st.push(s[j]);
            }else{
                st.pop();
            }
        }
        if(st.empty())
            ret++;
        
        
    }
    cout << ret;
    return 0;
}
