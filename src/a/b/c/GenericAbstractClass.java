package a.b.c;


public abstract class GenericAbstractClass<B extends GenericAbstractClass<B,C>, C extends SomeClass>
{
    private final B b;
    private final C c;

    public GenericAbstractClass(B b, C c) {
        this.b = b;
        this.c = c;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
