package state.postReference;

public class OrderedState implements PackageState
{
    @Override
    public void next(Package pkg)
    {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg)
    {
        System.out.println("It's initial state, can't prev");
    }

    @Override
    public void statusInfo()
    {
        System.out.println("order was placed and we are packing your product");
    }
}
