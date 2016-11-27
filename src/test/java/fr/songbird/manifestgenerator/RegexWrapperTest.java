package fr.songbird.manifestgenerator;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class RegexWrapperTest {

	@Test
	public void RegexWrapper_instanciation_test() 
	{
		final RegexWrapper rw = new RegexWrapper("\\w", 0);
		assertThat("This test is broken !",rw.get_m_regex().pattern(), is("\\w"));
	}
	
	@Test
	public void RegexWrapper_overloaded_constructor_test()
	{
		
	}

}
