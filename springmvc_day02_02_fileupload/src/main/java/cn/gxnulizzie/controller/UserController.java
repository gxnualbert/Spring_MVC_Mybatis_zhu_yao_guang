package cn.gxnulizzie.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @auther gxnulizzie
 * @create 2019-08-05-17:36
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 文件上传
     */
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request) throws Exception {
        System.out.println("文件上传");

//        使用fileupload 组件完成文件上传
//        上传位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        判断，该路径是否存在，如果路径不存在，就新建路劲
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("开始创建你目录");
            System.out.println(path);
            file.mkdirs();
        }
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        //解析request
        List<FileItem> items = upload.parseRequest(request);
//        items中不全部都是文件对象，所以我们需要遍历，然后再做判断
        for (FileItem item:items){
//            对item做判断，如果是文件项，则做文件上传相关动作，否则，就什么都不做
            if (item.isFormField()){
                System.out.println("普通表单项，不是文件项，不做处理"+item);
            }
            else {
                String filename=item.getName();//获取上传文件的名称
//                给文件的名称设置一个唯一值 uuid追加
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename=uuid+"_"+filename;
                item.write(new File(path,filename));//完成文件上传
                item.delete();//删除临时文件
            }
        }

        return "success";
    }

    /**
     * Spring MVC 方式文件上传
     */
    @RequestMapping("/fileupload2")
    public String fileupload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("Spring MVC方式 文件上传");

//        使用fileupload 组件完成文件上传
//        上传位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        判断，该路径是否存在，如果路径不存在，就新建路劲
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("开始创建你目录");
            System.out.println(path);
            file.mkdirs();
        }

        String filename=upload.getOriginalFilename();// 使用spring MVC的方式，获取文件名
//                给文件的名称设置一个唯一值 uuid追加
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(path,filename)); //完成文件上传
        return "success";
    }

    /**
     * 跨文件服务器方式文件上传
     */
    @RequestMapping("/fileupload3")
    public String fileupload3( MultipartFile upload) throws Exception {
        System.out.println("S跨文件服务器方式 文件上传");

//        确定在文件服务器中，哪个文件夹是用来存放图片的
        String path="http://localhost:9090/springmvc_day02_03_fileupload_server_war/uploads/";
//            在跑起来之前，要手动在目录D:\soft\apache-tomcat-8.5.31\webapps\springmvc_day02_03_fileupload_server_war\下新建一个文件夹爱uploads
        String filename=upload.getOriginalFilename();// 使用spring MVC的方式，获取文件名
//                给文件的名称设置一个唯一值 uuid追加
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename=uuid+"_"+filename;

//        创建客户端对象
        Client client=Client.create();
//        upload.transferTo(new File(path,filename)); //完成文件上传
//        和图片服务器进行连接
        WebResource webResource=client.resource(path+filename);
        System.out.println(path+filename);
//        上传图片
        webResource.put(upload.getBytes());
        System.out.println("已经走完 跨服务器客户端");
        return "success";
    }
}
