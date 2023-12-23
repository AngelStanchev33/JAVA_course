import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String>attack = new ArrayList<>();
        List<String>destroyed = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String data = scanner.nextLine();
            int count = 0;
            for(int j = 0;j<data.length();j++){
                char current = data.charAt(j);
                if(current=='s'||current=='S'||current=='t'||current=='T'||
                        current == 'a'||current=='A'||current=='r'||current=='R'){
                    count++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int k = 0;k<data.length();k++){
                char current = (char)(data.charAt(k)-count);
                sb.append(current);
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>A|D)![^@\\-!:>]*->(?<soldierCount>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb.toString());
            while(matcher.find()){
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));
                switch(attackType){
                    case"A":
                        attack.add(planetName);
                        break;
                    case"D":
                        destroyed.add(planetName);
                        break;
                }
            }
        }
        System.out.printf("Attacked planets: %d%n",attack.size());
        attack
                .stream()
                .sorted()
                .forEach(s->System.out.println(String.format("-> %s",s)));
        System.out.printf("Destroyed planets: %d%n",destroyed.size());
        destroyed
                .stream()
                .sorted()
                .forEach(s->System.out.println(String.format("-> %s",s)));
    }
}