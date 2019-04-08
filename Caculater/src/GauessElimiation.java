
public class GauessElimiation {
	public static void main(String[] args){
		Gauss row1 = new Gauss();
		double[] m1 = new double[]{1,0,1,1};	
		double[] m2 = new double[]{-3,1,0,2};	
		double[] m3 = new double[]{2,0,1,3};	
		row1.Output(m1);
		m1 = row1.Eliminatefirstterm(m1,0);
	    m2 = row1.Eliminatefirstterm(m2,0);
	    m2 = row1.replace(m1, m2);
	    m3 = row1.Eliminatefirstterm(m3,0);
	    m3 = row1.replace(m1, m3);
	    m2 = row1.Eliminatefirstterm(m2,1);
	    m3 = row1.Eliminatefirstterm(m3,1);
	    m3 = row1.replace(m2, m3);
	    m3 = row1.Eliminatefirstterm(m3, 2);
	    row1.Output(m1);
	    row1.Output(m2);
	    row1.Output(m3);
	}
}
class Gauss{
	//
	public double[] Eliminatefirstterm(double[] i, int num){
		double start = i[num];
		System.out.println("Start is :" + start);
		for (int count = 0; count < i.length; count++){
				i[count] = i[count]/start;
				System.out.println(i[0] + "和 " + count);
		}
		return i;
	}
	//
	public void Output(double[] m1){
		for(int count = 0; count < m1.length; count++){
			System.out.print(m1[count] + "   ");
		}
		System.out.println();
	}
	//
	public double[] replace(double[] i1, double[] i2){
		for(int i = 0; i < i1.length; i++){
			i2[i] = (i1[i]-i2[i]);
		}
		return i2;
	}
}


