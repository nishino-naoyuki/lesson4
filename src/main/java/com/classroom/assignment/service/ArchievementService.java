package com.classroom.assignment.service;

import com.classroom.assignment.entity.Archievement;
import java.util.List;

public interface ArchievementService {

  List<Archievement> selectAll();

  Archievement findArchievement(int id);

  void insertArchievement(Archievement archievement);

  void updateArchievement(Archievement archievement);

  void delete(int deleteId);

}
