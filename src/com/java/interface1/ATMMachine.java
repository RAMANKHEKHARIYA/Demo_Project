package com.java.interface1;

public interface ATMMachine {
     public int a=0;
    public int method();                        // only public modifier allowed here in method
    static String method(String  name){
        return name;
    }
}
    class Child implements ATMMachine {
    public int method() {
        System.out.println("Cash");
        return 0;
    }

        public static void main(String[] args) {
            Child obj = new Child();
            obj.method();
            obj.method("abcd");
            System.out.println(ATMMachine.method("Raman Kumar"));
            String result= ATMMachine.method("Raman Kumar child");
            System.out.println(result);
        }

        String method(String  name){
            System.out.println("abc");
            return name;
            }
      }
