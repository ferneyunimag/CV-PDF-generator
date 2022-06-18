package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.EmailVO;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.NumberVO;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBasic {
    private StringVO id;
    private StringVO name;
    private EmailVO email;
    private NumberVO phone;

}
