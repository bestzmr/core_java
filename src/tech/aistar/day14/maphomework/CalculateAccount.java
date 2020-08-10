package tech.aistar.day14.maphomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 18:39
 */
public class CalculateAccount {
    public static void main(String[] args) {
        Map<String, String> dateMap = new HashMap<>();
        Map<String, Integer> dealMoney = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String id = scanner.nextLine();
            String date = scanner.nextLine();
            Integer deal = scanner.nextInt();
            dateMap.put(id, date);
            dealMoney.put(id, deal);
        }
        TreeMap<String, Double> treeMap = calculateDiscount(dateMap, dealMoney);
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> m : set) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }

    public static TreeMap calculateDiscount(Map<String, String> dateMap, Map<String, Integer> dealMoney) {
        TreeMap<String, Double> discountMap = new TreeMap<>();
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2015");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, Calendar.YEAR - 5);
        Set<Map.Entry<String, String>> set = dateMap.entrySet();
        Date date1 = null;
        for (Map.Entry<String, String> setEntry : set) {
            try {
                date1 = new SimpleDateFormat("dd-MM-yyyy").parse(setEntry.getValue());

            } catch (ParseException e) {
                e.printStackTrace();
            }
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(date1);
            if (calendar1.compareTo(calendar) >= 0 && dealMoney.get(setEntry.getKey()) >= 20000) {
                discountMap.put(setEntry.getKey(), dealMoney.get(setEntry.getKey()) * 0.2d);
            } else if (calendar1.compareTo(calendar) < 0 && dealMoney.get(setEntry.getKey()) >= 20000) {
                discountMap.put(setEntry.getKey(), dealMoney.get(setEntry.getKey()) * 0.1d);
            } else if (calendar1.compareTo(calendar) >= 0 && dealMoney.get(setEntry.getKey()) < 20000) {
                discountMap.put(setEntry.getKey(), dealMoney.get(setEntry.getKey()) * 0.15d);
            } else if (calendar1.compareTo(calendar) < 0 && dealMoney.get(setEntry.getKey()) < 20000) {
                discountMap.put(setEntry.getKey(), dealMoney.get(setEntry.getKey()) * 0.05d);
            }
        }
        return discountMap;
    }
}
