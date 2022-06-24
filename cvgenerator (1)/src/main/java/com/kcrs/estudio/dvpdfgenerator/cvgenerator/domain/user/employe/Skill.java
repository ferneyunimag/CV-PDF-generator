package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.employe;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Skill {
    private StringVO skillName;
    private  StringVO Description;


}
