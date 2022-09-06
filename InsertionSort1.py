import time

def insertionSort(arr):
    for i in range(1, len(arr)):
        key = arr[i]

        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

if __name__ == "__main__":
	repeat = 10
	maxList = 20000
	r = 2000
	while r <= maxList:
		arr = []
		sum = 0
		for k in range(repeat):
			for i in range(r):
				arr.append(i)
			start = int(round(time.time() * 1000))
			insertionSort(arr)
			end = int(round(time.time() * 1000))
			sum = end - start
		print(f'{r}\t{sum}\t{sum/repeat}')
		arr.clear()
		r+=2000
