package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.PatientEntity;

public interface PatientDao {
	public void addPatientDetails(PatientEntity pat);
	public void updatePatientDetails(PatientEntity pat);
	public void deletePatientDetails(Integer pId);
	public PatientEntity getOnePatient(Integer pId);
	public List<PatientEntity> getAllPatient();
}
