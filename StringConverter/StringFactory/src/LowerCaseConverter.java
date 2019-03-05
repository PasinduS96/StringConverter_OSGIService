
public class LowerCaseConverter extends StringConverter {

	@Override
	public String convertString(String str) {
		
		return str.toLowerCase();
		
	}

	@Override
	public void convertASCII(String str) {
		
	}

	@Override
	public void translate(String fromLang, String toLang, String text) throws Exception {
	}

}
