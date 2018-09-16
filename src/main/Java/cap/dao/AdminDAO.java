package main.Java.cap.dao;

import java.util.List;



public class AdminDAO {
    Admin login(Admin admin);

    List<Admin> findByPage(int pageNo, int pageSize);

    int getTotalCount();
}
