import interfaces.InternetFunc;
import interfaces.IpodFunc;
import interfaces.PhoneFunc;
import interfaces.TouchInterface;

public class Iphone implements InternetFunc, IpodFunc, PhoneFunc, TouchInterface {
    private String name;
    private String model;
    private Integer year;

    public Iphone(String name, String model, Integer year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Ligando Telefone");
    }

    public void turnOff() {
        System.out.println("Desligando Telefone");
    }

    @Override
    public void touchScreen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'touchScreen'");
    }

    @Override
    public void useGestures() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'useGestures'");
    }

    @Override
    public void zoomPinch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zoomPinch'");
    }

    @Override
    public void makeCall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeCall'");
    }

    @Override
    public void sendSMS() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendSMS'");
    }

    @Override
    public void seeContacts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seeContacts'");
    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playMusic'");
    }

    @Override
    public void watchVideo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'watchVideo'");
    }

    @Override
    public void browse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'browse'");
    }

    @Override
    public void openSafari() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openSafari'");
    }

    @Override
    public void openEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openEmail'");
    }

    @Override
    public void useMaps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'useMaps'");
    }
    
}
