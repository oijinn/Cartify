package com.example.cartify.Utilities;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Static {

    public static List<String> getPojoFields(Object pojo) {
        if (pojo != null) {
            List<String> strings = new ArrayList<>();
            Class<?> clazz = pojo.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                strings.add(field.getName());
            }
            return strings;
        }
        else {
            return null;

        }
    }

}
