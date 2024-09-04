#include <iostream>  
using namespace std;

int main () {
    int n;
    cin >> n;

    int prefix[n];
    for(int i = 0; i < n; i++) {
        prefix[i] = 0;
    } 

    int q;
    cin>> q;
    while(q--) {
        int l , r;
        cin>> l >>r;
        int x ;
        cin >> x;
        prefix[l] = x;
        if(r+1 < n) prefix[r+1] = -x;
    }
    for(int i = 0; i < n; i++) {
        if(i)prefix[i] += prefix[i-1];
    }
    for(int i = 0; i < n; i++) {
        cout << prefix[i] << " ";
    }
    cout << endl;
    return 0;
}