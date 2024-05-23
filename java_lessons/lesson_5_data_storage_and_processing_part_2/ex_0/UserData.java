package java_lessons.lesson_4_data_storage_and_processing_part_2.ex_0;

import java.util.HashMap;
import java.util.Map;

public class UserData {
    Map<Integer, String> userData = new HashMap<>();

    void add(Integer passport, String lastName){
        userData.put(passport, lastName);
    }

    
    String findByLastName(String lastName) {
        StringBuilder sb = new StringBuilder();
        for (Integer key : userData.keySet()) {
            if (userData.get(key).equals(lastName)) {
                sb.append(key).append(" ").append(lastName).append("\n");
            }
        }
        return sb.toString();
    }
    
}

//------------------Мой_варинант_findByLastName_(возвращает коллекцию)-----------------

    // Map<Integer, String> findByLastName(String lastName) {
    //     Map<Integer, String> result = new HashMap<>();
    //     for (var item : userData.entrySet()) {
    //         if (item.getValue().equals(lastName)) {
    //             result.put(item.getKey(), lastName);
    //         }
    //     }
    //     return result;
    // }