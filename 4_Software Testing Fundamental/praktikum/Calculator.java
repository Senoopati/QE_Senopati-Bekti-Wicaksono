public class Calculator{
    public int add(int a, int b){
        int c = a+b;
        return c;
    }

    public int substract(int a, int b){
        int c = a-b;
        return c;
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6, 3));
        System.out.println(c.substract(6, 1));
    }

}



