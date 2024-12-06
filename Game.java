
public class Game {

	public static void main(String[] args) {
		Warrior[] W = new Warrior[3];
		Witch[] S = new Witch[3];
		
		W[0] = new Warrior("天下第一刀",400,100);
		W[1] = new Warrior("天下第二刀",400,100);
		W[2] = new Warrior("天下第三刀",400,100);
		
		S[0] = new Witch("天下第一法",280,200);
		S[1] = new Witch("天下第二法",280,200);
		S[2] = new Witch("天下第三法",280,200);
		
		int a,b;
		
		while(true) {
			a=(int)(Math.random()*3);
			b=(int)(Math.random()*3);
			
			System.out.println(W[a].getName()+" attack "+S[b].getName()+" ...... ");
			W[a].NewMoon(S[b]);
			
			a=(int)(Math.random()*3);
			b=(int)(Math.random()*3);
			
			System.out.println(S[a].getName()+" attack "+W[b].getName()+" ...... ");
			S[a].SmallFire(W[b]);
		}

	}

}
