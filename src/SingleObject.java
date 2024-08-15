public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}

    public static SingleObject getInstance(){
        System.out.println("Go to the instance");
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton");
    }
}
