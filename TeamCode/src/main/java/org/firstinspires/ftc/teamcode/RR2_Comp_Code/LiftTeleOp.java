package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="LiftTele", group="Tele1")
public class LiftTeleOp extends RR2_LiftBot {

    @Override
    public void run() {
        while(opModeIsActive()){
            //drive
            if (gamepad1.left_bumper){
                drive.goForward(.25 * gamepad1.left_stick_y);
                drive.goRight(.25 * gamepad1.left_stick_x);
                drive.turn(2.5 * gamepad1.right_trigger-gamepad1.left_trigger);
            }
            else{
                drive.goForward(gamepad1.left_stick_y);
                drive.goRight(gamepad1.left_stick_x);
                drive.turn(gamepad1.right_trigger-gamepad1.left_trigger);
            }
            //arm
            //lift
            lifter.LiftOps(gamepad2.left_stick_y);
            //collecter

        }
    }
}
