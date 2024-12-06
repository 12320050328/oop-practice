import java.util.Scanner;
public class Warrior extends Role{
	public Warrior(String name,int life,int magic) {
		super(name,life,magic);
	}
	
	public void NewMoon(Warrior w) {
		if(magic < 10) {
			System.out.println("not enough magic, cannot attack.");
		}else {
			magic -= 10;
			w.setLife(w.getLife()-25);
			
			System.out.printf("%s %s\n", this,w);
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+name);
				System.exit(0);
			}
		}
	}
	
	public void NewMoon(Witch w) {
		if(magic < 10) {
			System.out.println("not enough magic, cannot attack.");
		}else {
			magic -= 10;
			w.setLife(w.getLife()-40);
			
			System.out.printf("%s %s\n", this,w);
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+name);
				System.exit(0);
			}
		}
	}

}
