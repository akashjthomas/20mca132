public class complex {
    int real;
    int img;

    //constructor
    complex(int x, int y) {
        real = x;
        img = y;
    }

    void dis() {
        System.out.println(real + " + i" + img);
    }

    void add(complex n, complex x) {
        int a, b;
        a = n.real + x.real;
        b = n.img + x.img;
        System.out.println(a + " + i" + b);
    }

    public static void main(String[] args) {
        complex c1 = new complex(3, 5);
        complex c2 = new complex(2, 7);
        c1.dis();
        c1.add(c1, c2);
    }
}
