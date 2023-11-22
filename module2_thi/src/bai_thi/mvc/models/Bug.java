package bai_thi.mvc.models;

public class Bug {
    private String bugId;
    private String bugName;
    private String bugDetail;
    private String bugTiming;
    private String bugLevel;

    public Bug() {
    }

    public Bug(String bugId, String bugName, String bugDetail, String bugTiming, String bugLevel) {
        this.bugId = bugId;
        this.bugName = bugName;
        this.bugDetail = bugDetail;
        this.bugTiming = bugTiming;
        this.bugLevel = bugLevel;
    }

    public String getBugId() {
        return bugId;
    }

    public void setBugId(String bugId) {
        this.bugId = bugId;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getBugDetail() {
        return bugDetail;
    }

    public void setBugDetail(String bugDetail) {
        this.bugDetail = bugDetail;
    }

    public String getBugTiming() {
        return bugTiming;
    }

    public void setBugTiming(String bugTiming) {
        this.bugTiming = bugTiming;
    }

    public String getBugLevel() {
        return bugLevel;
    }

    public void setBugLevel(String bugLevel) {
        this.bugLevel = bugLevel;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugId='" + bugId + '\'' +
                ", bugName='" + bugName + '\'' +
                ", bugDetail='" + bugDetail + '\'' +
                ", bugTiming='" + bugTiming + '\'' +
                ", bugLevel='" + bugLevel + '\'' +
                '}';
    }
}
