import com.feng.Util.AllUserInfo;
import com.feng.dao.BookMapper;
import com.feng.dao.UserMapper;
import com.feng.pojo.Books;
import com.feng.pojo.User;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class myTest {

	@Test
	public void test01() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookMapper bean = context.getBean(BookMapper.class);
		List<Books> all = bean.findAll();
		for (Books books : all) {
			System.out.println(books);
		}
	}

	@Test
	public void test02() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllUserInfo bean = context.getBean(AllUserInfo.class);
		Map<String, String> map = bean.UsersMap();
		System.out.println(map);
	}
}
