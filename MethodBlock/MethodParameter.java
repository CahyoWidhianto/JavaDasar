package MethodBlock;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Cahyo","Widianto");
        sayHello("Lovely", "Pinaria");
        sayHello("Mario", "surya");
    }

    static void sayHello(String frist_name, String last_name){
        System.out.println("Hello " + frist_name + " " + last_name);
    }
}
