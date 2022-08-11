package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.model.RoleName;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role save(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getRoleByName(RoleName name) {
        return roleDao.getRoleByName(name);
    }
}
