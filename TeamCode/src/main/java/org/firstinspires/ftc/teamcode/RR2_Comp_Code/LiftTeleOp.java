package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="LiftTele", group="Tele1")
public class LiftTeleOp extends RR2_LiftBot {

    @Override
    public void run() {
        while(opModeIsActive()){
            drive.RunInPower();
            //drive
            /*drive.goForward(gamepad1.left_stick_y);
            drive.goRight(gamepad1.left_stick_x);
            drive.turn(gamepad1.right_trigger-gamepad1.left_trigger);*/
            if(gamepad1.left_stick_y> .05){
                drive.goForward(gamepad1.left_stick_y);
            }
            else if(gamepad1.left_stick_y< -.05){
                drive.goForward(gamepad1.left_stick_y);
            }
            else if (gamepad1.left_stick_x> .05){
                drive.goRight(gamepad1.left_stick_x);
            }
            else if (gamepad1.left_stick_x< -.05){
                drive.goRight(gamepad1.left_stick_x);
            }
            else if(gamepad1.left_trigger>.1){
                drive.turn(gamepad1.left_trigger*.5);
            }
            else if(gamepad1.right_trigger>.1){
                drive.turn(-gamepad1.right_trigger*.5);
            }
            else{
                drive.StopMotors(0);
            }
            //arm
            vert.setPower(gamepad2.right_stick_y);
            //lift
            lifter.LiftOps(gamepad2.left_stick_y);
            //collecter
            //telemetry
            if(gamepad1.x){
                drive.ECtelem();
            }
            else{
                sense.sensortelem();
            }





        }
    }
}
