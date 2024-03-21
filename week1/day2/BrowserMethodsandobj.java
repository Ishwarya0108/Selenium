package week1.day2;

public class BrowserMethodsandobj {
	
		
		public String browsername (String browsername) {
			return browsername;
		}
		
		public void loadurl() {
			System.out.println("Application URL loaded successfully");
		}

		public static void main(String[] args) {
			BrowserMethodsandobj mo=new BrowserMethodsandobj();
			
			String Browsername = mo.browsername("Chrome");
			System.out.println("Browser launched successfully: "+Browsername);
			mo.loadurl();
		}
	
}

