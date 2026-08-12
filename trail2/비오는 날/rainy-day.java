import java.util.Scanner;


class Predict{
    String date;
    String yoil;
    String weather;

    public Predict(String date, String yoil, String weather)
    {
        this.date = date;
        this.yoil = yoil;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Predict[] prd = new Predict[n];
        for (int i = 0; i < n; i++)
        {
            String date = sc.next();
            String yoil = sc.next();
            String weather = sc.next();
            prd[i] = new Predict(date, yoil, weather);
        }
        Predict p1 = prd[0];
        for (int i = 0; i < n; i++)
        {
            if (p1.weather.equals("Rain") && prd[i].weather.equals("Rain"))
            {
                if (prd[i].date.compareTo(p1.date) < 0)
                {
                    p1.date = prd[i].date;
                    p1.yoil = prd[i].yoil;
                    p1.weather = prd[i].weather;
                    continue;
                }
            }
            else if (!p1.weather.equals("Rain") &&prd[i].weather.equals("Rain"))
            {
                p1.date = prd[i].date;
                p1.yoil = prd[i].yoil;
                p1.weather = prd[i].weather;
            }
        }

        System.out.println(p1.date + " " + p1.yoil + " " + p1.weather);

    }
}