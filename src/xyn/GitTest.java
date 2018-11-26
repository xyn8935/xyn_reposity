package xyn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GitTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("测试Git的项目");
		Collection c = new ArrayList();
		c.add("1");
		c.add("2");
		c.add("3");
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
