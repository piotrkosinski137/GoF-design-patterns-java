package command.facebookUndo;

public class MainClass
{

    public static void main(String[] args)
    {
        Facebook myFacebook = new Facebook();

        FacebookExecutor executor = new FacebookExecutor();


        Friend ada = new Friend("Ada");
        Friend larson = new Friend("Larson");
        Friend odyas = new Friend("Odyas");
        Command addFriend = new AddFriendCommand(myFacebook, ada);
        Command addFriend2 = new AddFriendCommand(myFacebook, larson);
        Command addFriend3 = new AddFriendCommand(myFacebook, odyas);
        Command displayFriends = new DisplayFriendsCommand(myFacebook);

        executor.perform(addFriend);
        executor.perform(addFriend2);
        executor.perform(displayFriends);

        executor.undo();
        System.out.println("cofka larsona teraz tylko ada");
        executor.perform(displayFriends);

        executor.perform(addFriend3);
        System.out.println("dodanie odyasa");
        executor.perform(displayFriends);

        executor.undo();
        System.out.println("wycofanie dodawania odyasa");
        executor.perform(displayFriends);

        executor.redo();
        executor.redo();
        System.out.println("wycofanie wywalenia odyasa i larsona");
        executor.perform(displayFriends);

    }
}
