package cinema.dao;

import cinema.model.Role;
import cinema.model.RoleName;

public interface RoleDao {
    Role add(Role role);

    Role getRoleByName(RoleName name);
}
