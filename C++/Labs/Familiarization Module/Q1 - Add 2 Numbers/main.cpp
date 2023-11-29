#include <iostream>
#include <cstdio>
using namespace std;

int addNumbers(int a, int b){
    return a + b;
}

int main() {
    int a, b, c, d;
    scanf("%d %d", &a, &b);
    int ans = addNumbers(a, b);
    printf("%d", ans);
    
    return 0;
}
                                                                                                                            