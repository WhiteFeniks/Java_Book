class DrumKit{

    boolean topHat = true;
    boolean share = true;

    void playTopHat() {
        System.out.println("динь  динь ди-динь");
    }

    void playShare() {
        System.out.println("бах  бах ба-бах");
    }
}

class DrumKitTestDrive{
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.share = false;
        d.playShare();

        if (d.share == true) {
            d.playShare();
        }

        d.playTopHat();

    }
}
