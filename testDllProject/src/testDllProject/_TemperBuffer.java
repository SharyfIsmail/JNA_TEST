package testDllProject;
import com.ochafik.lang.jnaerator.runtime.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * \u0411\u0443\u0444\u0435\u0440 \u0441 \u0442\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u043e\u0439<br>
 * <i>native declaration : line 2</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _TemperBuffer extends Structure<_TemperBuffer, _TemperBuffer.ByValue, _TemperBuffer.ByReference > {
	/** \u0422\u0435\u043a\u0443\u0449\u0435\u0435 \u0432\u0440\u0435\u043c\u044f \u0434\u0435\u043a\u043e\u0434\u0435\u0440\u0430 \u0432 \u0442\u0438\u043a\u0430\u0445 \u0442\u0430\u0439\u043c\u0435\u0440\u0430 - 8 \u0431\u0430\u0439\u0442 */
	public long TimeInt64;
	/** \u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 (\u0447\u0438\u0441\u043b\u043e \u0441 \u043f\u043b\u0430\u0432\u0430\u044e\u0449\u0435\u0439 \u0442\u043e\u0447\u043a\u043e\u0439) */
	public float Temper;
	public _TemperBuffer() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("TimeInt64", "Temper");
	}
	/**
	 * @param TimeInt64 \u0422\u0435\u043a\u0443\u0449\u0435\u0435 \u0432\u0440\u0435\u043c\u044f \u0434\u0435\u043a\u043e\u0434\u0435\u0440\u0430 \u0432 \u0442\u0438\u043a\u0430\u0445 \u0442\u0430\u0439\u043c\u0435\u0440\u0430 - 8 \u0431\u0430\u0439\u0442<br>
	 * @param Temper \u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 (\u0447\u0438\u0441\u043b\u043e \u0441 \u043f\u043b\u0430\u0432\u0430\u044e\u0449\u0435\u0439 \u0442\u043e\u0447\u043a\u043e\u0439)
	 */
	public _TemperBuffer(long TimeInt64, float Temper) {
		super();
		this.TimeInt64 = TimeInt64;
		this.Temper = Temper;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected _TemperBuffer newInstance() { return new _TemperBuffer(); }
	public static _TemperBuffer[] newArray(int arrayLength) {
		return Structure.newArray(_TemperBuffer.class, arrayLength);
	}
	public static class ByReference extends _TemperBuffer implements Structure.ByReference {
		
	};
	public static class ByValue extends _TemperBuffer implements Structure.ByValue {
		
	};
}