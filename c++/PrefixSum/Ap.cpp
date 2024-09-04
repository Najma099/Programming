#include<iostream>
using namespace std;
int main() {
    int n ;
    cin>> n;
    int arr[n],brr[n];

    for(int i = 0; i < n; i++) {
        arr[i]= brr[i] = 0;
    }
    int q ;
    cin >> q;
    while(q--) {
        int a,d,l,r;
        cin>>a>>d>>l>>r;

        arr[l] += a- d*l;
        if(r+1 < n) arr[r+1] -=a-d*l;

        brr[l] += d;
        if(r+1 < n) brr[r+1] -= d;
    }
    for(int i = 1; i < n; i++) {
        arr[i] += arr[i+1];
        brr[i] += brr[i+1];
    }
    for(int i = 0; i < n; i++) {
        cout<< arr[i] + i*brr[i] << " ";
    }
}