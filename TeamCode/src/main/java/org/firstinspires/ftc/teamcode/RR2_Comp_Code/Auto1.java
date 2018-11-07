package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="auto1", group="Auto1")
public class Auto1 extends RR2_TeleBot {

    @Override
    public void run() {
        drive.resetEC();

        while (opModeIsActive() && time.seconds() < 2){
            lifter.LiftOps(-1);
        }
        drive.resetEC();
        drive.ECbackward(250, .25);

    }
}
