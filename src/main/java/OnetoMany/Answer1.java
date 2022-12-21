package OnetoMany;



	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.ManyToOne;

	@Entity
	public class Answer1 {
		@Id
		private int A_id;
		private String answer;
		
		@ManyToOne
		private Question1 question;

		public Answer1() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Answer1(int a_id, String answer, Question1 question) {
			super();
			A_id = a_id;
			this.answer = answer;
			this.question = question;
		}

		public int getA_id() {
			return A_id;
		}

		public void setA_id(int a_id) {
			A_id = a_id;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		public Question1 getQuestion() {
			return question;
		}

		public void setQuestion(Question1 question) {
			this.question = question;
		}
		
		
		
		
}
