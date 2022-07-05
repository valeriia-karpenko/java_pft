package ru.stqa.ptf.addressbook;

public class ContactData {
  private final String name;
  private final String middle_name;
  private final String last_name;
  private final String nickname;
  private final String address;
  private final String mobile;
  private final String email;

  public ContactData(String name, String middle_name, String last_name, String nickname, String address, String mobile, String email) {
    this.name = name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.nickname = nickname;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
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
}
