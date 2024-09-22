package CollectionsAndGenrics;

public class GenericsCustom<T> {
    private T things;

    public T getThings() {
        return things;
    }

    public void setThings(T things){
        this.things=things;
    }

    public static void main(String[] args) {
        GenericsCustom gc = new GenericsCustom();
        gc.setThings("Shivam");
        gc.setThings(5);
        System.out.println(gc.getThings());
    }
}
