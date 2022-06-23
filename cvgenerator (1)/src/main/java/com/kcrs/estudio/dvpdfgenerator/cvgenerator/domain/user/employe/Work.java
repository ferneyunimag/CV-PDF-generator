package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.employe;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Work {
    private StringVO companyName;
    private StringVO role;
    private StringVO workStarted;
    private StringVO workStopped;
    private StringVO responsibilities;

}
