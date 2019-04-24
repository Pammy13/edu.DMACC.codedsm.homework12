package edu.dmacc.codedsm.mvc.service;

import edu.dmacc.codedsm.mvc.PayrollData;
import edu.dmacc.codedsm.mvc.repository.Repository;

public class IowaPayrollService implements PayrollService {
    private Repository repository;
    public IowaPayrollService (Repository repository) {

    }

    public IowaPayrollService() {

    }

    public void calculatePayroll ( PayrollData data) {
        System.out.println("date = {" + data + "}");
        repository.save(data);


    }
}
