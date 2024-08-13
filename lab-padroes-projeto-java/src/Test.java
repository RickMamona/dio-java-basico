

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

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

        // Testes relacionados ao design Pattern Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();


        // Testes relacionados ao design Facade

        Facade facade = new Facade();
        facade.migrarCleinte("Rick", "49025100");
        
    }

}
