package com.code.controllers.dashboard.dashboardController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        return "pages/dashboard/dashboard";
    }
}
