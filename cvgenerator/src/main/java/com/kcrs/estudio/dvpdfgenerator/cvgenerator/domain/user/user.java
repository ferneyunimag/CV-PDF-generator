package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private StringVO id;
    private StringVO name;
    private StringVO email;
    private StringVO phone;

}
