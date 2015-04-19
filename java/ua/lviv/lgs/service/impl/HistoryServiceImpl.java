package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.CarDAO;
import ua.lviv.lgs.dao.HistoryDAO;
import ua.lviv.lgs.model.History;
import ua.lviv.lgs.service.HistoryService;
@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryDAO dao;
	@Transactional
	public void deleteHistory(History history) {
		dao.delete(history);	
		
	}

	@Override
	public Iterable<History> getAllHistory() {

Iterable<History> findAll = dao.findAll();
		return findAll;
	}

}
