package Todo;
import java.util.*;

public class todo {
	ArrayList<String> todos=new ArrayList<>();
	
	public void add(String task) {
		todos.add(task);
		System.out.println("Task added succesfully");
	}
	public void remove(int index){
		if(todos.size()!=0) {
		todos.remove(index);
		System.out.println("Task removed Succesfully");
		}
		
	}
	
	public void show() {
		if(todos.size()!=0) {
			for(int i=0;i<todos.size();i++) {
				System.out.println((i+1)+":"+todos.get(i));
			}
		}
		else {
			System.out.println("No task Added");
		}
	}

	public static void main(String[] args) {
		todo app=new todo();
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
			System.out.println("------TODO APP------");
			System.out.println("1.Add Task");
			System.out.println("2.Remove Task");
			System.out.println("3.Show Tasks");
			System.out.println("4.Exit");
			System.out.println("Enter: ");
			int choice=sc.nextInt();
			
			switch (choice) {
			case  1->{
				System.out.println("Enter Task to add");
				sc.nextLine();
				String task=sc.nextLine();
				app.add(task);
			}
			case 2->{
				app.show();
				if(app.todos.size()!=0) {
					System.out.println("Enter task to remove");
					int index=sc.nextInt();
					app.remove(index-1);
				}
				
			}
			case 3->{
				app.show();
				
			}
			case 4->{System.out.println("-----EXITED-----"); 
			flag=false;
			}

			default ->System.out.print("Invalid choice..");
			}
		}

	}

}
