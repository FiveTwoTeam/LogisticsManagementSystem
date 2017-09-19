package lms.service;

import lms.model.LmsAdmin;
import lms.model.QueryExample;

import java.util.List;

public interface AdminService {
    List<LmsAdmin>  findAll(QueryExample qe);
    LmsAdmin  login(String username, String password);
}
