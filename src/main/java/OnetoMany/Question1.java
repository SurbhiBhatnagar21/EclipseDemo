package OnetoMany;


	import java.util.List;

import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.OneToMany;


	@Entity
	public class Question1{
		@Id
		private int Q_id;
		private String Question;
		
		@OneToMany(mappedBy="question")
		private List<Answer1>answers;

		public Question1() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Question1(int q_id, String question, List<Answer1> answers) {
			super();
			Q_id = q_id;
			Question = question;
			this.answers = answers;
		}

		public int getQ_id() {
			return Q_id;
		}

		public void setQ_id(int q_id) {
			Q_id = q_id;
		}

		public String getQuestion() {
			return Question;
		}

		public void setQuestion(String question) {
			Question = question;
		}

		public List<Answer1> getAnswers() {
			return answers;
		}

		public void setAnswers(List<Answer1> answers) {
			this.answers = answers;
		}
		
		

	}



