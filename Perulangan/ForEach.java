public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "say", "hi", "and", "say",
                "Hello", "to", "java"
        };

        for(int i=0;i<array.length; i++) {
        System.out.println(array[i]);
        }

        System.out.println("FOR EACH");

        for (String name : array) {
            System.out.println(name);
        }
    }
}
