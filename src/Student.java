import java.util.ArrayList;
import java.util.List;
public class Student {

    double totalMarks;
    double percentage;
    List marks=new ArrayList<>();
    public List getMarks() {
        return marks;
    }
    public void setMarks(List marks) {

        this.marks = marks;
    }
    public double calculateTotalMarks(){

        return 1.2;
    }
    public double calculatePerc(){

        return 1.2;
    }
}
