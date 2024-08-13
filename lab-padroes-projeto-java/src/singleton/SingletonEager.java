package singleton;
public class SingletonEager {

    private static SingletonEager instace = new SingletonEager();
    
    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstace(){
        return instace;
    }

}
