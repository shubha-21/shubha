import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Greater_number {
	public static void main(String[] args) {
		int a =56532;
		double y=a;
		int b =64654;
		int c =56224;
		int d = (a>b)?a:b;
		int e = (d>c)?d:c;
		System.out.println(e);
		if(a>b&&a>c) {System.out.println("a is the largest no");}
		else if (b>a&&b>c) {System.out.println("b is the largest no");}
		else {System.out.println("c is the largest no");
		}
				
	
	
	int num= 10;
	int i=0;
	int j=0;
	for (int k=0;k<num;k++) {
		if(k%2==0) {
			i=i+k;
		}
		else if (k%2!=0) {
			j=j+k;
		}
	}
		System.out.println(i);
		System.out.println("===================");
		System.out.println(j);
			
	for (char z='a';z<'n';z++) {
		System.out.println(z);
	}
	
	System.out.println(y);
	}	}
	
	

