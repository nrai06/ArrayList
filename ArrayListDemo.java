import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		System.out.println(list.size() +":" +list);
		
//		add elements
		
		list.add(new Integer(10));//Boxing,till jdk 1.4 explicit conversion it was earlier
		list.add(88);// autoboxing ,jdk 1.5 onwards 
		list.add(10);
		System.out.println(list.size() +":" +list);
		
		//insert element
		list.add(1,100);
		System.out.println(list.size() +":" +list);
		list.add(2,200);
		System.out.println(list.size() +":" +list);
		
		//search
		boolean isElementAvailable=list.contains(110);
		if(isElementAvailable)
			System.out.println("element found");
		else
			System.out.println("not found");
		
		
	//delete
		Integer removed=list.remove(1);
		System.out.println(removed);
		System.out.println(list.size() +":" +list);
		
		//update
		list.set(2, 19);
		System.out.println(list.size() +":" +list);
		
//		list.add(4,8);
//		System.out.println(list.size() +":" +list);
		
		//iteration
		System.out.println("For Loop----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		System.out.println("For Each Loop--------");
		for(Integer Value:list) {
		System.out.println(Value);
		}
		
		System.out.println("Iterator------");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

}}
