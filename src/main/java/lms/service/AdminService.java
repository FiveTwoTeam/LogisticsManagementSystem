package lms.service;

import lms.model.LmsAdmin;
import lms.model.QueryExample;

import java.util.List;

public interface AdminService {
    List<LmsAdmin>  findAll(QueryExample qe);
    LmsAdmin  login(String username, String password);
    void deleteAdmin(Long id);
    void addAdmin(LmsAdmin lmsAdmin);

    LmsAdmin findById(long id);
    void updateAdmin(LmsAdmin admin);
}
