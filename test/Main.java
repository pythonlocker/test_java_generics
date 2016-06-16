package test;

public class Main {

    public static void main(String[] args) {
        A a = new A("a1");
        A2 a2 = new A2("a2");
        B<A> b = new B<A>(a);
        B<A> b2 = new B<A>(a2);
        Compare(b, b2);
    }

    public static void Compare(B<A> b1, B<? super A> b2) {
        System.out.println("Compares: \n\t" + b1.toString() + "\n\t" + b2.toString());
    }

    
}


