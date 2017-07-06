package com.ctrip.personal.test;

import com.ctrip.personal.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ljxin on 2017/6/16.
 */
public class ListRemove {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("ljxin1");
        names.add("ljxin2");
        List<Student> students=creditStudents();
        students.removeAll(names);
        System.out.println(students.size());
        System.out.println("ssss");
    }

    public static List<Student> creditStudents(){
        List<Student> students =new ArrayList<Student>();
        Student student=null;
        for (int i=1;i<=10;i++){
            student=new Student();
            student.setName("ljxin"+i);
            student.setSex("男");
            student.setAge(18);
            student.setID("3707" + i);
            students.add(student);
        }
        return students;
    }
}
