package com.user.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.timesheet.entity.TimeSheet;

@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long>{

}
