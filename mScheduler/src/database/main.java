package database;

public class main {

	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		DatabaseController cont = new DatabaseController();
		System.out.println("Scenes names:");
		cont.getAllScenes();
		System.out.println(newLine+"Search by Scene");
		cont.getSceneByName("Scene:1");
		System.out.println(newLine+"Search Time by Band");
		cont.getBandTimesByName("Band:1");
		System.out.println(newLine+"Search Info by Band");
		cont.getBandInfoByName("Band:1");
		System.out.println(newLine+"Search Info by Member");
		cont.getMemberInfoByName("Fylking");
		
		System.out.println("Sara testing");
		cont.setBand("");
		
		System.out.println("Sara test worker");
		cont.setWorker("");
		
		System.out.println("Sara test scenes");
		cont.setScene(" ");
		
		System.out.println("Sara test performance");
		cont.setPerformance(" ");
		
		System.out.println("Sara test musician");
		cont.setMusician(" ");
		
		System.out.println("Sara test members3");
		cont.setMembers(" ");
		
	
	}

}
