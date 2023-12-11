package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("/Users/ljh/Desktop/movie.txt");


        Comparator<MovieInfo> descOrder = new Comparator<MovieInfo>() {
            public int result = 0;
            @Override
            public int compare(MovieInfo o1, MovieInfo o2) {
                if(o1.getAttendance() < o2.getAttendance()){ result = 1;   }  //국어점수 오름차순
                else if(o1.getAttendance() == o2.getAttendance()){  result = 0;   }  //국어점수 동점이라면
                else{  result = -1;   }  //o1.kor < o2.kor
                return result;
            }
        };
        Comparator<MovieInfo> ascOrder = new Comparator<MovieInfo>() {
            int result = 0;
            @Override
            public int compare(MovieInfo o1, MovieInfo o2) {
                if(o1.getAttendance() > o2.getAttendance()){ result = 1;   }  //국어점수 오름차순
                else if(o1.getAttendance() == o2.getAttendance()){  result = 0;   }  //국어점수 동점이라면
                else{                      result = -1;   }  //o1.kor < o2.kor
                return result;
            }
        };

        pw.println("--------------------------------------------------------------------------------------------------");
        pw.println("제목               감독             주연배우           개봉연도       관객수");
        pw.println("--------------------------------------------------------------------------------------------------");

        List<MovieInfo> movieInfo = new ArrayList<>();
        String[] title = {"과속스캔들", "왕의남자", "괴물"};
        String[] director = {"김형철", "이준익", "봉준호"};
        String[] mainActor = {"차태현", "김우성", "송강호"};
        String[] year = {"2008", "2005", "2006"};
        int[] attendance = {828, 1560, 1301};

        for(int i = 0; i < title.length; i++) {
            movieInfo.add(new MovieInfo(title[i],director[i],mainActor[i],year[i],attendance[i]));
        }

        Loop:
        while(true) {
            System.out.println("0: 영화 정보 입력, 1: 내림차순 정렬, 2: 오름차순 정렬");
            int input = Integer.parseInt(bf.readLine());
            if(input == 0) {
                System.out.println("제목을 입력해주세요 : ");
                String newTitle = bf.readLine();
                System.out.println("감독을 입력해주세요 : ");
                String newDirector = bf.readLine();
                System.out.println("주연배우를 입력해주세요 : ");
                String newMainActor = bf.readLine();
                System.out.println("개봉연도를 입력해주세요 : ");
                String newYear = bf.readLine();
                System.out.println("관객수를 입력해주세요 : ");
                int newAttendance = Integer.parseInt(bf.readLine());
                movieInfo.add(new MovieInfo(newTitle, newDirector, newMainActor, newYear, newAttendance));
            } else if(input == 1) {
                Collections.sort(movieInfo, descOrder);
                break Loop;
            } else if(input == 2) {
                Collections.sort(movieInfo, ascOrder);
                break Loop;
            } else {
                throw new IllegalArgumentException("잘못된 입력 값 입니다.");
            }
        }

        for (MovieInfo info : movieInfo) {
            pw.println(info.getMovie() + info.getDirector() + info.getMainActor() + info.getYear() + info.getAttendance());
        }

        pw.close();
    }
}