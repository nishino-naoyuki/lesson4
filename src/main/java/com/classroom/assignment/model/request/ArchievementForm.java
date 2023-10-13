package com.classroom.assignment.model.request;

import javax.validation.constraints.NotEmpty;

public class ArchievementForm {
  private int id;

  @NotEmpty(message = "入力してください")
  private String name;

  private String memo;

  public ArchievementForm() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
