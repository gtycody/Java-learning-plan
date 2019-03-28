import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args){
		ArrayList<Student> Stude = new ArrayList<>();
		Student Sherry = new Student("Sherry");
		Stude.add(Sherry);
		Stude.add(null);
		int i = Stude.size();
		System.out.println(i);	
	}
}
class Student{
	String name;
	int score;
	public Student(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class SubmitServer{
	String name;
	int score;
	ArrayList<Student> submission = new ArrayList<>();
	ArrayList<Student> tScore = new ArrayList<>();
	
		public SubmitServer(String name){
		this.name = name;
	}
	public SubmitServer addSubmission(String name, int score){
		if(name == null || name.equals(" ")){
			return this;
		}else if(score < 0 || score > 100){
			return this;
		}else if(submission.size() > 0){
			for(int i = 0; i < submission.size(); i++){
				if(submission.get(i).getName().equals(name)){
					submission.get(i).tScores.add(score);
				}
			}
		}else if(submission.size() == 0){
			Student a = new Student(name);
		}
			
	return this;
	}
}

