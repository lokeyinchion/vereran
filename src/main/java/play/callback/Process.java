package play.callback;

public class Process {
	public <T> T process(String command, ProcessCallback<T> processor) {
        System.out.println("process start!");
        //
        //��������Щ������ʼ������
        //
        T t = null;
        if (command.equals("create user")) {
            t = processor.porcess(command); //�ڻص��ӿ��н��н�һ������
 
        }
        return t;
    }
 
    public static void main(String args[]) {
 
        //����
        String command = "create user";
        //�����ҵ������һ���ص��ӿ�
        //����ص��ӿ��Ǹ���������ģ�����ʵ�ֶ�������Ĵ���
        ProcessCallback<User> exec = new ProcessCallback<User>() {
            @Override
            public User porcess(String command) {
                System.out.println("���յ�����=" + command);
                User user = new User();
                user.setName("lkyx");
                user.setAccount("sdsdsd");
                return user;
            }
        };
        Process p = new Process();
        User user = p.process(command, exec);
        System.out.println(user.getName());
    }
}
