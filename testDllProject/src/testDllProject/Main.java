package testDllProject;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.concurrent.TimeUnit;

import com.ochafik.lang.AssertUtils.Test;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.UCHAR;

import com.sun.jna.platform.win32.WinDef.UINT;
import com.sun.jna.platform.win32.WinDef.ULONGLONG;
import com.sun.jna.platform.win32.WinDef.USHORT;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.win32.StdCallLibrary;
import java.nio.ByteBuffer;

import testDllProject.T_45.DATA_HANDLER;
import testDllProject.T_45.HMODULE;
import testDllProject.T_45.LPCSTR;





public class Main {


	
	/*
	 * struct _SpecialParametrs {
		  DWORD FilterType;                   // Тип фильтра
		  float Popravka[MAX_SENSOR_NUMBER];  // Поправка основной изм. величины
		  DWORD SpeedMeasurementPeriod;       // Период измерения частоты вращения 
		  unsigned short int AveragingFactor; // Коэффициент усреднения 
		  bool  VneshnDatchSkor;              // Есть внешний датчик скорости
		  bool  ServerMode;                   // Режим сервера 
		  int   OwnServerBasePortNumber;      // Собственный базовый номер порта
		  struct _ParamComPort *PParamComPort;// Параметры COM-порта 
		  char *ServerAddress;                // Адрес сервера
		  int   AnotherServerBasePortNumber;  // Номер базового порта другого сервера
		  UCHAR ServerChannelNumber;          // Номер канала сервера 
		  UCHAR ComPortNumber;                // Номер COM-порта 
		  UCHAR MODBUS_DeviceAddress;         // Номер устройства в сети MODBUS
		};
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	/*
	 * struct _ParamComPort {
		int BaudRate; // скорость передачи данных
		char BiteSize; // число битов данных
		char Parity; // схема контроля четности
		char StopBits; // число стоповых бит
		}
	 * */
	/*public interface TestLibrary extends StdCallLibrary  {
		TestLibrary INSTANCE = (TestLibrary)
				Native.load("VCDecoder", TestLibrary.class);
		
		//public Pointer Beep(int NKan,  byte DecoderType, Pointer DataHandler, Pointer PContext);
		
		public Pointer DecoderCreate(int NKan , UCHAR DecoderType, 
				   DATA_HANDLER DataHandler, Pointer PContext, SpecialParametrs PSpecialParametrs);  
		
		
		@FieldOrder({ "FilterType", "Popravka", "SpeedMeasurementPeriod", 
			          "AveragingFactor", "VneshnDatchSkor", "ServerMode", 
			          "OwnServerBasePortNumber", "PParamComPort", "ServerAddress", 
			          "ServerChannelNumber", "ComPortNumber", "MODBUS_DeviceAddress" })
		public class SpecialParametrs extends Structure {
		    public DWORD FilterType;                        // Тип фильтра                          
		    public FloatArraySix.ByValue Popravka;          // Поправка основной изм. величины      
		    public DWORD SpeedMeasurementPeriod;            // Период измерения частоты вращения    
		    public USHORT AveragingFactor;                  // Коэффициент усреднения               
		    public byte VneshnDatchSkor;                    // Есть внешний датчик скорости         
		    public byte ServerMode;                         // Режим сервера                        
		    public int OwnServerBasePortNumber;             // Собственный базовый номер порта      
		    public ParamComPort.ByReference PParamComPort;  // Параметры COM-порта                  
		    public ByteByReference ServerAddress;           // Адрес сервера                        
		    public int   AnotherServerBasePortNumber;       // Номер базового порта другого сервера 
		    public UCHAR ServerChannelNumber;               // Номер канала сервера    
		    public UCHAR ComPortNumber;                     // Номер COM-порта                         
		    public UCHAR MODBUS_DeviceAddress;              // Номер устройства в сети MODBUS            
		                                                        
		    public static class ByReference extends ParamComPort implements Structure.ByReference {
			};
		}
		
		
		public class FloatArraySix extends Structure {
			public float a0;
			public float a1;
			public float a2;
			public float a3;
			public float a4;
			public float a5;
			public static class ByReference extends ParamComPort implements Structure.ByReference {
			};
			
			public static class ByValue extends ParamComPort implements Structure.ByValue {
			};
		}
						
		@FieldOrder({ "BaudRate", "BiteSize", "Parity", "StopBits"})
		public class ParamComPort extends Structure{
			public int  BaudRate;
			public byte  BiteSize;
			public byte  Parity;
			public byte  StopBits;
			
		    public static class ByReference extends ParamComPort implements Structure.ByReference {
		    };

		    public static class ByValue extends ParamComPort implements Structure.ByValue {
		    };
		} 
		
		public interface DATA_HANDLER extends StdCallCallback {
			int callback(int DataType, Pointer Zapis, Pointer PContext);
		}
		
	}*/
	
	
	
	public static void main(String[] args) {

		
		T_45.DATA_HANDLER handler = new T_45.DATA_HANDLER() {
			
			@Override
			public int apply(int DataType, Pointer Zapis, Pointer PContext) {
				System.out.println("ds");
				return 0;
			}
		};
		
		_SpecialParametrs params = new _SpecialParametrs();
		params.AveragingFactor = 1;
		params.SpeedMeasurementPeriod = 1000;
		Pointer ptr = null;
		System.out.println(ptr);
		 ptr = T_45.INSTANCE.DecoderCreate(1, (byte)T_45.USB_DECODER_T45, handler , null, params);
		int status = T_45.INSTANCE.DecoderOpen(ptr, (byte)0);
		System.out.println(status);
		
			System.out.println(status);

		 
		System.out.println(ptr.toString());
		if(status == 0)
		{		
			System.out.println("Decoder Open OK!");
		}
		else
		{
			System.out.println("Error Decoder Open. Error Code: " + status);
		}
		
		ByteBuffer byteBuffer_1 = ByteBuffer.allocate(16);
		IntBuffer intBuffer_1 = IntBuffer.allocate(16);
		T_45.INSTANCE.DecoderReadTemperature(ptr, byteBuffer_1, intBuffer_1);
		System.out.println("DecoderReadTemperature status " + status);
		System.out.println("Bytes read:" + intBuffer_1.toString());	
		System.out.println("Time: " + byteBuffer_1.order(ByteOrder.LITTLE_ENDIAN).getLong(0));
		System.out.println("Temp: " + byteBuffer_1.order(ByteOrder.LITTLE_ENDIAN).getFloat(8));
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(16);
		IntBuffer intBuffer = IntBuffer.allocate(16);
		while(true)
		{
		status =  T_45.INSTANCE.DecoderReadSpeed(ptr, byteBuffer, intBuffer);
		long time = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong(0);
		
		System.out.println("DecoderReadSpeed status " + status);
		System.out.println("Bytes read:" + intBuffer.toString());		
		System.out.println("Time: " + time);
		System.out.println("Power: " + byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getFloat(8) + "; Speed: " + byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getFloat(12));
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}

}
