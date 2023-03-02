import java.util.Random;
import java.util.Scanner;

public class Cards {

    static void loader(String txt, int count) {
        System.out.print(txt);

        for (int i = 0; i < count; i++) {
            System.out.print("\uD83C\uDCA0");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }

    static String[] getCardString(String value, String suit) {
        String topValue = value + (value.length() > 1 ? "" : " ");
        String bottomValue = (value.length() > 1 ? "" : " ") + value;

        String[] ret = new String[7];

        ret[0] = "┎--------┒";
        ret[1] = "┃" + topValue + "      ┃";
        ret[2] = "┃" + suit + "       ┃";
        ret[3] = "┃        ┃";
        ret[4] = "┃       " + suit + "┃";
        ret[5] = "┃      " + bottomValue + "┃";
        ret[6] = "┗--------┙";

        return ret;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner keyboard = new Scanner(System.in);
        int rndCount = 0;

        String[] cardValues = {"6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        String[] cardSuits = {"♠", "♣", "♦", "♥"};

        loader("Тасуем  ", 5);

        System.out.print("Введите количество карт (4-10) >");

        int count = keyboard.nextInt();

        if (count > 10 || count < 4) {
            System.out.println("Программа раздет от 4 до 10 случайных карт. Запустите пересдачу.");
        } else {
            Card[] distribution = new Card[count];

            loader("Раздаем ", count);

            do {
                int rndValue = rnd.nextInt(0, cardValues.length);
                int rndSuit = rnd.nextInt(0, cardSuits.length);
                boolean inArray = false;

                for (int j = 0; j < rndCount; j++) {
                    Card card = distribution[j];

                    if (card.value.equals(cardValues[rndValue]) && card.suit.equals(cardSuits[rndSuit])) {
                        inArray = true;
                        break;
                    }
                }

                if (!inArray) {
                    distribution[rndCount++] = new Card(cardValues[rndValue], cardSuits[rndSuit]);
                }

            } while (rndCount < count);


            String[] printDistribution = new String[7];

            for (Card card : distribution) {
                String[] cardStrings = getCardString(card.value, card.suit);

                for (int j = 0; j < cardStrings.length; j++) {
                    printDistribution[j] = (printDistribution[j] != null ? printDistribution[j] : "") + cardStrings[j] + " ";
                }
            }

            for (String s : printDistribution) {
                System.out.println(s);
            }

        }
    }
}
