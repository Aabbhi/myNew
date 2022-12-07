package java8Projetc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FirstTst {

	public static void main(String[] args) {
		
		IProject8 d=()->"anhhi" ;
		//System.out.println(d.print());
		
		List<String> a= new ArrayList<>();
		a.add("abhi");
		a.add("pooja");
		a.add("abhi1");
		a.add("abhi2");
		
		//a.stream().filter(s->s.startsWith("a")).sorted().forEach(s->System.out.println(s));
	 String temp="";
//		for(String s:a)
//		{
//			temp=s;
//			s=temp+s;
//		}
		Consumer<String> method = (n) -> { System.out.println(n); };
		//a.forEach(method);
		
		BiConsumer<List<String>,String> l=(list,s)->{
			
			for (int i = 0; i < list.size(); i++)
			{
			 s=list.get(i)+s;
			}
			System.out.println(s);
		};
		l.accept(a,temp);
		
		Consumer<Integer> method1 = (n) -> { 
			if(n>10)
			System.out.println("positive"); 
			else
				System.out.println("less positive");
		
		};
		
		method1.accept(10);
		
	}

}
