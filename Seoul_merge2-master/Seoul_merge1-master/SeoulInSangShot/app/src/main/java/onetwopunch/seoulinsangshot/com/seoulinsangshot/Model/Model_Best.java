package onetwopunch.seoulinsangshot.com.seoulinsangshot.Model;

/**
 * Created by Beom2 on 2017-10-06.
 */

public class Model_Best {

    String id;
    String area;
    String url;
    String phoneType;
    String phoneApp;
    String season;
    String time;
    String tip;
    String nowdate;
    int likecount;
    int view;

    public Model_Best() {
    }

    public Model_Best(String id, String area, String url, String phoneType, String phoneApp, String season, String time, String tip, int likecount, int view) {
        this.id = id;
        this.area = area;
        this.url = url;
        this.phoneType = phoneType;
        this.phoneApp = phoneApp;
        this.season = season;
        this.time = time;
        this.tip = tip;
        this.likecount = likecount;
        this.view = view;
    }

    public int getLikecount() {
        return likecount;
    }

    public int getView() {
        return view;
    }

    public String getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public String getUrl() {
        return url;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneApp() {
        return phoneApp;
    }

    public String getSeason() {
        return season;
    }

    public String getTime() {
        return time;
    }

    public String getTip() {
        return tip;
    }

    //public String getNowdate(){return  nowdate;}
}
