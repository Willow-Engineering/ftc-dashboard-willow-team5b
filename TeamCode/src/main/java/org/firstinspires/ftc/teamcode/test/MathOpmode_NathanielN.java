package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class MathOpmode_NathanielN extends OpMode {

    @Override
    public void init(){

    }
    @Override
    public void loop(){
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double dif = gamepad1.left_stick_y - gamepad1.right_stick_y;
        double sum = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Right stick Y", gamepad1.right_stick_y);
        telemetry.addData("speed Forward", speedForward);
        telemetry.addData("Left & Right trigers sum", sum);
        telemetry.addData("Left & Right stick dif", dif);

    }
}
