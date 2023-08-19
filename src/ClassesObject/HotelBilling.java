package ClassesObject;

public class HotelBilling {

	public int restaurantBilling(int room, int food) {

		int totalbilling = room + food;
		return totalbilling;
	}
	public int gstBilling(int roomgst, int foodgst) {
		int totalgst=roomgst+foodgst;
		return totalgst;
	}

	public static void main(String[] args) {

		HotelBilling hb = new HotelBilling();
		
		int totalbilling = hb.restaurantBilling(200,1000);
		System.out.println("getBilling = "+ totalbilling);
		
		int totalgst = hb.gstBilling(totalbilling, totalbilling);
		System.out.println("totalGST = "+ totalgst);

	}

}
