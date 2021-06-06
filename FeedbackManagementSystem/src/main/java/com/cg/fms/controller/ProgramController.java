package com.cg.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entities.Program;
import com.cg.fms.service.ITrainingProgramService;

@RestController
@RequestMapping("Fms/api")
@CrossOrigin(origins="*")
public class ProgramController {

	@Autowired
	ITrainingProgramService itp;

	@PostMapping("/ProgramAdd")
	public Program createProgram(@RequestBody Program p) {
		return itp.createProgram(p);
	}

	@GetMapping("/ProgramView")
	public Program viewProgram(int id) {
		return itp.viewProgram(id);
	}
	
	@PutMapping("/ProgramUp")
	public Program editProgram(@RequestBody Program p)
	{
		return itp.updateProgram(p);
	}

	@DeleteMapping("/ProgramRem")
	public Program deleteProgram(int id) {
		return itp.removeProgram(id);
	}

	@GetMapping("/ProgramFac")
	public Program findProgramByFaculty(int empId) {
		return itp.viewAllProgramsByFaculty(empId);
	}
	
	@GetMapping("/ProgramAll")
	public List<Program> allPrograms() {
		return itp.viewAllPrograms();
	}
	
}
