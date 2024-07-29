package java3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test02 {
	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				while(true) {
//					LocalDateTime dt = LocalDateTime.now(); //현재 날짜와 시간에 대한 정보를 얻어오기
//					DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd a HH:mm:ss"); //날짜형식 지정
//					String s = dt.format(f);
//					System.out.println(s);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException u) {
//						System.out.println(u.getMessage());
//					}
//				}
//				
//			}
//		};
//		new Thread(r).start();
		
//		new Thread(new Runnable() {	
//			@Override
//			public void run() {
//				while(true) {
//					LocalDateTime dt = LocalDateTime.now();
//					DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd a HH:mm:ss");
//					String s = dt.format(f);
//					System.out.println(s);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException u) {
//						System.out.println(u.getMessage());
//					}
//				}
//				
//			}
//		}).start();
		
		new Thread(() -> {
			while(true) {
				LocalDateTime dt = LocalDateTime.now();
				DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd a HH:mm:ss");
				String s = dt.format(f);
				System.out.println(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException u) {
					System.out.println(u.getMessage());
				}
			}		
		}).start();
		
		
		
	}

}
