let arr = [ 10, 20, 30, 40, 50, 60] 
let find = 40 //number to find
let start = 0 
let end = arr.length-1

while(start<=end){
    let mid = Math.floor(start+end/2)

    if(find == arr[mid]){
        console.log(`${find} Found at position ${mid}`)
        break;
    }else if(find>=arr[mid]){
        start+=1
    }else{
        end-=1
    }
}

