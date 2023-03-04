package Scope;

public class Scope {
    public static void main(String[] args) {
        sayHello("Cahyo");
        sayHello("");
    }
    static void sayHello(String name){
        String hello = "Hello " + name;
        if(!name.isEmpty()){
            String hi = "hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}

//scope adalah kurung kurawal apapun yang ada dalam kurung kurafal adalah scope {}
