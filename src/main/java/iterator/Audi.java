package iterator;

public class Audi implements Car
{
    String[] audiCars = new String[] { "Audi A5", "Audi R8" };

    @Override
    public Iterator getIterator()
    {
        return new AudiIterator(audiCars);
    }

    class AudiIterator implements Iterator
    {
        private String[] audiCars;
        private int index;

        AudiIterator(String[] audiCars)
        {
            this.audiCars = audiCars;
        }

        @Override
        public boolean hasNext()
        {
            return audiCars.length > index;
        }

        @Override
        public String next()
        {
            if(hasNext()) {
                String car = audiCars[index];
                index++;
                return car;
            }

            throw new RuntimeException("No More Audi cars");
        }
    }
}
