package _02_JavaFundamentals._23_FinalExamPreparation;

import java.util.*;

public class _03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> gameMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String heroes = scanner.nextLine();
            String heroName = heroes.split(" ")[0];
            int hitPoints = Integer.parseInt(heroes.split(" ")[1]);
            int manaPoints = Integer.parseInt(heroes.split(" ")[2]);

            if (hitPoints <= 100 && manaPoints <= 200) {
                if (!gameMap.containsKey(heroName)) {
                    gameMap.put(heroName, new ArrayList<>());
                    gameMap.get(heroName).add(hitPoints);
                    gameMap.get(heroName).add(manaPoints);
                }
            }
        }

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split(" - ");
            String action = tokens[0];
            String name = tokens[1];
            List<Integer> values = gameMap.get(name);
            int hp = values.get(0);
            int mana = values.get(1);

            switch (action) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];

                    if (manaNeeded <= mana) {
                        mana -= manaNeeded;
                        gameMap.get(name).set(1, mana);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, mana);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    hp -= damage;

                    if (hp <= 0) {
                        gameMap.remove(name);
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                    } else {
                        gameMap.get(name).set(0, hp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, hp);
                    }
                    break;
                case "Recharge":
                    int amountMana = Integer.parseInt(tokens[2]);
                    int recharge = 0;
                    int currentMana = mana;
                    mana += amountMana;

                    if (mana > 200) {
                        recharge = 200 - currentMana;
                        gameMap.get(name).set(1, 200);
                        System.out.printf("%s recharged for %d MP!%n", name, recharge);
                    } else {
                        gameMap.get(name).set(1, mana);
                        System.out.printf("%s recharged for %d MP!%n", name, amountMana);
                    }

                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(tokens[2]);
                    int healing = 0;
                    int currentHp = hp;
                    hp += amountHeal;

                    if (hp > 100) {
                        healing = 100 - currentHp;
                        gameMap.get(name).set(0, 100);
                        System.out.printf("%s healed for %d HP!%n", name, healing);
                    } else {
                        gameMap.get(name).set(0, hp);
                        System.out.printf("%s healed for %d HP!%n", name, amountHeal);
                    }
                    break;


            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : gameMap.entrySet()) {
            if (!gameMap.isEmpty()) {
                List<Integer> values = entry.getValue();
                String name = entry.getKey();

                System.out.println(name);
                System.out.printf("  HP: %d%n", values.get(0));
                System.out.printf("  MP: %d%n", values.get(1));
            }
        }
    }
}
