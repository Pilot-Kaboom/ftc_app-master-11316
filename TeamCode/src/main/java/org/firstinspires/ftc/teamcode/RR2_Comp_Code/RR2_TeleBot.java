package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public abstract class RR2_TeleBot extends SuperSuperClass {

    public  Arm arm;
    public  Drive drive;
    public collecter collect;
    public lift lifter;
    public sensors sense;

    @Override
    public void initiate(){

        arm = new Arm(hardwareMap);
        drive = new Drive(this);
        collect = new collecter(hardwareMap);
        lifter = new lift(hardwareMap);
        sense = new sensors(hardwareMap);

    }
}
