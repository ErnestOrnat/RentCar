package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Car;
import ua.lviv.lgs.model.History;

public interface HistoryService {

	public void deleteHistory(History history);
	public Iterable<History> getAllHistory();
}
