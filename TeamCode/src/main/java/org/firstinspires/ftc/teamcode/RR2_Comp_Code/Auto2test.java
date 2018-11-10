package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="DON'T USE", group="Auto1")
public class Auto2test extends RR2_LiftBot {

    @Override
    public void run() {
        drive.resetEC();

        while (opModeIsActive() && time.seconds() < 1.5){
            lifter.LiftOps(.1);
            vert.setPower(1);
        }
        drive.resetEC();
        //hi ho robot, away!

        drive.ECbackward(250, .25);
        drive.StopMotors(0);
        while(opModeIsActive() && sense.backD()<20){
            drive.goRight(-.5);
        }
        while(opModeIsActive() && sense.backD()<24){
            drive.goRight(-.25);
        }
        drive.StopMotors(0);
        drive.resetEC();
        //gold on far right
        if(sense.colorL()> sense.white() && sense.colorR() > sense.white()){
            drive.ECright(50, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECforward(500, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECleft(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECright(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
        }
        //gold on right
        else if(sense.colorL()>sense.white() && sense.colorR() < sense.white()){
            drive.ECright(50, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECforward(250, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECleft(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECright(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
        }
        //gold on left
        else if(sense.colorL()<sense.white() && sense.colorR() < sense.white()){
            drive.ECright(50, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECbackward(250, .5);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECleft(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECright(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
        }
        //cant find gold
        else {
            drive.ECleft(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
            drive.ECright(100, .75);
            drive.StopMotors(0);
            drive.resetEC();
            telemetry.addData("failed to find gold", 1);
            telemetry.update();
        }
        while(opModeIsActive() && sense.sideD() > 5){
            drive.goForward(-.5);
        }
        while(opModeIsActive() ){

        }

    }
}

