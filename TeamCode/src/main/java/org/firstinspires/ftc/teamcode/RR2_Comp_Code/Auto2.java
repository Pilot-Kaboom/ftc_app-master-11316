package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;


@Autonomous(name="auto2", group="Auto1")
public class Auto2 extends RR2_TeleBot {

    @Override
    public void run() {
        tfoddd.runTFscan();
        drive.resetEC();
        //drop
        while (opModeIsActive() && time.seconds() <.5){
            lifter.LiftOps(-1);
            doit=true;
        }
        while (opModeIsActive() && time.seconds() < 2){
            lifter.LiftOps(1);
            //vert.setPower(1);
        }
        lifter.LiftOps(0);
        //vert.setPower(0);
        drive.resetEC();
        //hi ho robot, away!
        while(opModeIsActive() && drive.bect() <400 ){
            drive.goForward(-.5);
        }
        time.reset();
        while(opModeIsActive() && time.seconds()< .25){
            drive.StopMotors(0);
        }

        while(opModeIsActive() && sense.backD() < 21){
            drive.goRight(-.25);
            sense.sensortelem();

        }
        drive.StopMotors(0);
        drive.resetEC();


        //gold on right
        /*
        if(sense.colorL()> sense.white() && sense.colorR() > sense.white()){
            Gright = true;
            Gcenter = false;
            Gleft = false;

        }
        //gold in center
        else if(sense.colorL()> sense.white() && sense.colorR() < sense.white()){
            Gright = false;
            Gcenter = true;
            Gleft = false;
        }
        //gold on left
        else if(sense.colorL()< sense.white() && sense.colorR() > sense.white()){
            Gright = false;
            Gcenter = false;
            Gleft = true;
        }
        else{
            Gright = false;
            Gcenter = false;
            Gleft = false;
        }
        */
        time.reset();
        while (opModeIsActive() && tfoddd.Right() && doit){
            /*while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
                drive.ECtelem();
            }*/
            telemetry.addData("do it", doit);
            telemetry.addData("gold on right",1);
            telemetry.update();
            doit = false;
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.fect() < 1500){
                drive.goForward(.5);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on right",1);
                telemetry.update();

            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.lect() < 400){
                drive.goRight(-.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on right",1);
                telemetry.update();

            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.rect() < 400){
                drive.goRight(.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on right",1);
                telemetry.update();
            }

            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 2250){
                drive.goForward(-.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on right",1);
                telemetry.update();

            }
            drive.StopMotors(0);
            drive.resetEC();
        }
        time.reset();
        while(opModeIsActive() && tfoddd.Left() && doit){
            /*while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
                drive.ECtelem();
            }*/
            telemetry.addData("do it", doit);
            telemetry.addData("gold on left",1);
            telemetry.update();
            doit = false;
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.bect() < 500){
                drive.goForward(-.5);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on left",1);
                telemetry.update();

            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.lect() < 400){
                drive.goRight(-.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on left",1);
                telemetry.update();

            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.rect() < 400){
                drive.goRight(.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on left",1);
                telemetry.update();

            }

            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 500){
                drive.goForward(-.5);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on left",1);
                telemetry.update();

            }

        }
        while(opModeIsActive() && doit&& tfoddd.Center()){
            /*while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
                drive.ECtelem();
            }*/
            telemetry.addData("do it", doit);
            telemetry.addData("gold on center",1);
            telemetry.update();
            doit = false;
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.fect() < 500){
                drive.goForward(.5);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on center",1);
                telemetry.update();
            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.lect() < 400){
                drive.goRight(-.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on center",1);
                telemetry.update();
            }
            drive.StopMotors(0);
            drive.resetEC();
            sleep(500);
            while(opModeIsActive() && drive.rect() < 400){
                drive.goRight(.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on center",1);
                telemetry.update();
            }

            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 1500){
                drive.goForward(-.75);
                telemetry.addData("do it", doit);
                telemetry.addData("gold on center",1);
                telemetry.update();
            }
            drive.StopMotors(0);
            drive.resetEC();

        }
        /*
        while(opModeIsActive() && !Gleft && !Gright && !Gcenter && doit){
            while(opModeIsActive() && drive.rect() < 50){
                drive.goRight(.5);
                drive.ECtelem();
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.bect() < 250){
                drive.goForward(-.5);
                drive.ECtelem();
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.lect() < 100){
                drive.goRight(-.75);
                drive.ECtelem();
            }
            drive.StopMotors(0);
            drive.resetEC();
            while(opModeIsActive() && drive.rect() < 100){
                drive.goRight(.75);
                drive.ECtelem();
            }
            doit = false;
            drive.StopMotors(0);
            drive.resetEC();

            drive.ECtelem();

        }*/
        while(opModeIsActive() && sense.sideD()>14){
            drive.teledrive(.75,0,0,.15);
            telemetry.addData("do it", doit);
            telemetry.addData("driving to wall",1);
            telemetry.addData("gold on left", tfoddd.Left());
            telemetry.addData("gold on right", tfoddd.Right());
            telemetry.addData("gold on center", tfoddd.Center());
            drive.ECtelem();

            telemetry.update();
        }
        drive.StopMotors(0);
        drive.resetEC();
        time.reset();
        /*
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
        }*/
        while(opModeIsActive() && time.seconds()< .4){
            drive.turnClockwise(-.75);
        }
        drive.StopMotors(0);
        drive.resetEC();
        time.reset();
        drive.StopMotors(0);
        while(opModeIsActive()&& drive.bect()> 3000){
            if (sense.sideD()>5){
                drive.teledrive(1,-1,0,0);
            }
            else if (sense.sideD()<3){
                drive.teledrive(1,1,0,0);
            }
            else {
                drive.teledrive(.75,0,0,0);
            }
            drive.ECtelem();
            telemetry.addData("following wall to zone", 1);
            telemetry.update();
        }
        drive.StopMotors(0);
        while(opModeIsActive() && time.seconds()<1){
            sense.teammarker(.75);
            drive.ECtelem();
            telemetry.addData("dumping TM", 1);
            telemetry.update();
        }
        sense.teammarker(0);
        drive.StopMotors(0);
        drive.resetEC();
        /*
        while(opModeIsActive() && (Gright || Gcenter || Gleft)){
            telemetry.addData("attempting 2nd mineral", 1);
            telemetry.update();
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

        }*/
        drive.StopMotors(0);
        while(opModeIsActive()&& drive.fect() < 3000){
            if (sense.sideD()>5){
                drive.teledrive(-1,-1,0,0);
            }
            else if (sense.sideD()<3){
                drive.teledrive(-1,1,0,0);
            }
            else {
                drive.teledrive(-.75,0,0,0);
            }
            telemetry.addData("return to crater", 1);
            drive.ECtelem();
            telemetry.update();
        }
        drive.StopMotors(0);
    }
}