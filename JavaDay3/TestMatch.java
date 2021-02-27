public class TestMatch extends Match {
	
    public float calculateRunRate(){
        float res1=(getTarget()-getCurrentscore())/(90-getCurrentover());
       
        return res1;
 		}

 public int calculateBalls()
 {
int res2=(int) ((90-getCurrentover())*6);
return res2;
 }
 public void display(double reqRunRate,int balls)
 {
	 final int runs = ((getTarget())-(getCurrentscore()));
	 System.out.println("Need "+runs+" runs in " +balls+" balls");
	 System.out.println("Required Runrate:"+reqRunRate);
 }
	

}