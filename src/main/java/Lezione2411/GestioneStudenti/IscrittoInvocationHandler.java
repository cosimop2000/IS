package Lezione2411.GestioneStudenti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IscrittoInvocationHandler implements InvocationHandler {
    CorsoAstratto corso;

    public IscrittoInvocationHandler(CorsoAstratto corso) {
        this.corso = corso;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("aggiungiIscritto")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("mostra")) {
                return method.invoke(corso, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
