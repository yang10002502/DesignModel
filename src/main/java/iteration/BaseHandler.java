package iteration;

public interface BaseHandler<T,R> {
    R handle(BaseHandleIterator<T,R> iterator,T t) throws Exception;
}
