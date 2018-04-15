package iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseHandleIterator<T,R> implements Iterator {

    private List<BaseHandler<T,R>> handlers = new ArrayList<BaseHandler<T, R>>();

    private int index = 0;

    private R r;

    public boolean hasNext() {
        return handlers.size() > index;
    }

    public BaseHandler<T, R> next() {
        if (hasNext()) {
            BaseHandler<T, R> nextHandler = handlers.get(index);
            index++;
            return nextHandler;
        }
        return null;
    }

    public R doNextHandler(T t) throws Exception {
        if (hasNext()) {
            r = next().handle(this, t);
        }
        return r;
    }

    public boolean registerHandler(BaseHandler<T, R> handler) {
        try {
            if (handlers.contains(handler)) {
                return true;
            }
            return handlers.add(handler);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void remove() {

    }
}
