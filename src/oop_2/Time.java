package oop_2;

public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    void setDate(int hour, int minute, int second){
        System.out.printf("hour:%d:minute:%d:second:%d", hour, minute, second);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
    int nextSecond(){
        if(second <= 59){
            return second += 1;
        } else {
            return 1;
        }
    }
    int previousSecond(){
        if(second >= 1){
            return second -= 1;
        } else {
            return 60;
        }
    }

}
