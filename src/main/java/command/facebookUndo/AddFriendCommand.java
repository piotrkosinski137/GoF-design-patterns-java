package command.facebookUndo;

public class AddFriendCommand implements Command
{
    private Facebook facebook;
    private Friend friend;

    public AddFriendCommand(Facebook facebook, Friend friend)
    {
        this.friend = friend;
        this.facebook = facebook;
    }

    @Override
    public void execute()
    {
        facebook.add(friend);
    }

    @Override
    public void undo()
    {
        facebook.remove(friend);
    }
}
