package demo;
import java.io.File;

public class DeleteFileDemo {
    public static void main(String args[]) {
        // 这里修改为自己的测试目录
        File folder = new File("tmp/user/");
        deleteFolder(folder);
    }
 
    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    System.out.println("删除文件：" + f.getName());
                    f.delete();
                }
            }
        }
        folder.delete();
        System.out.println("删除文件夹：" + folder.getName());
    }
}
