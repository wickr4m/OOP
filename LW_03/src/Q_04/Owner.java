package Q_04;

public class Owner {

    private String ownerName, phoneNo;

    public Owner (String name, String tel){
        this.ownerName = name;
        this.phoneNo = tel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
