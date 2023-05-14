package Java8Features;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(){
    }

    List<List<Integer>> obj;
}
public class StreamAPIDemp {
    public static void main(String[] args) {
        //generating Stream, increasing each element by 1, then filtering the even number and doing this till next 5 numbers
        Stream<Integer> s = Stream.iterate(10, e->e+1).filter(n->n%2==0).map(m->m*m).limit(5);
        s.forEach(n-> System.out.println(n));


        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<String> laptop_brands = productsList.stream().map(l->{
                                                                    String[] names = l.name.split(" ");
                                                                    return names[0];
                                                                }).distinct().collect(Collectors.toList());

        String brand_with_costliest_laptop = productsList.parallelStream().max((p1,p2)-> p1.price>p2.price?1:-1).map(p->p.name).get(); //max
        String brand_with_cheapest_laptop = productsList.stream().min((p1,p2)-> p1.price>p2.price?1:-1).map(p->p.name).get(); //min
        long count_of_laptops_with_price_less_than_30k = productsList.stream().filter(p->p.price<30000).count(); //count
        Map<String,Float> productPriceMap = productsList.stream().collect(Collectors.toMap(product -> product.name,product -> product.price));
//        //Above statement is an example of how to convert a list into map. This is done just by updating the type of Collectors in the collect
//        //method. There is similarly Collectors.toSet


        double sumOfPrices = productsList.stream().collect(Collectors.summingDouble(p-> p.price));
        double averagePrice = productsList.stream().collect(Collectors.averagingDouble(p->p.price));

        System.out.println("Laptop Brands are: "+laptop_brands);
        System.out.println("Brand with costliest laptop is: "+ brand_with_costliest_laptop);
        System.out.println("Brand with cheapest laptop is: "+ brand_with_cheapest_laptop);
        System.out.println("count_of_laptops_with_price_less_than_30k "+ count_of_laptops_with_price_less_than_30k);
        System.out.println("productPriceMap "+productPriceMap);

        System.out.println("Sum of all the prices: "+sumOfPrices);
        System.out.println("Average Price is: "+averagePrice);

        List<Integer> al = Arrays.asList(1,2,3,2,6,5,3,3,7,1,7);
        List<Integer> al1 = Arrays.asList(4,5,3,3,7,1,7);
        List<Integer> al2 = Arrays.asList(1,2,3,2,6,5,10);

        List<List<Integer>> bl = new ArrayList<>();
        bl.add(al);
        bl.add(al1);
        bl.add(al2);

        Product product = new Product();
        product.obj = bl;

        Set<Integer> sl = product.obj.stream().flatMap(obj-> obj.stream().map(n-> n*2)).collect(Collectors.toSet());
        System.out.println(sl);
    }
}
