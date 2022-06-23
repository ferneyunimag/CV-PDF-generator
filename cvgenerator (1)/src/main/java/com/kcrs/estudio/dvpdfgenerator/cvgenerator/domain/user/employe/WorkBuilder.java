package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.employe;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;

public class WorkBuilder implements  WorkBuilderInterface {
    private  Work work;
    private StringVO companyName;
    private StringVO role;
    private StringVO workStarted;
    private StringVO workStopped;
    private StringVO responsibilities;


    @Override
    public Work build() {
        work= new Work();
        work.setCompanyName(companyName);
        work.setRole(role);
        work.setWorkStarted(workStarted);
        work.setWorkStopped(workStopped);
        work.setResponsibilities(responsibilities);
        return work;
    }

    @Override
    public WorkBuilder withCompanyName(String companyName) {
        this.companyName= new StringVO(companyName);
        return  this;
    }

    @Override
    public WorkBuilder withRole(String role) {
        this.role= new StringVO(role);
        return this;
    }

    @Override
    public WorkBuilder withWorkStarted(String workStarted) {
        this.workStarted= new StringVO(workStarted);
        return this;
    }

    @Override
    public WorkBuilder withWorkStopped(String workStopped) {
        this.workStarted= new StringVO(workStopped);
        return this;
    }

    @Override
    public WorkBuilder withResponsibilities(String responsibilities) {
        this.responsibilities= new StringVO(responsibilities);
        return this;
    }
}
