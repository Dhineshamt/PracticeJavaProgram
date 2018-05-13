package stringPrograms;
import java.util.ArrayList;
import java.util.List;

public class StringContains {

	public static void main(String[] args) {
		List<String> cityName = new ArrayList<>();
		cityName.add("Chennai Egmore");
		
		for(String city: cityName) {
		System.out.println(city.contains("Egmore"));
		}

	}

}
