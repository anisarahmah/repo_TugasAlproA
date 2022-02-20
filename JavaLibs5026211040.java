import javax.swing.JOptionPane;

public class JavaLibs5026211040 {
    public static void main(String[] Args) {
	
	JOptionPane.showMessageDialog(null,
			"Welcome to Korean Journey's Trip! \n"
			+ "\n"
			+ "Annyeonghaseyo Chin-gu, \n"
			+ "Bersiaplah untuk memulai perjalanan seru ke Korea. \n"
			+"\n"
			+ "Apakah kamu sudah siap?");
	
	String nama = null;
	String panggilan = null;
	String city = null;
	String food = null;
	String souv = null;
	String waktu = null;
	int quantity;
	double rate1, walk, kalori, puas;
	
	nama = JOptionPane.showInputDialog(null,"Nama Lengkap :");
	panggilan = JOptionPane.showInputDialog("Nama Panggilan: ");
	city = JOptionPane.showInputDialog(null,"Mau mengunjungi kota apa hari ini? ");
	walk = Double.parseDouble(JOptionPane.showInputDialog(null,"Kamu sanggup berjalan selama =____menit"));
	kalori = walk*15/50;


	JOptionPane.showMessageDialog(null,
			"Hmm, aku mulai lapar setelah mengelilingi kota " +city+ " selama " +walk+ " menit. Sepertinya kita perlu mengisi perut terlabih dahulu. Let's go!" );
	


	food = JOptionPane.showInputDialog(null,"Apa makanan Korea yang kamu inginkan? ");
	quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Mau beli " +food+ " berapa?"));
	waktu = JOptionPane.showInputDialog(null,"Kamu lebih suka jalan-jalan siang atau malam? ");

	
	
	JOptionPane.showMessageDialog(null,
			"Wah! sangat menyenangkan bisa mengunjungi kota " +city+ " bersama " +panggilan+ ". \n"
			+ "Tak terasa hari sudah menjelang " +waktu
			+ ". Kita harus segera pulang. Eh, hampir saja lupa! Kita harus membeli oleh-oleh terlebih dahulu, " +panggilan+ ".");
	
	souv = JOptionPane.showInputDialog(null,"Apa souvenir yang ingin dibeli?");
	rate1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Beri penilainmu untuk perjalanan hari ini dari 0.0 sampai 10.0"));
	puas = rate1*10;
	

	JOptionPane.showMessageDialog(null,
			"Welcome back " +nama+ "! \n"
			+ "\n"
			+ "Annyeong " +panggilan+ ", bagaimana perjalananmu di Korea? Pasti sangat Daebak! bukan. Hari ini kamu telah mengunjungi " +city+ " bersama Anisa. \n"
			+ "Tak terasa kita telah mengelilingi kota " +city+ " selama " +walk+ " menit. Kami berdua sudah membakar sekitar " +kalori+ " kalori dengan berjalan mengelilingi " +city+ " loh! /n"
			+ food+ " pun kami sudah mencobanya! Rasanya benar-benar enak. " +panggilan+ " bahkan hingga membeli " +food+ "sebanyak " +quantity+ ". Langit " +waktu+ " sangat cerah sehingga kami bisa menikmati makanan dengan segar. \n"
			+ " Oleh-oleh adalah hal yang tak boleh dilupakan saat berkunjung ke " +city+ ". " +souv+ " adalah pilihan yang bagus untuk dijadikan oleh-oleh. Seleramu cukup bagus, " +panggilan+ "! \n"
			+ " Akhirnya kami bisa memenuhi " +puas+ "% tingkat kepuasan " +panggilan+ " dalam Korean Journey Trip kali ini. Anisa sangat senang bisa menghabiskan perjalanan ini bersamamu! \n"
			+ " /n" 
			+ "See you on the next trip!");

	}
}