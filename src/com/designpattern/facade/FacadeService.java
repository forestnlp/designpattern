package com.designpattern.facade;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:46
 * @Description: com.designpattern.facade
 * @version: 1.0
 */
public class FacadeService {
    private SubSystem1 system1 = new SubSystem1();
    private SubSystem2 system2 =  new SubSystem2();
    private SubSystem3 system3 = new SubSystem3();

    public void apply() {
        system3.log();
        boolean success = system1.dbtransaction();
        if(success)
            system2.notification();
    }
}
