let arr = [10, 40, 50, 90, 30, 20, 70, 80, 60, 100,]
let pos = 3

//traversal
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]) //prints the elements of array
}

//custom push() implementation
function customPush(item) {
    for (i = arr.length - 1; i >= 0; i--) {
        if (i>=pos){
            arr[i+1] = arr[i]
            if(i==pos){
                arr[i] = item
            }
        }
    }
}

customPush(99) //adds 99 at defined position 





