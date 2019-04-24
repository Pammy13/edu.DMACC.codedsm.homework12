package edu.dmacc.codedsm.mvc;

import edu.dmacc.codedsm.mvc.controller.HourlyPayrollController;
import edu.dmacc.codedsm.mvc.repository.ConsoleRepository1;
import edu.dmacc.codedsm.mvc.repository.Repository;
import edu.dmacc.codedsm.mvc.service.IowaPayrollService;
import edu.dmacc.codedsm.mvc.service.PayrollService;
import edu.dmacc.codedsm.mvc.service.TexasPayrollService;

public class Runner{

    public static void main( String[] args ) {
        Repository repository = new ConsoleRepository1();
          PayrollService service1 = new IowaPayrollService();
        //PayrollService service1 = new TexasPayrollService();
        HourlyPayrollController controller = new HourlyPayrollController(service1);
        controller.handelInput( "Pam",  60);

    }
}
