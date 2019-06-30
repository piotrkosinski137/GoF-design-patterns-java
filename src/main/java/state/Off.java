package state;

public class Off implements RemoteControl
{
    @Override
    public void pressSwitch(TV context)
    {
        System.out.println("was of now will be on");
        context.setState(new On());
    }
}
