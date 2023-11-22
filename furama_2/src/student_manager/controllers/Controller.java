package student_manager.controllers;

import student_manager.services.IService;
import student_manager.services.impl.Service;

public class Controller {
    private static IService service = new Service();
    public boolean checkCode(String code) {
        return service.checkCode(code);
    }
}
