package map;

import javax.activation.MailcapCommandMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍歷
 * Map提供了三種遍歷方式：
 * 1：遍歷所有的key
 * 2：遍歷所有的鍵值對
 * 3：遍歷所有的value（該操作相對不常用）
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("語文",99);
        map.put("數學",98);
        map.put("英語",97);
        map.put("物理",96);
        map.put("化學",95);
        System.out.println(map);
        //遍歷Map中所有的key
        Set<String>keySet= map.keySet();
        for(String key:keySet){
            System.out.println("key"+key);
        }
        /*
            遍歷所有value
            Collection values()
            將當前Map中所有value以一個集合形式返回
         */
        Collection<Integer>values=map.values();
        for(Integer value:values){
            System.out.println(value);
        }
        /*
            遍歷所有鍵值對
            將當前的鍵值對存入Entry集合中並返回
            java.util.Map.Entry它的每個實例表示Map中一組鍵值對
         */
        Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
        for(Map.Entry<String,Integer>e:entrySet){
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println(key+value);
        }


    }
}
