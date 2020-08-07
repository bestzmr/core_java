package tech.aistar.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapPractice {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int pairs = Integer.valueOf(value);

        Map<String, Date> map = new HashMap<String, Date>();

        for(int i = 0; i < pairs; i ++){
            String no = scanner.nextLine();
            String date = scanner.nextLine();
            map.put(no,stringToDate(date));
        }

        // 当前日期
        Date currDate = stringToDate("01/01/2014");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currDate);
        // 设置当前日期的年份减去60，这个就是后面比较日期大小的基数
        calendar.set(Calendar.YEAR,calendar.get(Calendar.YEAR)-60);

        // 遍历map这个员工信息  所有key（工号）的集合
        Set<String> empSet = map.keySet();
        // 获取set集合遍历的迭代器
        Iterator<String> empIterator = empSet.iterator();


        List<String> setEmp = new ArrayList<>();

        // 通过迭代器进行遍历
        while (empIterator.hasNext()) {
            // 获取工号信息
            String empNo = empIterator.next();
            // 根据工号信息获取其出生日期
            Date birthDate = map.get(empNo);
            // 转换为可以与基数日期比较的相同类型对象
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(birthDate);

            if(calendar.compareTo(calendar1)>=0 ){
                setEmp.add(empNo);
            }
        }

        setEmp.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String s:setEmp){
            System.out.println(s);
        }


    }

    public static Date stringToDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dateStr);
    }

}
