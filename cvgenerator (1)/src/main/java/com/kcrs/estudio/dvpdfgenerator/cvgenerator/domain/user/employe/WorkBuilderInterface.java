package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.employe;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;

public interface WorkBuilderInterface {

    Work build();
    WorkBuilder withCompanyName(String companyName);
    WorkBuilder withRole(String role);
    WorkBuilder withWorkStarted(String wordStarted);
    WorkBuilder withWorkStopped(String workStopped);
    WorkBuilder withResponsibilities(String responsibilities);

}
