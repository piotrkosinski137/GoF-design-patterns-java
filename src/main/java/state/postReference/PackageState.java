package state.postReference;

public interface PackageState
{
    void next(Package pkg);
    void prev(Package pkg);
    void statusInfo();
}
