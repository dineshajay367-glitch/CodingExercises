package Project;

public class Task {
    String description,startTime,endTime,priority;
    public Task(String description,String startTime,String endTime,String priority)
    {
        this.description=description ;
        this.startTime=startTime;
        this.endTime=endTime;
        this.priority=priority;
    }
    public String getDescription()
    {
        return description;
    }
    public String getstartTime()
    {
        return startTime;
    }
    public String getendTime()
    {
        return endTime;
    }
    public String getPriority()
    {
        return priority;
    }
    public void Display()
    {
        System.out.println(startTime+"-"+endTime+" "+description+" ["+priority+"]");
    }
}