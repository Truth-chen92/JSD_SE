package map;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map是非常常用的數據結構，它體現的樣子是一個多行兩列的表格
 * 左列成為key,右列成為value
 * Map總是根據key獲取對應的value
 *
 * 常用實現類：java.util.HashMap 使用散列算法實現的Map,一般稱它
 *           為散列表或哈希表，它也是當今查詢速度最快的數據結構
 */
public class MapDemo {
    public static void main(String[] args) {
        /*
            Map使用時要對key和value分別制定泛型
         */
        Map<String,Integer>map=new HashMap<>();
        /*
            Vput(K k,V v)
            將一組鍵值對存入Map中

            Map有一個要求：key不允許重複（equals比較）
            如果使用重複的key存入value時則替換value
            那麼put方法的返回值為原來的value
            如果這個key不存，則返回null

            獲取put方法返回值時，如果Value的類型是包裝類，那麼盡量
            不要用基本類型去接收，因為方法可能返回null，如果出現自動
            拆箱會導致空指針
         */

        Integer num=map.put("語文",99);
        System.out.println(num);
        map.put("數學",98);
        map.put("英語",97);
        map.put("物理",96);
        map.put("化學",95);
        System.out.println(map);
        /*
            V get(Object key)
            根據key獲取Map中對應的value
            如果給定的key不存在則返回值為null
         */
        num=map.get("英語");
        System.out.println("英語"+num);
        num=map.get("體育");
        System.out.println("體育"+num);
        /*
            V remove(Object key)
            刪除Map中給定的key所對應的鍵值對，返回值為這個
            key所對應的的value
         */
        num=map.remove("英語");
        System.out.println(map);
        System.out.println(num);

        //獲取Map中的元素個數
        int size=map.size();
        System.out.println("size"+size);
        //判斷是否包含給定的key
        boolean ck=map.containsKey("物理");
        System.out.println("包含key"+ck);
        //判斷是否包含給定的value
        boolean cv=map.containsValue(99);
        System.out.println("包含value"+cv);


    }
}
