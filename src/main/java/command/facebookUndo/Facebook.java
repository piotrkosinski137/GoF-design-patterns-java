package command.facebookUndo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Facebook
{
    private List<Friend> friends;

    Facebook()
    {
        this.friends = new ArrayList<>();
    }

    void add(Friend friend)
    {
        friends.add(friend);

    }

    void remove(Friend friend)
    {
        friends.remove(friend);
    }

    List<Friend> showAll()
    {
        return Collections.unmodifiableList(friends);
    }
}
