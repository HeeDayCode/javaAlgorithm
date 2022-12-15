package zerobaseWithJava.weekOne.miniPractice;

import java.math.BigDecimal;
import java.util.Random;

public class VoteMaker {
//6번 문제 고은희
	static int totalNum = 10000;
	
	public String VoteRate(int count) {
		BigDecimal voteRate = BigDecimal.ZERO;
		if (count != 0) {
			BigDecimal countData = new BigDecimal(count);
			BigDecimal totalNumData = new BigDecimal(totalNum);
			voteRate = countData.divide(totalNumData);		
		}
		return String.format("%.2f", voteRate.multiply(new BigDecimal(100)));
	}

	public VoteMaker(int voteEndPersonCnt, int vote1Cnt, int vote2Cnt, int vote3Cnt, int vote4Cnt, String voteName) {
		// TODO Auto-generated constructor stub
		System.out.println("[투표진행율]: " + VoteRate(voteEndPersonCnt) + "%, " + voteEndPersonCnt + "명 투표 => " + voteName);
		System.out.println("[기호:1] 이재명: " + VoteRate(vote1Cnt) + "%, (투표수: " + vote1Cnt + ")");
		System.out.println("[기호:2] 윤석열: " + VoteRate(vote2Cnt) + "%, (투표수: " + vote2Cnt + ")");
		System.out.println("[기호:3] 심상정: " + VoteRate(vote3Cnt) + "%, (투표수: " + vote3Cnt + ")");
		System.out.println("[기호:4] 안철수: " + VoteRate(vote4Cnt) + "%, (투표수: " + vote4Cnt + ")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String voteName = "";
		int voteEndPersonCnt = 0;
		int vote1Cnt = 0;
		int vote2Cnt = 0;
		int vote3Cnt = 0;
		int vote4Cnt = 0;

		Random random = new Random();
		for (int i = 0; i < totalNum; i++) {
			int randomData = random.nextInt(totalNum+1) % 4 + 1;
			switch (randomData) {
			case 1: // 1 인 경우
				vote1Cnt++;
				voteName ="이재명";
				break;
			case 2: // 2 인 경우
				vote2Cnt++;
				voteName ="윤석열";
				break;
			case 3: // 3 인 경우
				vote3Cnt++;
				voteName ="심상정";
				break;
			case 4: // 3 인 경우
				vote4Cnt++;
				voteName ="안철수";
				break;
			default: // 모두 해당이 안되는 경우
				System.out.println("오류");
			}
			voteEndPersonCnt++;
			VoteMaker voteResult = new VoteMaker(voteEndPersonCnt, vote1Cnt, vote2Cnt, vote3Cnt, vote4Cnt, voteName);
		}
	}

}
