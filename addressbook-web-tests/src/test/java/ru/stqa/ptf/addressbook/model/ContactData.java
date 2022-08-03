package ru.stqa.ptf.addressbook.model;

public class ContactData {

  private int id;
  private final String name;
  private final String middle_name;
  private final String last_name;
  private final String nickname;
  private final String address;
  private final String mobile;
  private final String email;
//  private String group;

  public ContactData(int id,String name, String middle_name, String last_name, String nickname,
                     String address, String mobile, String email) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.nickname = nickname;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
//    this.group = group;
  }

  public ContactData(String name, String middle_name, String last_name, String nickname,
                     String address, String mobile, String email) {
    this.id = 0;
    this.name = name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.nickname = nickname;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
//    this.group = group;
  }
  public String getName() {
    return name;
  }

  public String getMiddle_name() {
    return middle_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getNickname() {
    return nickname;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  //  public String getGroup() {
//    return group;
//  }
  public int getId() { return id; }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return last_name != null ? last_name.equals(that.last_name) : that.last_name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", last_name='" + last_name + '\'' +
            '}';
  }

}
