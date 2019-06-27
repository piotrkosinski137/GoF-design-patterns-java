package adapter.socket;

public class SocketAdapterImpl implements SocketAdapter
{
    private Socket indianSocket;

    public SocketAdapterImpl(Socket indianSocket)
    {
        this.indianSocket = indianSocket;
    }

    @Override
    public Volt get120V()
    {
        Volt indianVolt = indianSocket.getVolt();
        indianVolt.setVolts(120);
        return indianVolt;
    }
}
