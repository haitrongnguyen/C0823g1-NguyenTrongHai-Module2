package ss06_Inheritance.thuc_hanh.circle_comparator;

import ss05_AccessModifier_Static.bai_tap.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius()>c2.getRadius()) return 1;
        else if (c1.getRadius()<c2.getRadius()) return -1;
        else return 0;
    }
}
