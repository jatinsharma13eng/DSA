let arr = [10, 20, 30, 40, 50, 60]
let start = 0
let end = arr.length - 1
let find = 60 //number to find
let found = false //flag if num found or not

while (start <= end) {
    let mid = Math.floor((start + end) / 2)

    if (find == arr[mid]) {
        console.log(`${find} Found at position ${mid}`)
        found = true
        break;
    } else if (find >= arr[mid]) {
        start = mid + 1
    } else {
        end = mid - 1
    }
}

if (!found) {
    console.log("Element Not found !")
}

