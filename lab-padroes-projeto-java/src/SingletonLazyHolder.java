public class SingletonLazyHolder {

 
    
    private static class IsntaceHolder{
        private static SingletonLazyHolder instace = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstace(){
        return IsntaceHolder.instace;
    }
}
