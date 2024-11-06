package oops_concept;

public class OOPs_1 {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.set_color("blue");
        p1.set_tip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

    }

}

class pen {
    int tip;
    String color;

    void set_color(String newcolor) {
        color = newcolor;
    }

    void set_tip(int newtip) {
        tip = newtip;
    }
}
