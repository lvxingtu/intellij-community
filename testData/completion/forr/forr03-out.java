public class Foo {
    void m() {
        Long[] xs = {1, 2, 3};
        for (int i = xs.length - 1; i >= 0; i--)<caret>
    }
}