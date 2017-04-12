package nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
	public static void main(String args[]) throws IOException {
		String direccion="D:\\eclipse\\workspace\\VetarianPlay\\bin\\nio\\data.txt";
		File fichero=new File(direccion);
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        FileChannel inChannel = file.getChannel();
 
        ByteBuffer buf = ByteBuffer.allocate(48);
 
        int bytesRead;
 
        /**
         * 使用一个buffer循环读取一个file channel
         */
        while ((bytesRead = inChannel.read(buf)) != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();//切换读模式
 
            /**
             * 读取buffer
             */
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }
            System.out.println(" ");
            //Clears this buffer.  The position is set to zero, the limit is set to
            //the capacity, and the mark is discarded.
            buf.clear();
        }
        file.close();
    }
}
