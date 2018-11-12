package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="tele1", group="Tele1")
public class TeleOp1 extends RR2_TeleBot {

    @Override
    public void run() {
        while(opModeIsActive()){
            //drive
            drive.teledrive(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_trigger, gamepad1.left_trigger);
            //arm
            arm.hin(gamepad1.right_stick_x);
            arm.vin(gamepad2.right_stick_y);
            //lift
            lifter.LiftOps(gamepad2.left_stick_y);
            //collecter
            collect.collect(gamepad2.left_trigger-gamepad2.right_trigger);
            collect.drop(gamepad2.right_bumper, gamepad2.left_bumper);
        }
    }
}
