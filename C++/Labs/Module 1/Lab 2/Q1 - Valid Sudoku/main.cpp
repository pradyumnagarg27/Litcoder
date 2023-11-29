#include <iostream>
#include <vector>
using namespace std;

bool isValidSudoku(vector<vector<char>>& board){
    vector<vector<bool>> rows(9,vector<bool>(9,false));
    vector<vector<bool>> cols(9,vector<bool>(9,false));
    vector<vector<bool>> boxes(9,vector<bool>(9,false));
    for(int i=0;i<9;++i){
        for(int j=0;j<9;++j){
            if(board[i][j]!='.'){
                int num=board[i][j]-'1';
                int boxldx=(i/3)*3+j/3;
                if(rows[i][num]||cols[j][num]||boxes[boxldx][num]){
                    return false;
                }
                rows[i][num]=cols[j][num]=boxes[boxldx][num]=true;
            }
        }
    }
    return true;
}
int main(){
    int n;
    cin>>n;
    vector<vector<char>> board(n,vector<char>(n));
    for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            cin>>board[i][j];
        }
    }
    bool isValid=isValidSudoku(board);
    if(isValid){
        cout<<"YES";
    } else{
        cout<<"NO";
    }
    return 0;
}
                                                                                                                            