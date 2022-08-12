package ru.stqa.ptf.addressbook.model;

import java.io.File;

public class ContactData {

  private int id = Integer.MAX_VALUE;
  private String name;
  private String middle_name;
  private String last_name;
  private String nickname;
  private String address;
  private String mobile;
  private String home;
  private String work;
  private String phone2;
  private String email1;
  private String email2;
  private String email3;

  private String allEmail;
  private String allPhones;
  private File photo;

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }
//  private String group;

  public int getId() { return id; }

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

  public String getHomePhone() {
    return home;
  }
  public String getWorkPhone() {
    return work;
  }
  public String getMobilePhone() {
    return mobile;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getEmail1() {
    return email1;
  }
  public String getEmail2() {
    return email2;
  }
  public String getEmail3() {
    return email3;
  }
  public String getAllEmail() {
    return allEmail;
  }


  public String getAllPhones() {
    return allPhones;
  }


  //  public String getGroup() {
//    return group;
//  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withName(String name) {
    this.name = name;
    return this;
  }

  public ContactData withMiddle_name(String middle_name) {
    this.middle_name = middle_name;
    return this;
  }

  public ContactData withLast_name(String last_name) {
    this.last_name = last_name;
    return this;
  }

  public ContactData withNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withMobilePhone(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public ContactData withHomePhone(String home) {
    this.home = home;
    return this;
  }
  public ContactData withWorkPhone(String work) {
    this.work = work;
    return this;
  }

  public ContactData withPhone2(String phone2) {
    this.work = work;
    return this;
  }

  public ContactData withEmail1(String email) {
    this.email1 = email;
    return this;
  }

  public ContactData withEmail2(String email2) {
    this.email2 = email2;
    return this;
  }

  public ContactData withEmail3(String email3) {
    this.email3 = email3;
    return this;
  }

  public ContactData withAllEmail(String allEmail) {
    this.allEmail = allEmail;
    return this;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return last_name != null ? last_name.equals(that.last_name) : that.last_name == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
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
