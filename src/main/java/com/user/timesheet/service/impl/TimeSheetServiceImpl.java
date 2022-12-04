package com.user.timesheet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.timesheet.entity.TimeSheet;
import com.user.timesheet.repository.TimeSheetRepository;
import com.user.timesheet.service.TimeSheetService;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

	@Autowired
    TimeSheetRepository timeSheetRepository;

	@Override
	public List<TimeSheet> getTimeSheets() {
//		System.out.println("Timesheets!!!!");
//		timeSheetRepository.findAll().forEach(obj -> System.out.println(obj.toString()));
		return timeSheetRepository.findAll();
	}

	@Override
	public TimeSheet addTimeSheet() {
		// TODO Auto-generated method stub
		return null;
	}
}
