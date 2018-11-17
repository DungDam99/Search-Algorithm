package SearchAlgorithm.TimChuoiLienTiepCoDoDaiLonNhat;

import java.util.ArrayList;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static String TimChuoiLienTiepCoDoDaiLonNhat(String s){
        char[] arr = s.toCharArray();
        String result = "";
        int i = 0;

        do{
            ArrayList<Character> temp = new ArrayList<>();
            temp.add(arr[i]);
            while(i < arr.length - 1 && arr[i] < arr[i + 1]){
                    temp.add(arr[++i]);
            }
            i++;
            String result1 = new String(String.valueOf(temp));
            if(result.length() < result1.length()){
                result = result1;
            }
        }while(i < arr.length);
        return result;
    }
}
