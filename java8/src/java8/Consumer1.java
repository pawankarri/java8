package java8;

import java.util.function.Consumer;

public class Consumer1 {
public static void main(String[] args) {
	Consumer<String> c=s->System.out.println(s);
	c.accept("pawan");
}
}
