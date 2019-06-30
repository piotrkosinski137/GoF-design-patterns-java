package iterator;

import java.util.HashSet;
import java.util.Set;

//independency of data container type (List,Array etc)
//in this case we have 2 sources of data, one is stored in Array one in ArrayList
//Thank to iterators we can combine this data without worrying about different data structure
public class MainClass
{
    public static void main(String[] args)
    {
        Car audi = new Audi();
        Iterator audiIterator = audi.getIterator();

        Car bmw = new Bmw();
        Iterator bmwIterator = bmw.getIterator();

        Set<String> combinedCars = new HashSet<>();

        while (audiIterator.hasNext())
        {
            combinedCars.add(audiIterator.next());
        }
        while (bmwIterator.hasNext())
        {
            combinedCars.add(bmwIterator.next());
        }

        combinedCars.forEach(System.out::println);
    }
}
