#include <iostream>
#include <sstream>
#include <unordered_map>
#include <vector>
using namespace std;

int x(vector<int>& nums){
    unordered_map<int,int> m;
    m[0]=-1;
    int l=0,c=0;
    for(int i=0;i<nums.size();++i){
        c+=(nums[i]==1)?1:-1;
        if(m.find(c)!=m.end()){
            l=max(l,i-m[c]);
        } else {
            m[c]=i;
        }
    }
    return l;
}
int main(){
    string s;
    getline(cin,s);
    vector<int> nums;
    stringstream ss(s);
    int n;
    while(ss>>n){
        nums.push_back(n);
    }
    cout<<x(nums);
}
                                                                                                                            