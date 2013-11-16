package cz.librucha.show.primefaces;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

/**
 * Created by librucha on 11/16/13.
 */
@Named
@Stateful
@SessionScoped
public class LanguageSwitcherBean implements Serializable {

	private Locale selectedLanguage;
	private Set<Locale> languages = new HashSet<>();

	@PostConstruct
	public void init() {
		FacesContext ctx = FacesContext.getCurrentInstance();
		Iterator<Locale> supportedLocales = ctx.getApplication().getSupportedLocales();
		while (supportedLocales.hasNext()) {
			Locale locale = supportedLocales.next();
			languages.add(locale);
		}
		selectedLanguage = ctx.getViewRoot().getLocale();
	}

	public void selectLanguage() {
		FacesContext.getCurrentInstance().getViewRoot().setLocale(selectedLanguage);
	}

	public Locale getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(Locale selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public Set<Locale> getLanguages() {
		return languages;
	}
}
