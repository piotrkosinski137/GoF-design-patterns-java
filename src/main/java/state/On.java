package state;

public class On implements RemoteControl
{
    @Override
    public void pressSwitch(TV context)
    {
        System.out.println("was on, now will be off");
        context.setState(new Off());
    }
}
