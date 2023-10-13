package com.classroom.assignment.service;

import java.util.List;
import com.classroom.assignment.repository.ArchievementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.classroom.assignment.entity.Archievement;
import com.classroom.assignment.exception.NotDeleteException;
import com.classroom.assignment.exception.NotInsertException;
import com.classroom.assignment.exception.NotUpdateException;

@Service
public class ArchievementServiceImpl implements ArchievementService {

  private final ArchievementDao dao;

  @Autowired
  public ArchievementServiceImpl(ArchievementDao dao) {
    this.dao = dao;
  }

  @Override
  public List<Archievement> selectAll() {
    List<Archievement> list = dao.selectAll();
    return list;
  }

  @Override
  public Archievement findArchievement(int id) {
    return dao.findById(id);
  }

  @Override
  public void insertArchievement(Archievement archievement) {
    int result = dao.insertArchievement(archievement);
    if (result == 0) {
      throw new NotInsertException();
    }
  }

  @Override
  public void updateArchievement(Archievement archievement) {
    int result = dao.updateArchievement(archievement);
    if (result == 0) {
      throw new NotUpdateException();
    }
  }

  @Override
  public void delete(int id) {
    int result = dao.deleteArchievement(id);
    if (result == 0) {
      throw new NotDeleteException();
    }
  }

}
