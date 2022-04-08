package inheritance;

public class Hierarchical
{
   public static void main(String[] args) {
	
       Daughter d=new Daughter();
       d.look();
       d.scooty();
       Daughter.money();
       Daughter.mobile();
       
       
       Son s=new Son();
       s.look();
       s.bike();
       Son.money();
       
	}

}
