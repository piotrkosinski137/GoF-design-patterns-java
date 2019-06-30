package iterator;

import java.util.ArrayList;
import java.util.List;

public class Bmw implements Car
{
    List<String> bwmCars = new ArrayList<String>()
    {{
        add("Bmw Z5");
        add("Bmw E46");
        add("Bmw I8");
    }};

    @Override
    public Iterator getIterator()
    {
        return new BmwIterator(bwmCars);
    }

    class BmwIterator implements Iterator
    {
        List<String> bmwCars;
        private int index;

        BmwIterator(List<String> cars)
        {
            this.bmwCars = cars;
        }

        @Override
        public boolean hasNext()
        {
            return bmwCars.size() > index;
        }

        @Override
        public String next()
        {
            if(hasNext()) {
                String car = bmwCars.get(index);
                index++;
                return car;
            }
            throw new RuntimeException("No more cars available");
        }
    }
}
