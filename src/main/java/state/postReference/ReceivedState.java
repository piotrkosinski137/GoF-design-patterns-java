package state.postReference;

public class ReceivedState implements PackageState
{
    @Override
    public void next(Package pkg)
    {
        System.out.println("package was delivered, no next steps");
    }

    @Override
    public void prev(Package pkg)
    {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void statusInfo()
    {
        System.out.println("package arrived at destination country");
    }
}
