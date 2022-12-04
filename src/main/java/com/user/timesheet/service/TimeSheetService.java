package com.user.timesheet.service;

import java.util.List;

import com.user.timesheet.entity.TimeSheet;

public interface TimeSheetService {

	List<TimeSheet> getTimeSheets();
	TimeSheet addTimeSheet();
}
