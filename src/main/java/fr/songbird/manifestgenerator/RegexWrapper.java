/**
 * 
 */
package fr.songbird.manifestgenerator;

/**
 * Wrapper encapsulant les classes Pattern et Matcher.
 * @author songbird
 * @version 0.1.0
 * @since 27 nov. 2016
 * @see java.util.regex.Pattern Pattern
 * @see java.util.regex.Matcher Matcher
 * 
 */
public class RegexWrapper {

	private final String m_pattern;
	/**
	 * La classe RegexWrapper ne possède qu'un seul constructeur muni d'un seul paramètre.
	 * <p>
	 * Vous pouvez lui passer en paramètre la chaîne de caractères que vous souhaitez faire compiler à votre automate.
	 * <p>
	 * Une fois passé en paramètre, {@code pattern} sera utilisé pour instancier un objet de la classe Pattern, 
	 * puis compilé par un objet Matcher.
	 * @param pattern Votre chaîne de caractères.
	 */
	public RegexWrapper(final String pattern) 
	{
		assert(pattern != null) : "pattern binding is null, abort the mission, chief !";
		assert(!pattern.isEmpty()) : "pattern string is null, abort the mission, chief !";
//		Pourquoi utiliser ce wrapper avec une chaîne de caractères vide ?
		m_pattern = pattern;
	}

}
