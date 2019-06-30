package command.facebookUndo;

import java.util.Objects;

public class Friend
{
    private String name;

    public Friend(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        final Friend friend = (Friend) o;
        return name.equals(friend.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
