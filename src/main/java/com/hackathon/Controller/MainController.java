package com.hackathon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    boolean unlock = false;

    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/hotel")
    public String viewHotelPage() {
        return "Hotel";
    }

    @GetMapping("/vendor")
    public String viewVendorPage() {
        return "Vendor";
    }

    @GetMapping("/hotel/user")
    public String viewUserPage() {
        return "User";
    }

    @GetMapping("/hotel/lockinstall")
    public String viewLockInstall() {
        return "LockInstall";
    }

    @GetMapping("/hotel/roomallocate")
    public String roomAllocate() {
        return "RoomAllocate";
    }

    @GetMapping("/vendor/smartlock")
    public String viewSmartLockPage() {
        return "OnboardSmartLock";
    }

    @GetMapping("/lockdoor")
    public String lockedDoor() {
        return "LockDoor";
    }

    @GetMapping("/unlock")
    public String onUserApp() {
        unlock = true;
        return "DoorOpenView";
    }

    @GetMapping("/lock-unlock")
    public String lockUnlock() {
        return "LockUnlock";
    }

    @GetMapping("/status")
    @ResponseBody
    public Boolean lockStatus() {
/*        boolean varLocked = locked;
        //locked = false;*/
        return unlock;
    }

    @GetMapping("/locked")
    public String userApp() {
        unlock = false;
        return "UserView";
    }
}
