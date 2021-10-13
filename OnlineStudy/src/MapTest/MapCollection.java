package MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //1. .put 添加
        map.put("大老婆", "贾文");
        map.put("二老婆", "景甜");
        System.out.println(map);

        //2. 获取map的值
        System.out.println(map.get("大老婆"));

        //3. 获取map中key 的set集合
        Set<String> mapset = map.keySet();
        System.out.println("遍历map的值");
        for (String key : mapset) {
            System.out.println(map.get(key));

        }
    }
}
