public class Gise {

    private String TC;
    private boolean kontrol=false;

    public String getTC() {
        return TC;
    }
    public void setTC(String TC) {
        int syc = 0;
        if (TC.length() == 11) {
            for (int i = 0; i < TC.length(); i++) {
                if (Character.isDigit(TC.charAt(i))) {
                    syc++;
                }else {
                    System.out.println("Gecerli bir TC numarasi giriniz!");
                    break;
                }
            }
        } else {
            System.out.println("Gecerli bir TC numarasi giriniz!");
        }
        if (syc == 11) {
            this.TC = TC;
            kontrol=true;
        }
    }

    public Gise(String TC, boolean kontrol) {
        this.TC = TC;
        this.kontrol = kontrol;
    }

    public Gise() {

    }
    public boolean isKontrol() {
        return kontrol;
    }

    public void setKontrol(boolean kontrol) {
        this.kontrol = kontrol;
    }
}
