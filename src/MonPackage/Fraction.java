/**
 * 
 */
package MonPackage;

/**
 * @author bdvm
 *
 */
public class Fraction {

	private int numerateur;
	private int denominateur;
	public Fraction (int numerateur, int denominateur)
	{
		this.numerateur=numerateur;
		this.denominateur=denominateur;
	}
	public Fraction (int numerateur) 
	{
		this(numerateur,1);
	}
	public Fraction() 
	{
		this(0,1);
	}
	public String toString() 
	{
		return "("+this.numerateur+"/"+this.denominateur+")";
	}
	public int getNumerateur()
	{
		return this.numerateur;
	}
	public int getDenominateur() 
	{
		return this.denominateur;
	}	
}
