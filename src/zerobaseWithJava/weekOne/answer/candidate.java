package zerobaseWithJava.weekOne.answer;

public class candidate {

	private int no;
	private String name;
	private int totalVoteCount;
	private int voteCount;


	public candidate(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getDisplayInfo() {

		double rate = (double) voteCount * 100 / totalVoteCount;

		String msg = String.format("[기호: %d] %s: %f %%, (투표수: %d)"
			, no, name, rate, voteCount);

		return msg;
		//System.out.println(msg);
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalVoteCount() {
		return totalVoteCount;
	}

	public void setTotalVoteCount(int totalVoteCount) {
		this.totalVoteCount = totalVoteCount;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	/**
	 * 투표수를 한개 증가
	 */
	public void addVote() {
		voteCount++;
	}

}
