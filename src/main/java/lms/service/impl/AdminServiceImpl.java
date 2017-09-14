package lms.service.impl;

import lms.mapper.LmsAdminMapper;
import lms.model.LmsAdmin;
import lms.model.LmsAdminExample;
import lms.model.QueryExample;
import lms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private LmsAdminMapper lmsAdminMapper;
    public List<LmsAdmin> findAll(QueryExample qe) {
        LmsAdminExample example =null;

        if(qe!=null){
            example = new LmsAdminExample();
            LmsAdminExample.Criteria criteria = example.createCriteria();

            if(qe.getLmsAdmin()!= null){
                if(qe.getLmsAdmin().getUsername()!= null&& !"".equals(qe.getLmsAdmin().getUsername())){
                    criteria.andUsernameLike("%" + qe.getLmsAdmin().getUsername() + "%");

                }
            }
        }

        List<LmsAdmin> list = lmsAdminMapper.selectByExample(example);
        return list;
    }
}
