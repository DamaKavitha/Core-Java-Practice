/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
class Sport{
    public String Sport;
    public void Sport(String Sport)
    {
        this.Sport=Sport;
        
    }
    public static void main(String args[])
    {
        Sport obj=new Sport();
        obj.Sport("Football");
        System.out.println("Sport name :"+obj.Sport);
    }
}