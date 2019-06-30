package state.postReference;

public class Package
{
    private PackageState packageState = new OrderedState();

    public Package()
    {
    }

    public PackageState packageState()
    {
        return packageState;
    }

    public void setPackageState(PackageState packageState)
    {
        this.packageState = packageState;
    }

    void nextStatus() {
        packageState.next(this);
    }

    void prevStatus() {
        packageState.prev(this);
    }

    void statusInfo() {
        packageState.statusInfo();
    }
}
