package test;

public class B<T> {
    private T t;

    public B(T t){
        this.t = t;
    }

    public String toString(){
        return "This is a B with " + t.toString();
    }
}
