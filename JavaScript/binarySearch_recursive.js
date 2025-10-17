let arr = [10, 20, 30, 40, 50, 60]
let start = 0
let end = arr.length - 1
let find = 50

function recursiveSearch(arr, start, end) {
    let mid = Math.floor((start+end)/2)

    if(start>end){
        console.log("Element not found !")
        return
    }

    if (find === arr[mid]) {
        console.log(`${find} found at ${mid}`)
    } else if (find > arr[mid]) {
        recursiveSearch(arr, mid + 1, end)
    } else {
        recursiveSearch(arr, start, mid - 1)
    }
}

recursiveSearch(arr, start, end)

