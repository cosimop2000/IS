package Lezione2411.GestioneStudenti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AdminInvocationHandler implements InvocationHandler {

    CorsoAstratto corso;

    public AdminInvocationHandler(CorsoAstratto corso) {
        this.corso = corso;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            return method.invoke(corso,args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
