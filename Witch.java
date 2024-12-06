import java.util.Scanner;
public class Witch extends Role{
	public Witch(String name,int life,int magic) {
		super(name,life,magic);
	}
	
	public void SmallFire(Warrior w) {
		if(magic < 25) {
			System.out.println("not enough magic, cannot attack.");
		}else {
			magic -= 25;
			w.setLife(w.getLife()-40);
			
			System.out.printf("%s %s\n", this,w);
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+name);
				System.exit(0);
			}
		}
	}
	
	public void SmallFire(Witch w) {
		if(magic < 25) {
			System.out.println("not enough magic, cannot attack.");
		}else {
			magic -= 25;
			w.setLife(w.getLife()-60);
			
			System.out.printf("%s %s\n", this,w);
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+name);
				System.exit(0);
			}
		}
	}

}
