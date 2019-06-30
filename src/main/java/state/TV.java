package state;

//changes state of object by passing this to external state methods
//Allow an object to alter its behavior when its internal state changes.
public class TV
{
    private RemoteControl state;

    public TV(RemoteControl state)
    {
        this.state = state;
    }

    void pressButton()
    {
        state.pressSwitch(this);
    }

    public void setState(RemoteControl state)
    {
        this.state = state;
    }

    public RemoteControl state()
    {
        return state;
    }
}

