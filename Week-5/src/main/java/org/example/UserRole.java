package org.example;

import java.util.Arrays;

public enum UserRole {
    ADMIN("ADMIN",new String[]{"Write","Read","Delete"}),
    USER("USER",new String[]{"Read","Write"}),
    GUEST("GUEST",new String[]{"Read"});
    private String userRole;
    private String[] userPermissions;
    UserRole(String userRole, String[] permissions) {
        this.userPermissions=permissions;
        this.userRole=userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public String[] getUserPermissions() {
        return userPermissions;
    }

    public boolean hasPermission(String permission){
        if (permission==null) throw new IllegalArgumentException("permission cannot be null");
        for (String userPermission: userPermissions){
            if(userPermission.equals(permission)){
                return true;
            }
        }
        return false;
    }

    public void printPermission(){
        System.out.println(this.userRole + " has " + Arrays.toString(userPermissions));
    }
}
