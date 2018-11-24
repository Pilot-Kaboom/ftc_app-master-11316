package org.firstinspires.ftc.teamcode.RR2_Comp_Code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {

    private final DcMotor vert;
    private final DcMotor hori;

    private double pos;
    private double othapos;

    private final LinearOpMode arm;

    public Arm(LinearOpMode arm){
        vert = arm.hardwareMap.dcMotor.get("vert");
        hori = arm.hardwareMap.dcMotor.get("hori");
        this.arm = arm;
    }

    public void vin(double vin){
        vert.setPower(vin);
    }
    public void hin(double hin){
        hori.setPower(hin);
    }
    public void VposSet(double posset, boolean doit){
        pos = (pos + posset);
        if(doit){
            vert.setPower(posset);
        }
        else{
            vert.setPower(Vpower());
        }
    }
    public double Vpower(){
        return(vert.getCurrentPosition()-pos);
    }
    public double HsetPos(){
        return (vert.getCurrentPosition()*1.75);
    }
    public double Hpower(){
        return(hori.getCurrentPosition()-HsetPos());
    }
    public double more(){
        return (hori.getCurrentPosition()-othapos);
    }

    public void HposSet(double posset, boolean doitalot, boolean doitabit){
        othapos = (othapos + posset);
        if(doitalot){
            hori.setPower(posset);
        }
        else if(doitabit){
            hori.setPower(more());
        }
        else{
            hori.setPower(Hpower());
        }
    }
    public void resetArmEc(){
        vert.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        hori.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        arm.idle();
        vert.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        hori.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.idle();
    }
}
