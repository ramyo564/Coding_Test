#include <bits/stdc++.h>
using namespace std;
int main() {
  string str, ret;
  getline(cin, str);

  for (char s : str){
    if (s >= 'A' && s <= 'Z'){
      ret += (s - 'A' + 13) % 26 + 'A';
    }
    else if (s >= 'a' && s <= 'z')
    {
      ret += (s - 'a' + 13) % 26 + 'a';
    }
    else {
      ret += s;
    }
    
  }
  cout << ret;

  return 0;
}