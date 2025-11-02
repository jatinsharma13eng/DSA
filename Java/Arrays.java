package Java;

//java arrays are homogenoeous 
public class Arrays {
    int[] arr = {1, 12, 3, 14, 5, 16, 7, 18, 9, 20}; //array definition with values

    public void counting(){
        for (int i = 0; i <arr.length; i++){  //array traversal
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        Arrays obj = new Arrays();
        obj.counting();
    }
}
