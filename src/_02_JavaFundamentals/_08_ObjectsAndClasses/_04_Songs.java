package _02_JavaFundamentals._08_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSongs = Integer.parseInt(scanner.nextLine());

        List<_04_SongsPartTwo> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            _04_SongsPartTwo song = new _04_SongsPartTwo();

            song.setTypeLIst(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();

        if (typeList.equals("all")){
            for (_04_SongsPartTwo song : songs) {
                System.out.println(song.getName());
            }
        }
        else {
            for (_04_SongsPartTwo song : songs) {
                if (song.getTypeLIst().equals(typeList)){
                    System.out.println(song.getName());
                }

            }
        }
    }
}
