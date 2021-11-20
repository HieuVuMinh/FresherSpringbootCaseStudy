package com.onemount.springboot2casestudy.service.role;


import com.onemount.springboot2casestudy.model.Role;
import com.onemount.springboot2casestudy.service.GeneralService;

public interface RoleService extends GeneralService<Role> {
    Role findByName(String name);
}
