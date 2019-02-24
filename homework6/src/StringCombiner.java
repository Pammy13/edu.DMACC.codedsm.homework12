import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {
    public static void main(String[] args) {
        String kind = "Baby";
        String toys = "rattle";
        String addTogether = together(kind, toys);

        System.out.println(addTogether);

        String currentDate = outputDate();
        System.out.println("Today is" + outputDate());

        String sunday = work(addTogether, currentDate);
        System.out.println(sunday);
    }

    public static String together(String kind, String toys) {
        return kind + "" + toys;
    }

    public static String outputDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM  yyyy");
        return format.format(Date.from(Instant.now()));
    }

    public static String work(String together,  String outputDate) {
            return together + " " + outputDate;
        }

    }

