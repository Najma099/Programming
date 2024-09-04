#include<iostream>
using namespace std;

int main() {
    //no of field
    int n ;
    cin >> n;
     
    int prefix[n];
    for(int i = 0; i < n; i++) {
        prefix[i] = 0;
    }


    //no of days
    int q;
    cin >> q;
    while(q--) {
        //range of field harvest took place
        int l,r;
        cin >> l >> r;
        prefix[l]++;
        if(r+1 < n) prefix[r+1]--;
    }

    //prefix of the Harvest
    for(int i = 0; i < n; i++) {
        if(i) prefix[i] += prefix[i-1];
    }

    //frq[q+1] represent---> q represents no of the max Harvest a field can give 
    //it is storing 0 -- q days which field has how many harvest(frequency)[no of harvest per day]

    int frq[q+1];
    for(int i = 0; i <= q ; i++) {
        freq[i] = 0;
    }
    for(int i = 0; i < n; i++) {
        int idx= prefix[i];
        frq[idx]++;
    }


    //Suffix sum of of the field
    for(int i = q-1; i >= 0; i++) {
        frq[i] += frq[i+1];
    }
    for(int i = 0; i <= q; i++) {
        cout << frq[i] << " ";
    }
}