#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

int power(int base,int exponent,int modulus){
    if(exponent==0) return 1;
    long long result =1;
    long long x=base;
    while(exponent>0){
        if(exponent%2==1){
            result=(result*x)%modulus;
        }
        x=(x*x)%modulus;
        exponent/=2;
    }
    return static_cast<int>(result);
}

int legoBlocks(int n,int m){
    const int MOD=1000000007;
    vector<int> row_combinations={1,1,2,4};
    while(row_combinations.size()<=m){
        int sum_last_four=0;
        for(int i=row_combinations.size()-4;i<row_combinations.size();++i){
            sum_last_four=(sum_last_four+row_combinations[i])%MOD;
        }
        row_combinations.push_back(sum_last_four);
    }
    vector<int> total;
    for(int c:row_combinations){
        total.push_back(power(c,n,MOD));
    }
    vector<int> unstable={0,0};
    for(int i=2;i<=m;++i){
        auto f=[&](int j){return(total[j]-unstable[j])*total[i-j]%MOD;};
        int result=0;
        for(int j=1;j<i;++j){
            result=(result+f(j))%MOD;
        }
        unstable.push_back(result);
    }
    return(total[m]-unstable[m]+MOD)%MOD;
}
int main(){
    int n,m;
    cin>>n>>m;
    cout<<legoBlocks(n,m)<<endl;
    return 0;
}
                                                                                                                            