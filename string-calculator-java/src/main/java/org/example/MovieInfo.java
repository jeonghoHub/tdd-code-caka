package org.example;

public class MovieInfo implements Comparable<MovieInfo>{
    private String movie;
    private String director;
    private String mainActor;
    private String year;
    private int attendance;

    public MovieInfo(String movie, String director, String mainActor, String year, int attendance) {
        this.movie = movie;
        this.director = director;
        this.mainActor = mainActor;
        this.year = year;
        this.attendance = attendance;
    }

    public String getMovie() {
        return addBlank(movie);
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDirector() {
        return addBlank(director);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMainActor() {
        return addBlank(mainActor);
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getYear() {
        return addBlank(year+"(년)");
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "movie='" + movie + '\'' +
                ", director='" + director + '\'' +
                ", mainActor='" + mainActor + '\'' +
                ", year='" + year + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    private String addBlank(String value) {
        while (value.length() < 15) {
            value = value + " ";
        }
        return value;
    }

    @Override
    public int compareTo(MovieInfo o) {
        if(this.attendance > o.attendance) {
            return -1;
        } else if(this.attendance == o.attendance) {
            return 0;
        } else {
            return 1;
        }
    }
}
