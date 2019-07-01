package flyweight;

import java.util.Arrays;
import java.util.List;

public class Druid implements Vocation
{
    private List<String> spells = Arrays.asList("exevo gran mast tera", "exura sio");

    @Override
    public List<String> getSpells()
    {
        return spells;
    }
}
