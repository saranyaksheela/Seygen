package com.user.timesheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.user.timesheet.service.TimeSheetService;

@Controller
public class TimeSheetController {

    private final TimeSheetService timeSheetService;

    public TimeSheetController(TimeSheetService timeSheetService) {
        this.timeSheetService = timeSheetService;
    }

    @RequestMapping(value = "/timesheet", method = RequestMethod.GET)
    public String viewTimeSheets(Model model) {
        model.addAttribute("timesheets", timeSheetService.getTimeSheets());
        return "view-timesheets";
    }
}
