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
public final class RegexWrapper {

	/**
	 * Attribut contenant la chaîne de caractères passée en paramètre.
	 */
	private final String m_pattern;
	/**
	 * Attribut contenant le ou les flags passés en paramètre.
	 * <p>
	 * Par défaut, la valeur est nulle. (== 0)
	 */
	private final int m_flag;
	/**
	 * Attribut contenant l'instance de la classe Pattern,
	 * obtenue en compilant la chaîne de caractères.
	 * @see RegexWrapper#m_pattern m_pattern
	 */
	private java.util.regex.Pattern m_regex = null;
	
	/**
	 * La classe RegexWrapper ne possède qu'un seul constructeur muni de deux paramètres.
	 * <p>
	 * Vous pouvez lui passer en paramètre la chaîne de caractères que vous souhaitez faire compiler à votre automate.
	 * <p>
	 * Une fois passé en paramètre, {@code pattern} sera utilisé pour instancier un objet de la classe Pattern, 
	 * puis compilé par un objet Matcher.
	 * @param pattern Votre chaîne de caractères.
	 */
	public RegexWrapper(final String pattern, final int flag) 
	{
		assert(pattern != null) : "pattern binding is null, abort the mission, chief !";
		assert(!pattern.isEmpty()) : "pattern string is null, abort the mission, chief !";
//		Pourquoi utiliser ce wrapper avec une chaîne de caractères vide ?
		assert(flag > 0) : "flag value isn't positive, abord the mission, chief !";
		m_pattern = pattern;
		m_flag = flag;
	}
	

}
