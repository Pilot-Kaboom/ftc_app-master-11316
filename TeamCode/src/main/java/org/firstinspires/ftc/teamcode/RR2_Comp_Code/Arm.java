package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {

    private final DcMotor vert;
    private final DcMotor hori;


    public Arm(HardwareMap hMap){
        vert = hMap.dcMotor.get("vert");
        hori = hMap.dcMotor.get("hori");
    }

    public void vin(double vin){
        vert.setPower(vin);
    }
    public void hin(double hin){
        hori.setPower(hin);
    }
}
