package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachDemo1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("john","alex","mike");
		Consumer<String> convertUpperCase=new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t.toUpperCase());
						
					}
			
				};
				names.forEach(convertUpperCase);
				Consumer<Integer> display=a->System.out.println(a);
				display.accept(10);
				

	}

}
