package command.facebookUndo;

public class DisplayFriendsCommand implements Command
{
    private Facebook facebook;

    DisplayFriendsCommand(Facebook facebook)
    {
        this.facebook = facebook;
    }

    @Override
    public void execute()
    {
     facebook.showAll().forEach(System.out::println);
    }

    @Override
    public void undo()
    {
        //Nothing to do here
    }
}
