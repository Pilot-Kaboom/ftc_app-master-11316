package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;


@Autonomous(name="do not use", group="Auto1")
public class AutoJustLandSample extends RR2_LiftBot {

    @Override
    public void run() {
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
        /*
        while(opModeIsActive() && sense.backD()< 14){
            drive.goRight(-.75);
            sense.sensortelem();

        }*/
        while(opModeIsActive() && sense.backD() < 21){
            drive.goRight(-.25);
            sense.sensortelem();

        }
        drive.StopMotors(0);
        drive.resetEC();
        while(opModeIsActive()/*&& (sense.disL()<.1675 && sense.disR()< .1675)*/){
            drive.goForward(-.25);
            sense.sensortelem();
        }
        time.reset();
        while(opModeIsActive()&& time.seconds()<.1)
            drive.StopMotors(0);
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
        while(opModeIsActive() && time.seconds()<1){
            if(/*(sense.colorR()> 21 )&& (sense.colorL()> 21)*/1<1){
                Gright = true;
                Gcenter = false;
                Gleft = false;
                telemetry.addData("deciding", 1);
                telemetry.addData("gold on right",1);
                sense.sensortelem();
                telemetry.update();
            }
            //gold in center
            else if(1>1/*sense.colorR()> 21*/){
                Gright = false;
                Gcenter = false;
                Gleft = true;
                telemetry.addData("deciding", 1);
                telemetry.addData("gold on center",1);
                sense.sensortelem();
                telemetry.update();
            }
            //gold on left
            else if(/*sense.colorL()> 21*/1<1){
                Gright = false;
                Gcenter = true;
                Gleft = false;
                telemetry.addData("deciding", 1);
                telemetry.addData("gold on left",1);
                sense.sensortelem();
                telemetry.update();
            }
            else{
                Gright = true;
                Gcenter = false;
                Gleft = false;
                telemetry.addData("deciding", 1);
                telemetry.addData("gold not found",1);
                sense.sensortelem();
                telemetry.update();
            }
        }

        while (opModeIsActive() && Gright && doit){
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
        while(opModeIsActive() && Gleft && doit){
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
        while(opModeIsActive() && doit&& Gcenter){
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
        drive.StopMotors(0);
    }
}
