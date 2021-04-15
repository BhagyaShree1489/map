package map;

public class Test {
int i;
Test(int i){
	this.i=i;
}
	public int hashCode() {
		return i%9;
	}
	public String toString() {
		return i +"";
	}
}
