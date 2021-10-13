package GenericDemo.MyGeneric;

/**
 * 自定义泛型类
 *
 * @param <E> 泛型的标识符
 */
public class MyGeneicDemo<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public MyGeneicDemo() {

    }

    @Override
    public String toString() {
        return "MyGeneicDemo{" +
                "e=" + e +
                '}';
    }
}
