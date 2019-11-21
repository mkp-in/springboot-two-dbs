package in.mkp.db.sprintbootdb.entity;

public class UserEntity {

    private String userName;

    private String email;

    private String lastLogin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.userName).append(", ")
                .append(this.email).append(", ")
                .append(this.lastLogin);

        return stringBuffer.toString();

    }
}
