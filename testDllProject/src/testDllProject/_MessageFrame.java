package testDllProject;
import com.ochafik.lang.jnaerator.runtime.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * --------------------- \u0421\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u0430 \u043e\u0434\u043d\u043e\u0439 \u0437\u0430\u043f\u0438\u0441\u0438 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0439 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043d\u043e\u0439 \u043e\u0442 \u0434\u0435\u043a\u043e\u0434\u0435\u0440\u0430 \u0432 \u043f\u043e\u0442\u043e\u043a\u043e\u0432\u043e\u043c \u0440\u0435\u0436\u0438\u043c\u0435<br>
 * <i>native declaration : line 120</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _MessageFrame extends Structure<_MessageFrame, _MessageFrame.ByValue, _MessageFrame.ByReference > {
	public double Vrema;
	/** \u041a\u043e\u0434 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f */
	public byte MessageCode;
	public _MessageFrame() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Vrema", "MessageCode");
	}
	/** @param MessageCode \u041a\u043e\u0434 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f */
	public _MessageFrame(double Vrema, byte MessageCode) {
		super();
		this.Vrema = Vrema;
		this.MessageCode = MessageCode;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected _MessageFrame newInstance() { return new _MessageFrame(); }
	public static _MessageFrame[] newArray(int arrayLength) {
		return Structure.newArray(_MessageFrame.class, arrayLength);
	}
	public static class ByReference extends _MessageFrame implements Structure.ByReference {
		
	};
	public static class ByValue extends _MessageFrame implements Structure.ByValue {
		
	};
}
