#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'longestIncreasingSubsequence' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

int longestIncreasingSubsequence(vector<int> arr) {
     int n=arr.size();
       int l[n];
       
       vector<int>p;
       
       for(int i=0;i<n;i++){
           
           if(lower_bound(p.begin(),p.end(),arr[i])==p.end()){
               p.push_back(arr[i]);
               
           }
           else{
               int pos1=lower_bound(p.begin(),p.end(),arr[i])-p.begin();
               
               p[pos1]=arr[i];
               
           }
       }
  
       return (p.size());
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string n_temp;
    getline(cin, n_temp);

    int n = stoi(ltrim(rtrim(n_temp)));

    vector<int> arr(n);

    for (int i = 0; i < n; i++) {
        string arr_item_temp;
        getline(cin, arr_item_temp);

        int arr_item = stoi(ltrim(rtrim(arr_item_temp)));

        arr[i] = arr_item;
    }

    int result = longestIncreasingSubsequence(arr);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
