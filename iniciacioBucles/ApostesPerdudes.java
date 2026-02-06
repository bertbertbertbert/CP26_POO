		package iniciacioBucles;
		
		import java.util.Scanner;
		
		public class ApostesPerdudes {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner scan = new Scanner(System.in);
				int puntuacion = scan.nextInt();
				int partidasPerdidas = 0;
				
				while(puntuacion != 0) {
					
					if(puntuacion < 0) {
						partidasPerdidas++;
						
					}
					
					puntuacion = scan.nextInt();
				}
		
				System.out.println(partidasPerdidas);
			}
		
		}
