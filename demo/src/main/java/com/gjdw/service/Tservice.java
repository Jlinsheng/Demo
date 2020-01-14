package com.gjdw.service;

import com.gjdw.pojo.ScProject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface Tservice {

    /**
     * 人员信息删除
     */
    public void getDeleteByPerson(String personId);

    /**
     * 专利信息删除
     */
    public void getDeleteByPatent(String patentId);

    /**
     * 软著信息删除
     */
    public void getDeleteBySoft(String softId);

    /**
     * 论文信息删除
     */
    public void getDeleteByPaper(String paperId);

    /**
     * 获奖信息删除
     */
    public void getDeleteByPrize(String prizeId);

    /**
     * 基本信息录入
     */
    public void getAddByProject(ScProject scProject, MultipartFile file);

    /**
     * 成果信息录入
     */
    public void getAddByFinancing();

    /**
     * 融资信息录入
     */
    public void getAddByAchievement();

}
