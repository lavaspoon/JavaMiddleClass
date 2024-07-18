package ex.claszz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //String Class 정보 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        //Class clazz1 = new String().getClass(); // 2. 인스턴에서 조회
        //Class clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회

        Field[] field = clazz.getDeclaredFields();
        for (Field field1 : field) {
            System.out.println("field1 = " + field1.getType() + " " + field1.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        String superClass = clazz.getSuperclass().getName();
        System.out.println("superClass = " + superClass);

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }
    }
}
