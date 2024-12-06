
public class Role {
	protected String name;
	protected int life;
	protected int magic;
	
	public Role() {};
	public Role(String name,int life,int magic) {
		this.name = name;
		this.life = life;
		this.magic = magic;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setLife(int life) {this.life = life;}
	public int getLife() {return life;}
	public void setMagic(int magic) {this.magic = magic;}
	public int getMagic() {return magic;}
	
	@Override
	public String toString() {
		return "Name: "+getName()+"  Life: "+getLife()+"  Magic: "+getMagic();
	}

}
