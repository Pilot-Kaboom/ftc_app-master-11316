package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="tele1", group="Tele1")
public class TeleOp1 extends RR2_TeleBot {

    @Override
    public void run() {
        while(opModeIsActive()){
            //drive
            drive.teledrive(-gamepad1.left_stick_y, -gamepad1.left_stick_x, gamepad1.right_trigger, gamepad1.left_trigger);
            //arm
            arm.hin(gamepad2.left_stick_y+(gamepad2.left_trigger*.25)-(gamepad2.right_trigger*.25));
            arm.vin(-gamepad2.right_stick_y-(gamepad2.left_trigger)+(gamepad2.right_trigger));
            //arm.VposSet(gamepad2.right_stick_y,!gamepad2.a);
            //arm.HposSet(gamepad2.left_stick_y,!gamepad2.b,gamepad2.right_bumper);
            if(gamepad2.a){
                arm.stopusingEC();
            }
            //lift
            lifter.LiftOpss(gamepad2.dpad_up, gamepad2.dpad_down);
            //collecter
            collect.collect(-gamepad1.right_stick_y);
            collect.drop(gamepad2.right_bumper, gamepad2.left_bumper);
            //other stuff
            arm.Armtelem();

        }
    }
}
