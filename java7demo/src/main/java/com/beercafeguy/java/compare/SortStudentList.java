package com.beercafeguy.java.compare;

import java.util.*;

public class SortStudentList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getCgpa()!=s2.getCgpa()){
                    double diff=s2.getCgpa()-s1.getCgpa();
                    if(diff >0){
                        return 1;
                    }else{
                        return -1;
                    }
                }else if (!s1.getFname().equals(s2.getCgpa())){
                    return s1.getFname().compareTo(s2.getFname());
                }else{
                    return s1.getId()-s2.getId();
                }
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
