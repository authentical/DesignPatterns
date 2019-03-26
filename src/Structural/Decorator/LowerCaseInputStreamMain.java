package Structural.Decorator;


import java.io.*;

class LowerCaseInputStream extends FilterInputStream{


    public LowerCaseInputStream(InputStream in){

        super(in);
    }

    public int read() throws IOException{

        int c = in.read();
        return (c==-1 ? c: Character.toLowerCase(c));
    }


    public int read(byte[] b, int offset, int len) throws IOException{

        int result = in.read(b, offset, len);

        for(int i=0;i<offset + result;i++){

            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }

        return result;
    }
}
















public class LowerCaseInputStreamMain {


    public static void main(String[] args) throws FileNotFoundException , IOException {
        int c;


        StringBuffer stringBuffer = new StringBuffer("-Ideal: Can't modify existing functionality but can extend it" +
                "-Useful for adding specific functionalities to a specific object" +
                "as opposed to the whole class.");
        byte[] bytes = stringBuffer.toString().getBytes();

        InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));

        while((c=in.read()) >=0){
            System.out.print((char) c);
        }

        in.close();
    }
}
