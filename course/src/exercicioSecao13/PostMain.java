package exercicioSecao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PostMain {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String title = sc.nextLine();
		
		String likeMoment = sc.nextLine();
		
		String content = sc.nextLine();

		String like = likeMoment.substring(0, 2);
		Date moment = sdf.parse(likeMoment.substring(10));
		System.out.println(moment);
		
		Post post = new Post(moment, title, content, like);

		System.out.println("Comments: ");
		
		for (int i = 0; i < 2; i++) {
			String comment = sc.nextLine();
			Comment com = new Comment(comment);
			post.addComment(com);
		}
		
		System.out.println(post);
		
		System.out.println();
		
		sc.close();
	}
}
