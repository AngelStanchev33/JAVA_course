package JavaFundamentals.FIRSTEXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones = new ArrayList<>();
        String[] input = scanner.nextLine().split(", ");
        for (String phone : input) {
            phones.add(phone);
        }

        while (true){
            String line = scanner.nextLine();
            if (line.equals("End")){
                break;
            }
            String[] tokens = line.split(" - ");
            String command = tokens[0];
            String phone = tokens[1];

            switch (command){
                case "Add":
                    if (!phones.contains(phone)){
                        phones.add(phone);
                    }
                    break;
                case "Remove":
                    phones.remove(phone);
                    break;
                case "Bonus phone":
                    String[] parts = phone.split(":");
                    String oldPhone = parts[0];
                    String newPhone = parts[1];

                    if (phones.contains(oldPhone)){
                        int oldPhoneIndex = phones.indexOf(oldPhone) + 1;
                        phones.add(oldPhoneIndex,newPhone);
                    }
                    break;
                case "Last":
                    if (phones.contains(phone)){
                        phones.add(phones.size(),phone);
                        phones.remove(phone);
                    }
                    break;
            }
        }
        String joinedPhones = String.join(", ",phones);
        System.out.println(joinedPhones);

    }
}
