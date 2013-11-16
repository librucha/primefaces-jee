package cz.librucha.show.primefaces;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;
import java.util.Locale;

/**
 * Created by librucha on 11/16/13.
 */
@Named
public class LocaleConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return new Locale(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Locale) {
			Locale locale = (Locale) value;
			return locale.getLanguage();
		}
		return value.toString();
	}
}
