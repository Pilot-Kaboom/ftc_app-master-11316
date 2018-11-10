package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="auto1", group="Auto1")
public class Auto1 extends RR2_LiftBot {

    @Override
    public void run() {
        drive.resetEC();

        while (opModeIsActive() && time.seconds() < 1){
            lifter.LiftOps(-1);
            vert.setPower(1);
        }
        drive.resetEC();
        //hi ho robot, away!
        while(opModeIsActive() && drive.bect() <250 ){
            drive.ECbackward(250, .25);
        }


    }
}
