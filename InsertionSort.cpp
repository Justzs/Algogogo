#include <iostream>
#include <time.h>
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

void test(){
	int repeat = 10;
    int maxlist = 2000;
    int range= 200;
    int n, k, i;
    for (n = 200; n <= maxlist; n+=range){
        int *d = new int[n];
        long sum = 0;
        for (k=0; k<repeat; k++){
            for (i=n-1; i>0; i++){
                d[i] == i;
            }
            int N = sizeof(d) / sizeof(d[0]);
            sort(d, N);

        }
        cout << n << endl;
    }
}

int main() {
	test();
	return 0;
}
