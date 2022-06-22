package com.kcrs.estudio.dvpdfgenerator.cvgenerator.Controller;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasic;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/Kcrs/users")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("/")
    public @ResponseBody List<UserBasic> getAllUsers() {
        return userServices.getAllUsers();
    }

    @GetMapping(value ="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  @ResponseBody UserBasic getUserBasic(@PathVariable String id){
        return  userServices.getUser(id);
    }




}
