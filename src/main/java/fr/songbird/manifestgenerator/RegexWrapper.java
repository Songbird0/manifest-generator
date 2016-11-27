/**
 * 
 */
package fr.songbird.manifestgenerator;

import java.util.regex.Pattern;

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
	private String m_pattern;
	/**
	 * Attribut contenant le ou les flags passés en paramètre.
	 * <p>
	 * Par défaut, la valeur est nulle. (== 0)
	 */
	private int m_flag;
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
	 * @param PATTERN Votre chaîne de caractères.
	 * @param FLAG La somme des flags assignés à la regex.
	 */
	public RegexWrapper(final String PATTERN, final int FLAG) 
	{
		assert(PATTERN != null) : "pattern binding is null, abort the mission, chief !";
		assert(!PATTERN.isEmpty()) : "pattern string is null, abort the mission, chief !";
//		Pourquoi utiliser ce wrapper avec une chaîne de caractères vide ?
		assert(FLAG >= 0) : "flag value isn't positive, abord the mission, chief !";
		m_pattern = PATTERN;
		m_flag = FLAG;
		m_regex = Pattern.compile(m_pattern, m_flag);
	}

	/**
	 * Version surchargée du constructeur d'origine qui permet de faire abstraction du flag,
	 * devant être obligatoirement renseigné, initialement.
	 * @param PATTERN
	 * @see RegexWrapper#RegexWrapper(String, int)
	 */
	public RegexWrapper(final String PATTERN) {
		new RegexWrapper(PATTERN, 0);
	}

	/**
	 * 
	 * @return La valeur bindée à l'attribut {@code m_regex}.
	 * @see RegexWrapper#m_regex m_regex
	 */
	public Pattern get_m_regex() {
		return m_regex;
	}

	/**
	 * 
	 * @return La valeur bindée à l'attribut {@code m_flag}.
	 * @see RegexWrapper#m_flag m_flag
	 */
	public int get_m_flag() {
		return m_flag;
	}
	

}
