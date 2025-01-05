package interfacesAndAbstraction.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        //Browsing: !
        StringBuilder sb = new StringBuilder();
        //"Calling... {number}".
        for (String url : urls) {
            boolean isDigit = false;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    isDigit = true;
                }
            }
            if (!isDigit) {
                sb.append("Browsing: ").append(url + "!").append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        //"Calling... {number}".
        for (String number : numbers) {
            boolean differentFromDigit = false;
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    differentFromDigit = true;
                }
            }
            if (!differentFromDigit) {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }

        }
        return sb.toString().trim();
    }
}