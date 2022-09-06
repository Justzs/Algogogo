let counter=0;
function sort(arr)  
{  
    let i, key, j;  
    for (i = 1; i < arr.length; i++) 
    {  
        key = arr[i];  
        j = i - 1;  
        while (j >= 0 && arr[j] < key) 
        {  
            counter+=1;
            arr[j + 1] = arr[j];  
            j = j - 1;  
        }  
        arr[j + 1] = key;  
    }  
}    

function main(){
    const repeat = 10;
    const maxList = 20000;
    let range = 2000;
    let n, k, i;
    for (n=2000; n<=maxList; n+= range){
        let d = []; 
        let sum = 0;
        for(k=0; k<repeat; k++){
            for(i=n-1; i>0; i--){
                d[i] = i;
            }
            counter = 0;
            // let start = Date.now();
            sort(d);
            // let end = Date.now();
            // sum += end - start;
            sum+=counter;
        }
        console.log(`${n}\t${sum}\t${sum/repeat}`);
    }
}

main()
