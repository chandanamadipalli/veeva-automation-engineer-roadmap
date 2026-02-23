import java.util.*;
class Capital {
    String name;
    String season;
    Capital(String name, String season) {
        this.name = name;
        this.season = season;
    }
    @Override
    public String toString() {
        return name + " (" + season + ")";
    }
}

public class CountryCapitalManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Capital>> countryMap = new HashMap<>();
        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter country name:");
            String country = sc.nextLine();
            System.out.println("Enter number of capitals (1 / 2 / 3):");
            int capitalCount = sc.nextInt();
            sc.nextLine();
            List<Capital> capitals = new ArrayList<>();
            for (int j = 0; j < capitalCount; j++) {
                System.out.println("Enter capital name:");
                String capitalName = sc.nextLine();
                System.out.println("Enter season (Winter / Summer / Rainy):");
                String season = sc.nextLine();
                capitals.add(new Capital(capitalName, season));
            }
            countryMap.put(country, capitals);
        }
        System.out.println("1. All Countries with Capitals:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            System.out.println("Number of Capitals: " + entry.getValue().size());
            for (Capital c : entry.getValue()) {
                System.out.println(c);
            }
        }
        System.out.println("2. Enter country name to search:");
        String searchCountry = sc.nextLine();
        if (countryMap.containsKey(searchCountry)) {
            List<Capital> capitals = countryMap.get(searchCountry);
            System.out.println("Country: " + searchCountry);
            System.out.println("Number of Capitals: " + capitals.size());
            for (Capital c : capitals) {
                System.out.println(c);
            }
        } else {
            System.out.println("Country not found");
        }
        System.out.println("3. Countries with 2 Capitals:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            if (entry.getValue().size() == 2) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("4. Countries with 3 Capitals:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            if (entry.getValue().size() == 3) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("5. Countries without Summer Capital:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            boolean hasSummer = false;
            for (Capital c : entry.getValue()) {
                if (c.season.equalsIgnoreCase("Summer")) {
                    hasSummer = true;
                    break;
                }
            }
            if (!hasSummer) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("6. Capitals of Countries Starting with Vowel:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            String country = entry.getKey();
            if (startsWithVowel(country)) {
                for (Capital c : entry.getValue()) {
                    System.out.println(country + " - " + c);
                }
            }
        }
        System.out.println("7. Summer Capitals of Countries Starting with Vowel:");
        for (Map.Entry<String, List<Capital>> entry : countryMap.entrySet()) {
            String country = entry.getKey();
            if (startsWithVowel(country)) {
                for (Capital c : entry.getValue()) {
                    if (c.season.equalsIgnoreCase("Summer")) {
                        System.out.println(country + " - " + c.name);
                    }
                }
            }
        }
        sc.close();
    }
    public static boolean startsWithVowel(String str) {
        char ch = Character.toLowerCase(str.charAt(0));
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}