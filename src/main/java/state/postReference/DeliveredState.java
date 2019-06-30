package state.postReference;

public class DeliveredState implements PackageState
{
    @Override
    public void next(Package pkg)
    {
        pkg.setPackageState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg)
    {
        pkg.setPackageState(new OrderedState());
    }

    @Override
    public void statusInfo()
    {
        System.out.println("we are delivering your package");
    }
}
