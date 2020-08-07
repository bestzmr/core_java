package tech.aistar.day14.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 16:06
 */
public class MapPractice {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int pairs = Integer.valueOf(value);

        Map<String, Date> map = new HashMap<>();

        for (int i = 0; i < pairs; i++) {
            String no = scanner.nextLine();
            String date = scanner.nextLine();
            map.put(no, stringToDate(date));
        }

        Date curDate = stringToDate("01/01/2014");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(curDate);

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 60);

        Set<String> empSet = map.keySet();
        Iterator<String> empIterator = empSet.iterator();

        List<String> setEmp = new ArrayList<>();
        while (empIterator.hasNext()) {
            String empNo = empIterator.next();
            Date birthDate = map.get(empNo);

            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(birthDate);

            if (calendar.compareTo(calendar1) >= 0) {
                setEmp.add(empNo);
            }
        }
        setEmp.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
        for (String s : setEmp) {
            System.out.println(s);
        }
    }
    public static Date stringToDate(String dataStr) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(dataStr);
    }
}
