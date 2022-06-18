package com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.user;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects.EmailVO;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects.NumberVO;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserBasic {
    private StringVO id;
    private StringVO name;
    private EmailVO email;
    private NumberVO phone;

}


