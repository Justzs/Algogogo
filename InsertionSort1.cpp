#include <iostream>
#include<bits/stdc++.h>

using namespace std;

//int counter = 0;
void sort(int arr[], int n)
{
    int i, key, j; 
    for (i = 1; i < n; i++)
    { 
        key = arr[i]; 
        j = i - 1; 

        while (j >= 0 && arr[j] < key)
        { 
            arr[j + 1] = arr[j]; 
            j = j - 1; 
        } 
        arr[j + 1] = key; 
    } 
}

int main() {
	int repeat = 10;
    int maxlist = 20000;
    int range= 2000;
    int n, k, i;
    for (n = 2000; n <= maxlist; n+=range){
        int d[n];
        clock_t start_time;
        clock_t end_time1;
        clock_t result;
        double sum = 0;
        for (k=0; k<repeat; k++){
            for (i=n-1; i>=0; i--){
                d[i] = i;
//                cout << d[i] << endl;
//                cout << i<< endl;
            }
            int N = sizeof(d) / sizeof(d[0]); 
            start_time = clock();
            sort(d, N);
			end_time1 = clock();
			result = end_time1 - start_time;
			sum += result;
			
        }
        cout << n << "\t" << sum << "\t" << (double) sum/10<< endl;
    }
	return 0;
}
