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

    public LmsAdmin login(String username, String password) {
        LmsAdminExample example = new LmsAdminExample();

        LmsAdminExample.Criteria criteria =example.createCriteria();
        criteria.andUsernameEqualTo("admin");
        criteria.andPasswordEqualTo(password);

        List<LmsAdmin> list = lmsAdminMapper.selectByExample(example);
        if(list != null && list.size() > 0)
            return list.get(0);

        return null;
    }

    public void deleteAdmin(Long id) {

        lmsAdminMapper.deleteByPrimaryKey(id);
    }

    public void addAdmin(LmsAdmin lmsAdmin) {

        lmsAdminMapper.insert(lmsAdmin);
    }


    public LmsAdmin findById(long id) {
        return lmsAdminMapper.selectByPrimaryKey(id);
    }

    public void updateAdmin(LmsAdmin admin) {
        lmsAdminMapper.updateByPrimaryKey(admin);
    }
}
