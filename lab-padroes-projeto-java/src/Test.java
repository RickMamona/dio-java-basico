public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao design Pattern Singleton 

        SingletonEager eager = SingletonEager.getInstace();
        System.out.println(eager);
        eager = SingletonEager.getInstace();
        System.out.println(eager);

        SingletonLazy lazy = SingletonLazy.getInstace();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstace();
        System.out.println(lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstace();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstace();
        System.out.println(lazyHolder);
        
    }

}
