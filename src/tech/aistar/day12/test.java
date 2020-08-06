package tech.aistar.day12;

import java.util.Arrays;

/**
 * @author 唐鑫磊
 * @date 2020/8/5 20:55
 */
public class test {
    public static void main(String[] args) {
        String str = "eeaakglaejbnclkeawuiojsdlkqpapprpprthgrfgppwdiiiiioifdjsgeliuqiwo";
        String str1 ="aspire";
        int[] str2 ={0,0,0,0,0,0};
        for (int i = 0; i < str1.length(); i++) {
            for(int j=0;j<str.length();j++){
                if(str1.charAt(i)==str.charAt(j)){
                    str2[i]++;
                }
            }
        }
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i)+":"+str2[i]+"\t");
        System.out.println();

        for(int i=0;i<str1.length();i++){
            for(int j=i+1;j<str1.length();j++){
                if(str2[i]<str2[j]){
                    char t1=str1.charAt(i);
                    char t2=str1.charAt(j);
                    str1=str1.replace(str1.charAt(i),',');
                    str1=str1.replace(str1.charAt(j),t1);
                    str1=str1.replace(',',t2);
                    int s=str2[i];
                    str2[i]=str2[j];
                    str2[j]=s;
                }
            }
        }
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i)+":"+str2[i]+"\t");
    }
}