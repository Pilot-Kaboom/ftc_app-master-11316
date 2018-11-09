package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

public abstract class RR2_TeleBot extends SuperSuperClass {

    public  Arm arm;
    public  Drive drive;
    public collecter collect;
    public lift lifter;
    public sensors sense;
    public LoopingRevGyro gyro;

    @Override
    public void initiate(){

        arm = new Arm(hardwareMap);
        drive = new Drive(this);
        collect = new collecter(hardwareMap);
        lifter = new lift(hardwareMap);
        sense = new sensors(hardwareMap);
        LoopingRevGyro gyro= new LoopingRevGyro(this.hardwareMap, "imu");

        UpdatingManager updatingManager = new UpdatingManager(this);
        updatingManager.addUpdatable(gyro);
        updatingManager.start();

    }
}
