package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

public abstract class RR2_LiftBot extends SuperSuperClass {

    public  Drive drive;
    public lift lifter;
    //public sensors sense;
    //public LoopingRevGyro gyro;

    @Override
    public void initiate(){

        drive = new Drive(this);
        lifter = new lift(hardwareMap);
        //sense = new sensors(hardwareMap);
        //LoopingRevGyro gyro= new LoopingRevGyro(this.hardwareMap, "imu");

        //UpdatingManager updatingManager = new UpdatingManager(this);
        //updatingManager.addUpdatable(gyro);
        //updatingManager.start();

    }
}
