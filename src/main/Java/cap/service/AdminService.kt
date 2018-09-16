package main.Java.cap.service

import cap.model.Admin;
import cap.util.PageBean;

interface AdminService {
    fun login(admin: Admin): Admin

    fun findByPage(pageNo: Int, pageSize: Int): PageBean
}