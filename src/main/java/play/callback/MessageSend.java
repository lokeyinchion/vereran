package play.callback;

public class MessageSend implements CallBack,Runnable{    
    
   private Remote remote;    
       
   /**  
    * ���ͳ�ȥ����Ϣ  
    */    
   private String message;    
       
   public MessageSend(Remote remote, String message) {    
       super();    
       this.remote = remote;    
       this.message = message;    
   }    
   
   /**  
    * ������Ϣ  
    */    
   public void sendMessage()    
   {    
       /**��ǰ�̵߳�����**/    
       System.out.println(Thread.currentThread().getName());    
       /**����һ���µ��̷߳�����Ϣ**/    
       Thread thread = new Thread(this);    
       thread.start();    
       /**��ǰ�̼߳���ִ��**/    
       System.out.println("Message has been sent by Local to remote~!");  
   }    
   
   /**  
    * ������Ϣ��Ļص�����  
    */    
   public void execute(Object... objects ) {    
       /**��ӡ���ص���Ϣ**/    
       System.out.println(objects[0]);    
       /**��ӡ������Ϣ���߳�����**/    
       System.out.println(Thread.currentThread().getName());
       System.out.println("Local get it~!"); 
       /**�жϷ�����Ϣ���߳�**/    
       Thread.interrupted();    
   }    
       
   public static void main(String[] args)    
   {    
	   MessageSend local = new MessageSend(new Remote(),"Hello");    
           
       local.sendMessage();    
   }    
   
   public void run() {  
	   //���൱�ڸ�ͬѧ��绰������绰֮������߳̾Ϳ���ȥ�����������ˣ�ֻ�����ȵ����ͬѧ��ص绰�����ʱ����Ҫ������Ӧ  
	   System.out.println(Thread.currentThread().getName());
       remote.executeMessage(message, this);  
       System.out.println("asdfasdfasdfasdf");
   }    
}    
