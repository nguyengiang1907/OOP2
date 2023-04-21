package week_2;

public abstract class Mobile {
    public abstract void downloadApp();
}
class Iphone extends Mobile{
    @Override
    public void downloadApp() {
        System.out.println("Download from Appstroe");
    }
}
class Nokia extends Mobile{
    @Override
    public void downloadApp() {
        System.out.println("Download from CHPlay");
    }
}
class TestIphone extends Iphone{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Nokia nokia = new Nokia();
        nokia.downloadApp();
        iphone.downloadApp();
    }
}
