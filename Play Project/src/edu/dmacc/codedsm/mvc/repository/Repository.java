package edu.dmacc.codedsm.mvc.repository;

import edu.dmacc.codedsm.mvc.PayrollData;
import edu.dmacc.codedsm.mvc.service.PayrollService;

public interface Repository{
    void save ( PayrollData data );
}
