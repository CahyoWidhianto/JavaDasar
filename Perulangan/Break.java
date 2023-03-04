public class Break {
    public static void main(String[] args) {
        int count =1;
        while(true){
            System.out.println("Perulangan ke-" + count);
            count++;
            if(count >10){
                break;
            }
        }
    }
}
