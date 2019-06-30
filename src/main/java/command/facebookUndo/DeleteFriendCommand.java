package command.facebookUndo;

public class DeleteFriendCommand implements Command
{
    private final Facebook facebook;
    private Friend friend;

    public DeleteFriendCommand(Facebook facebook, Friend friend)
    {
        this.friend = friend;
        this.facebook = facebook;
    }

    @Override
    public void execute()
    {
        facebook.remove(friend);
    }

    @Override
    public void undo()
    {
        facebook.add(friend);
    }
}
