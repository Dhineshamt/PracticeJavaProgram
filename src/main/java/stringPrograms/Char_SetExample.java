package stringPrograms;  
  
import java.nio.ByteBuffer;  
import java.nio.CharBuffer;  
import java.nio.charset.Charset;  
public class Char_SetExample {  
public static void main(String[] args) {  
    Charset cs=Charset.forName("UTF-8");  
    System.out.println(cs.displayName());  
    System.out.println(cs.canEncode());  
    String st= "Welcome to javaTpoint, it is Charset test Example.";  
//The conversion of byte buffer from given charset to char buffer in unicode  
     ByteBuffer bytebuffer = ByteBuffer.wrap(st.getBytes());  
     CharBuffer charbuffer = cs.decode(bytebuffer);  
//The converesion of char buffer from unicode to byte buffer in given charset  
     ByteBuffer newbytebuffer= cs.encode(charbuffer);  
     while(newbytebuffer.hasRemaining()){  
     char ca = (char) newbytebuffer.get();  
     System.out.print(ca);  
         }  
    newbytebuffer.clear();
    
    byte[] b_arr = {71, 101, 101, 107, 115};
    Charset cs1 = Charset.defaultCharset();
    String s_byte_char = new String(b_arr, cs1);
    System.out.println(s_byte_char);
    }  
}  