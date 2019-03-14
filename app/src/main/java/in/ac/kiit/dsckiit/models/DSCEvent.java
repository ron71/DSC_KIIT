package in.ac.kiit.dsckiit.models;

import java.util.ArrayList;

public class DSCEvent {
    String evnet_ID,domain_ID,event_Name,even_Description, venue,date, time,reg_closing_date;
    ArrayList<String> going = new ArrayList<>();
    ArrayList<String> not_going = new ArrayList<>();
    ArrayList<String> waiting = new ArrayList<>();



    public DSCEvent(String evnet_ID, String doamain_ID, String event_Name, String even_Description, String venue, String date, String time, String reg_closing_date, ArrayList<String> going, ArrayList<String> not_going, ArrayList<String> waiting) {
        this.evnet_ID = evnet_ID;
        this.domain_ID = doamain_ID;
        this.event_Name = event_Name;
        this.even_Description = even_Description;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.reg_closing_date = reg_closing_date;
        this.going = going;
        this.not_going = not_going;
        this.waiting = waiting;
    }

    public String getEvnet_ID() {
        return evnet_ID;
    }

    public String getDoamain_ID() {
        return domain_ID;
    }

    public String getEvent_Name() {
        return event_Name;
    }

    public String getEven_Description() {
        return even_Description;
    }

    public String getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReg_closing_date() {
        return reg_closing_date;
    }

    public ArrayList<String> getGoing() {
        return going;
    }

    public ArrayList<String> getNot_going() {
        return not_going;
    }

    public ArrayList<String> getWaiting() {
        return waiting;
    }
}
