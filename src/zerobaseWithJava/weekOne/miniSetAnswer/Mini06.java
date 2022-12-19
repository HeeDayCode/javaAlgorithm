package zerobaseWithJava.weekOne.miniSetAnswer;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CancellationException;

public class Mini06 {


	public static void main(String[] args) {

		List<candidate> 후보자들 = new ArrayList<>();
		후보자들.add(new candidate(1, "이재명"));
		후보자들.add(new candidate(2, "윤석렬"));
		후보자들.add(new candidate(3, "심상정"));
		후보자들.add(new candidate(4, "안철수"));

		int voteCount = 100000;

		int min = 0;
		int max = 3;
		Random random = new Random();

		int i = 0;
		for (i = 1; i <= voteCount; i++) {
			int vote = random.nextInt(max - min + 1) + min;

			후보자들.get(vote).addVote();

			System.out.println("");
			System.out.println(후보자들.get(vote).getName());

			for (candidate x : 후보자들) {
				x.setTotalVoteCount(i);
				String msg = x.getDisplayInfo();
				System.out.println(msg);
			}
		}



	}

}
