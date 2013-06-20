/**
 *
 */
package com.apitrary.orm.r;

import java.io.IOException;
import java.net.URL;
import java.util.Random;

import com.apitrary.api.ApitraryApi;
import com.apitrary.api.client.ApitraryClient;
import com.apitrary.api.client.common.Timer;
import com.apitrary.api.client.exception.CommunicationErrorException;
import com.apitrary.orm.sample.dao.MyDao;
import com.apitrary.orm.sample.model.Employer;
import com.apitrary.orm.sample.model.Occupation;
import com.apitrary.orm.sample.model.Person;

/**
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Runner {

	public static String apiK = "my apikey";
	public static String eID = "my api idb";

	public static void main(String[] args) throws IOException {

		ApitraryApi apitraryApi = new ApitraryApi(eID, apiK);
		ApitraryClient apitraryClient = ApitraryClient.connectTo(apitraryApi);
		MyDao dao = new MyDao(apitraryClient);
		Timer timer;

		@SuppressWarnings("unused")
		URL url = Runner.class.getClassLoader().getResource("test.jpg");

		// InputStream is = url.openStream();
		// BufferedImage bufferedImage = ImageIO.read(is);
//
//		Occupation occupation = new Occupation();
		// occupation.setImage(bufferedImage);
		//
		// timer = Timer.tic();
		// dao.save(occupation);
		// timer.toc();
		// System.out.println(timer.getDifference()+"ms");
		//

		// timer = Timer.tic();
		// List<Occupation> occs = dao.findAll(Occupation.class);
		// timer.toc();
		// System.out.println(timer.getDifference()+"ms");
		// for(Occupation occ : occs){
		// System.out.println(occ);
		// }
		//
		// System.out.println(dao.getAPIState());
		//
		// for (int i = 0; i < 1; i++) {
		// timer = Timer.tic();
		// Person p = new Person();
		// p.setPreName("Denis");
		// p.setSurName("Neuling");
		//
		// p.setOccupation(occupation);
		// p = dao.save(p);
		// System.out.println("MS: " + timer.toc() + " " + p);
		//
		// // p.setPreName("Denis");
		// // p = dao.update(p);
		// // p = dao.findById(p.getId(), Person.class);
		// // dao.delete(p);
		// //
		// }

		// // try {
		// // Thread.currentThread().sleep(4000);
		// // } catch (InterruptedException e) {
		// // e.printStackTrace();
		// // }
		//
		// try{
		// timer = Timer.tic();
		// List<Person> persons = dao.findAll(Person.class);
		// List<Occupation> occupations = dao.findAll(Occupation.class);
		// //
		// for (Person person : persons) {
		// System.out.println(person.toString());
		// dao.delete(person);
		// // System.out.println(person.getOccupation());
		// }
		// for(Occupation occse : occupations){
		// System.out.println(occse.toString());
		// dao.delete(occse);
		// }
		// System.out.println("FOUND: "+persons.size()+" MS: " + timer.toc());

		Random r = new Random();
		Person p1 = null;
		for(int i = 0 ; i < r.nextInt(1000)+1; i++){
			p1 = randPerson();
			dao.save(p1);
			System.out.println(p1);
			p1.setPreName("test");
			dao.update(p1);
			System.out.println(p1);
		}

		dao.delete(p1);

		timer = Timer.tic();
		boolean flag = true;
		int failed = 0;
		while (flag) {
			try {
				dao.findAll(Person.class);
				flag = false;
			} catch (CommunicationErrorException cee) {
				System.out.println(cee.getMessage());
				failed ++;
			}
		}
//		System.out.println("MS: " + timer.toc() + " " + failed);

		for(Person p: dao.findAll(Person.class)){
			System.out.println(p);
			dao.delete(p);
		}
		//
		// timer = Timer.tic();
		// for (Person person : persons) {
		// dao.delete(person);
		// }
		// System.out.println("MS: " + timer.toc());
		// }catch(Exception e){}
		//
		// System.out.println(dao.getAPIState());

		for (Occupation o : dao.findAll(Occupation.class)) {
			System.out.println(o);
			dao.delete(o);
		}
	}

	private static Person randPerson(){
		Random r = new Random();

		Person person = new Person();
		person.setPreName(new Long(r.nextLong()).toString());
		person.setSurName(new Long(r.nextLong()).toString());

		if(r.nextBoolean()){
			Occupation occupation = new Occupation();
			occupation.setName(new Long(r.nextLong()).toString());
			person.setOccupation(occupation);
		}
		return person;
	}
}
