package classAndObject;


public class RRR extends Movie{
	String actor;
	String actress;
	String villan;
	public RRR(String dir,int bud,String actor, String actress, String villan) {
		super(dir, bud);
		this.actor = actor;
		this.actress = actress;
		this.villan = villan;
	}
	@Override
	public String toString() {
		return "RRR [actor=" + actor + ", actress=" + actress + ", villan=" + villan + ", dir=" + dir + ", bud=" + bud
				+ "]";
	}
	
	
}
