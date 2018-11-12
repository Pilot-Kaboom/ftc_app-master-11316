package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;


@Autonomous(name="auto1", group="Auto1")
public class Auto1 extends RR2_LiftBot {

    @Override
    public void run() {
        drive.resetEC();
        //drop
        while (opModeIsActive() && time.seconds() < 1.5){
            lifter.LiftOps(1);
            vert.setPower(1);
        }
        lifter.LiftOps(0);
        vert.setPower(0);
        drive.resetEC();
        //hi ho robot, away!
        while(opModeIsActive() && drive.bect() <250 ){
            drive.goForward(-1);
        }
        while(opModeIsActive() && sense.backD()< 30){
            drive.goRight(-.75);
        }
        while(opModeIsActive() && sense.backD()> 30 && sense.backD() < 36){
            drive.goRight(-.25);
        }
        drive.StopMotors(0);
        drive.resetEC();
        //gold on right
        if(sense.colorL()> sense.white() && sense.colorR() > sense.white()){
            Gright = true;
            Gcenter = false;
            Gleft = false;
            while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.fect() < 500){
                drive.goForward(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.lect() < 100){
                drive.goRight(-.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.rect() < 100){
                drive.goRight(.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            telemetry.addData("gold on right", 1);
            telemetry.update();
        }
        //gold in center
        else if(sense.colorL()> sense.white() && sense.colorR() < sense.white()){
            Gright = false;
            Gcenter = true;
            Gleft = false;
            while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.fect() < 250){
                drive.goForward(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.lect() < 100){
                drive.goRight(-.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.rect() < 100){
                drive.goRight(.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            telemetry.addData("gold in center", 1);
            telemetry.update();
        }
        //gold on left
        else if(sense.colorL()> sense.white() && sense.colorR() < sense.white()){
            Gright = false;
            Gcenter = false;
            Gleft = true;
            while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 250){
                drive.goForward(-.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.lect() < 100){
                drive.goRight(-.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.rect() < 100){
                drive.goRight(.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            telemetry.addData("gold on left", 1);
            telemetry.update();
        }
        else{
            Gright = false;
            Gcenter = false;
            Gleft = false;
            while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 250){
                drive.goForward(-.5);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.lect() < 100){
                drive.goRight(-.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.rect() < 100){
                drive.goRight(.75);
            }
            drive.StopMotors(0);
            drive.resetEC();
            telemetry.addData("failed to find gold", 1);
            telemetry.update();
        }
        while(opModeIsActive() && sense.sideD()>12){
            drive.goForward(-.75);
        }
        drive.StopMotors(0);
        drive.resetEC();
        while(opModeIsActive() && gyro.getGyroZ(AngleUnit.DEGREES)< 45){
            drive.turnClockwise(.75);
        }
        time.reset();
        while(opModeIsActive() && time.seconds() <1){
            if (gyro.getGyroZ(AngleUnit.DEGREES)< 46){
                drive.turnClockwise(.15);
            }
            else if (gyro.getGyroZ(AngleUnit.DEGREES)> 44){
                drive.turnClockwise(-.15);
            }
            else{
                drive.StopMotors(0);
            }
        }
        while(opModeIsActive()&& drive.bect() < 1000){
            if (sense.sideD()>5){
                drive.diaginalFLtoBR(-1);
            }
            else if (sense.sideD()<3){
                drive.diaginalFRtoBL(-1);
            }
            else {
                drive.goForward(-.75);
            }
        }
        while(opModeIsActive() && time.seconds()<1){
            sense.teammarker(.75);
        }
        sense.teammarker(0);
        drive.StopMotors(0);
        drive.resetEC();
        while(opModeIsActive() && (Gright || Gcenter || Gleft)){
            if(Gleft){
                while(drive.fect()<50){
                    drive.goForward(.25);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(drive.rect()<500){
                    drive.goRight(.7);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(sense.sideD()>3){
                    drive.goRight(-.7);
                }
                Gleft=false;
            }
            else if(Gright){
                while(drive.fect()<150){
                    drive.goForward(.25);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(drive.rect()<400){
                    drive.goRight(.7);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(sense.sideD()>3){
                    drive.goRight(-.7);
                }
                Gright=false;
            }
            else if(Gcenter){
                while(drive.fect()<100){
                    drive.goForward(.25);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(drive.rect()<450){
                    drive.goRight(.7);
                }
                drive.StopMotors(0);
                drive.resetEC();
                while(sense.sideD()>3){
                    drive.goRight(-.7);
                }
                Gcenter=false;
            }

        }
        while(opModeIsActive()&& drive.fect() < 1250){
            if (sense.sideD()>5){
                drive.diaginalFLtoBR(1);
            }
            else if (sense.sideD()<3){
                drive.diaginalFRtoBL(1);
            }
            else {
                drive.goForward(.75);
            }
        }
        drive.StopMotors(0);
    }
}
