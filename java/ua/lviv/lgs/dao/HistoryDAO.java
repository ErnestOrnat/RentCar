package ua.lviv.lgs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.History;
@Repository
public interface HistoryDAO extends CrudRepository<History, Integer>{

}
