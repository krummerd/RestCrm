import java.text.DateFormat;
import java.util.Date;

public class Event {

    int id;
    String msg;
    Date date;
    DateFormat df;

    public Event(){

    }

    public Event(Date date, DateFormat df){
        this.id =(int) Math.random()*100;
        this.date = date;
        this.df = df;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        date = new Date();
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
