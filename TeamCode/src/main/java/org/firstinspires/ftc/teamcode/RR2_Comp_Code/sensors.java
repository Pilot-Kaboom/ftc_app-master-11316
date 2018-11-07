package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorREVColorDistance;

public class sensors {

    private final DistanceSensor Bd;
    private final DistanceSensor Sd;
    private final ColorSensor Rc;
    private final ColorSensor Lc;
    private final OpticalDistanceSensor Ld;
    private final OpticalDistanceSensor Rd;
    private final Servo lights;
    private final TouchSensor backtouch;

    public sensors(HardwareMap sense){
        Bd = sense.get(DistanceSensor.class, "bd");
        Sd = sense.get(DistanceSensor.class, "sd");
        Rc = sense.colorSensor.get("rcd");
        Rd = sense.opticalDistanceSensor.get("rcd");
        Lc = sense.colorSensor.get("lcd");
        Ld = sense.opticalDistanceSensor.get("lcd");
        lights = sense.servo.get("lights");
        backtouch = sense.touchSensor.get("backtouch");
    }





}
