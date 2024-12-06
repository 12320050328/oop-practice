import java.util.Scanner;
public class Witch {
	private String name;
	private int life;
	private int magic;
	
	public Witch() {};
	public Witch(String name,int life,int magic) {
		this.name = name;
		this.life = life;
		this.magic = magic;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getLife() {
		return life;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public int getMagic() {
		return magic;
	}
	
	public void SmallFire(Warrior w) {
		if(magic < 25) {
			System.out.println("not enough magic, cannot attack.");
		}else {
			magic -= 25;
			w.setLife(w.getLife()-40);
			
			System.out.println(name+":");
			System.out.printf("Life: %d  Magic: %d\n",life,magic);
			System.out.println(w.getName()+":");
			System.out.printf("Life: %d  Magic: %d\n",w.getLife(),w.getMagic());
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+ name);
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
			
			System.out.println(name+":");
			System.out.printf("Life: %d  Magic: %d\n",life,magic);
			System.out.println(w.getName()+":");
			System.out.printf("Life: %d  Magic: %d\n",w.getLife(),w.getMagic());
			
			if(w.getLife()<=0) {
				System.out.println(w.getName()+" died after being attacked by "+name);
				System.exit(0);
			}
		}
	}

}
