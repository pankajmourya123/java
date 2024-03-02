package stream;

import java.util.ArrayList;
import java.util.List;

import collectionsFramework.sortset;

class parallemstream{
    public static void main(String[] args) {

        List<Integer> stu=new ArrayList<>();

        stu.add(40);
        stu.add(93);
        stu.add(96);
        stu.add(98);
        stu.add(95);
//normal stream
        stu.stream().filter(x->x>=90).limit(3).forEach(x->System.out.println(x));
//parallemstream
        stu.parallelStream().filter(x->x>=90).forEach(v-> System.out.println(v));
//convert stram --> parallemstream
stu.stream().parallel().filter(x->x>=90).forEach(v->System.out.println(v));
    }
}