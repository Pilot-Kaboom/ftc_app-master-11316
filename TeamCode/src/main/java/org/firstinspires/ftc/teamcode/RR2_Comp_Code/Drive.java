package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Drive {

    private final DcMotor BRM;
    private final DcMotor FLM;
    private final DcMotor BLM;
    private final DcMotor FRM;


    private final LinearOpMode adrive;

    private double FEC;
    private double BEC;
    private double REC;
    private double LEC;
    public Drive(LinearOpMode adrive){
        BRM = adrive.hardwareMap.dcMotor.get("brm");
        BLM = adrive.hardwareMap.dcMotor.get("blm");
        FRM = adrive.hardwareMap.dcMotor.get("frm");
        FLM = adrive.hardwareMap.dcMotor.get("flm");

        this.adrive=adrive;

    }

    public void resetEC(){
        FLM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BLM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BRM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FRM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        adrive.idle();
        FLM.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BLM.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BRM.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FRM.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        adrive.idle();
    }
    public void RunInPower(){
        FLM.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        BLM.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        BRM.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        FRM.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        adrive.idle();
    }
    public void goForward(double power){
        FLM.setPower(-power);
        FRM.setPower(power);
        BLM.setPower(-power);
        BRM.setPower(power);
    }
    public void goRight(double power){
        FLM.setPower(-power);
        FRM.setPower(-power);
        BLM.setPower(power);
        BRM.setPower(power);
    }
    public void turn(double power){
        FLM.setPower(power);
        FRM.setPower(power);
        BLM.setPower(power);
        BRM.setPower(power);
    }
    public void StopMotors(double stop){
        FLM.setPower(stop);
        FRM.setPower(stop);
        BLM.setPower(stop);
        BRM.setPower(stop);
    }
    public void ticks(){
        FEC = FRM.getCurrentPosition()/4 + BRM.getCurrentPosition()/4 + -FLM.getCurrentPosition()/4 +  -BLM.getCurrentPosition() / 4;
        BEC = FLM.getCurrentPosition()/4 +  BLM.getCurrentPosition()/4 + -FRM.getCurrentPosition()/4 + -BRM.getCurrentPosition() / 4;
        REC = -FLM.getCurrentPosition()/4 +  BLM.getCurrentPosition()/4 + -FRM.getCurrentPosition()/4 + BRM.getCurrentPosition() / 4;
        LEC = FLM.getCurrentPosition()/4 +  -BLM.getCurrentPosition()/4 + FRM.getCurrentPosition()/4 + -BRM.getCurrentPosition() / 4;
    }
    public void ECforward(double distance, double power){
        while(FEC < distance){
            goForward(power);
        }
    }
    public void ECbackward(double distance, double power){
        while(BEC < distance){
            goForward(-power);
        }
    }
    public void ECright(double distance, double power){
        while(REC < distance){
            goRight(power);
        }
    }
    public void ECleft(double distance, double power){
        while(LEC < distance){
            goRight(-power);
        }
    }
    public void ECtelem() {
        adrive.telemetry.addData("FEC", FEC);
        adrive.telemetry.addData("BEC", BEC);
        adrive.telemetry.addData("REC", REC);
        adrive.telemetry.addData("LEC", LEC);
        adrive.telemetry.addData("FLM", FLM.getCurrentPosition());
        adrive.telemetry.addData("BLM", BLM.getCurrentPosition());
        adrive.telemetry.addData("BRM", BRM.getCurrentPosition());
        adrive.telemetry.addData("FRM", FRM.getCurrentPosition());
        //telemetry.addData("ods", ODS.getLightDetected());

        adrive.telemetry.update();
    }
}
