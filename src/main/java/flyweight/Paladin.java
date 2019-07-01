package flyweight;

import java.util.Arrays;
import java.util.List;

public class Paladin implements Vocation
{
    private List<String> spells = Arrays.asList("exori san");

    @Override
    public List<String> getSpells()
    {
        return spells;
    }
}
