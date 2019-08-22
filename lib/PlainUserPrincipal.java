
import java.security.Principal;

public class PlainUserPrincipal implements Principal {

    String userName;

    public PlainUserPrincipal(String name) {
        this.userName = name;
    }
    public String getName() {
        return this.userName;
    }

    public String toString() {
        return ("UserPrincipal: " + this.userName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlainUserPrincipal) {
            PlainUserPrincipal other = (PlainUserPrincipal) obj;
            return this.userName.equals(other.userName);
        }
        return false;
    }

    public int hashCode() {
        return this.userName.hashCode();
    }
}
