const arr = [10, 4, 3, 9, 3, 4, 7]
let foundAt = []

function linearSearch(num){
for (let i = 0; i <= arr.length; i++) {
    if (arr[i] == num) {
       foundAt.push(i)
    }
}

if (foundAt.length>0){
console.log(`found at ${foundAt}`)
}else{
    console.log("not found !")
}

}

linearSearch(3) //found at 2,4

