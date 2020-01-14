package com.gjdw.serviceimpl;

import com.gjdw.mapperDao.Tdao;
import com.gjdw.pojo.ScProject;
import com.gjdw.service.Tservice;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class TserviceImpl implements Tservice {

    private static final long SIZE = 524288;

    @Resource
    Tdao mapper;

    /**
     * 多个附件上传接口
     * 返回:IP，端口，请求路径，文件名
     */
//    @RequestMapping(value = "/filesUpload", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
//    public String filesUpload(@RequestParam("file") MultipartFile[] files) {
//        String path = "s"+"\\";
//        ArrayList<HashMap> dataList = new ArrayList<>();
//        if (files != null && files.length > 0) {
//            for (MultipartFile file : files) {
//                HashMap<String, String> map = new HashMap();
//                if (!file.isEmpty()) {
//                    try {
//                        File filePath = new File(path);
//                        if (!filePath.exists())
//                            filePath.mkdirs();
//                        // 文件保存路径
//                        map.put("ServerIP", nginxPictureServerIP);
//                        map.put("ServerPort", nginxPictureServerPort);
//                        map.put("ServerPath", nginxPicturePath);
//                        map.put("fileName", System.currentTimeMillis() + file.getOriginalFilename());
//                        // 转存文件(填写的是文件上传到服务器的路径+文件名)
//                        file.transferTo(new File(path + System.currentTimeMillis() + file.getOriginalFilename()));
//                        dataList.add(map);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//        return JSON.toJSONString(new JsonResult(dataList));
//    }

    @Override
    public void getDeleteByPerson(String personId) {
        mapper.getDeleteByPerson(personId);
    }

    @Override
    public void getDeleteByPatent(String patentId) {
        mapper.getDeleteByPatent(patentId);
    }

    @Override
    public void getDeleteBySoft(String softId) {
        mapper.getDeleteBySoft(softId);
    }

    @Override
    public void getDeleteByPaper(String paperId) {
        mapper.getDeleteByPaper(paperId);
    }

    @Override
    public void getDeleteByPrize(String prizeId) {
        mapper.getDeleteByPrize(prizeId);
    }

    @Override
    public void getAddByProject(ScProject scProject,MultipartFile file) {
        if(scProject != null){
            String projectName = scProject.getProjectName().length() > 50?"超过最大限制":scProject.getProjectName();

            String fileName =  file.getOriginalFilename();

            fileName.indexOf(".");

        }
        mapper.getAddByProject(scProject);
    }

    @Override
    public void getAddByFinancing() {

    }

    @Override
    public void getAddByAchievement() {

    }
}
