package week_1;

public class Mobile {
    public void downloadApp() {
    }

    ;
}

class Iphone extends Mobile {
    @Override
    public void downloadApp() {
        super.downloadApp();
        System.out.println("downloatApp from Appstore");
    }
}

class Nokia extends Mobile {
    @Override
    public void downloadApp() {
        super.downloadApp();
        System.out.println("DownloadApp from CHPlay");
    }
}

class AndroiTest {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        nokia.downloadApp();
        iphone.downloadApp();
    }
}
