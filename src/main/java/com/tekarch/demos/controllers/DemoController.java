package com.tekarch.demos.controllers;

import com.tekarch.demos.Model.Car;
import com.tekarch.demos.Model.Schooltrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class DemoController {

    @GetMapping(value = "/apidemo")
    public Car getEmployes(){
        Car c1 = new Car();
        c1.name = "Seshu's Car";
                c1.color ="white";
        return c1;
    }
    @GetMapping(value = "/mydemo2")
    public Car getCar() {
        Car c1 = new Car();
        c1.name = "Pinky's Car";
        c1.color = "Red";
        return c1;
    }
    @GetMapping(value = "/Schooltrip")
    public Schooltrip getTrip(){
        Schooltrip ST = new Schooltrip();
        ST.students = "4th grade";
        ST.Teachers = "Ms.Khan" + "Ms.Bay";
        ST.Buses = "Bus 1" + "Bus 2";
        return ST;
    }

}
