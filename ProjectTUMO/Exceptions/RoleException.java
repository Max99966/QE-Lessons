package ProjectTUMO.Exceptions;


import ProjectTUMO.Model.Staff;

public class RoleException extends RuntimeException {
    @Override
    public String toString() {
        return "The role you requested is invalid, please try one of these: Coach, Manager, Developer, Content creator";
    }
}
