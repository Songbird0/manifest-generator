package fr.songbird.manifestgenerator.test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Test;

import fr.songbird.manifestgenerator.RegexWrapper;

import static org.hamcrest.core.Is.*;

public class RegexWrapperTest {

	@Test
	public void RegexWrapper_instanciation_test() 
	{
		final String PATTERN_PARAMETER = "\\w";
		final RegexWrapper RW = new RegexWrapper(PATTERN_PARAMETER, 0);
		final String PATTERN_STRING = RW.get_m_regex().pattern();
		assertThat("PATTERN_STRING isn't equals to "+ PATTERN_PARAMETER 
				+ "\nDebug: PATTERN_STRING == '" 
				+ PATTERN_STRING 
				+ "'", 
				PATTERN_STRING, is(PATTERN_PARAMETER));
	}
	
	@Test
	public void RegexWrapper_overloaded_constructor_test()
	{
		final String PATTERN_PARAMETER = "\\w";
		final RegexWrapper RW = new RegexWrapper(PATTERN_PARAMETER);
		final int FLAG_RETURN = RW.get_m_flag();
        assertThat("Erreur, la méthode get_m_flag() a renvoyé: " + FLAG_RETURN, FLAG_RETURN, is(0));
	}

}
