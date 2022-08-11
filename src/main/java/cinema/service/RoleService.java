package cinema.service;

import cinema.model.Role;
import cinema.model.RoleName;

public interface RoleService {
    Role save(Role role);

    Role getRoleByName(RoleName name);
}
