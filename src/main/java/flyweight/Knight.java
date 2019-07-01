package flyweight;

import java.util.Arrays;
import java.util.List;

public class Knight implements Vocation
{
    private List<String> spells = Arrays.asList("exura", "exana pox");

    @Override
    public List<String> getSpells()
    {
        return spells;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
