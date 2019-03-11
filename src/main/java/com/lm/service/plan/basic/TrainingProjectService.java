package com.lm.service.plan.basic;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TrainingProjectMapper;

import com.lm.model.plan.basic.Content;
import com.lm.model.plan.basic.Training;
import com.lm.util.Guid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by iii on 2019/2/25.
 */
@Service
@Transactional
public class TrainingProjectService {
    @Autowired
    TrainingProjectMapper trainingProjectMapper;
    public int save(Training training) {
        List<Content> contentList= new ArrayList<Content>();
        training.setId(Guid.get());
        for (int i = 0; i < training.getTrainingRequires().length; i++) {
            Content content=new Content();
            content.setContentId(Guid.get());
            content.setId(training.getId());
            content.setTrainingRequired(training.getTrainingRequires()[i]);
            //System.out.println(content.getTrainingRequired());
            contentList.add(content);
        }
        trainingProjectMapper.savecontent(contentList);
        return trainingProjectMapper.save(training);
    }

    public PageInfo<Map<String, String>> getList(String title, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, String>> list = trainingProjectMapper.getList(title);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);
        return pageInfo;
    }

    public int del(String id) {return trainingProjectMapper.del(id);}

    public Training searchid(String id){
        Training result = new Training();
        result = trainingProjectMapper.searchid(id);
        String [] transfer = new String[trainingProjectMapper.searchContentId(id).size()] ;
        for(int j=0;j<trainingProjectMapper.searchContentId(id).size();j++)
        {// System.out.println(trainingProjectMapper.searchContentId(id).get(j));
            transfer[j] = trainingProjectMapper.searchContentId(id).get(j);
        }
        result.setTrainingRequires(transfer);
        //System.out.println("college:"+result.getCollege()+"mission:"+result.getTrainingRequires()[0]);
        return result;
    }

    public int update(Training training) {
        trainingProjectMapper.delCatalog(training.getId());
        trainingProjectMapper.delContent(training.getId());
        training.setId(Guid.get());
        List<Content> updateContentList = new ArrayList<Content>();
        System.out.println("111"+training.getTrainingRequires().length);
        for (int i = 0; i < training.getTrainingRequires().length; i++) {
            Content updateContent = new Content();
            updateContent.setContentId(Guid.get());
            updateContent.setId(training.getId());
            updateContent.setTrainingRequired(training.getTrainingRequires()[i]);
            System.out.println("111"+updateContent.getTrainingRequired());
            updateContentList.add(updateContent);
        }
        trainingProjectMapper.updateContent(updateContentList);
        return trainingProjectMapper.update(training);
    }


}
