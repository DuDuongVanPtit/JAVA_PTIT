package TH3.Bai4;
public class Information {
    private String teamName, schoolName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    public String toString(){
        return this.teamName + " " + this.schoolName;
    }
    
}
