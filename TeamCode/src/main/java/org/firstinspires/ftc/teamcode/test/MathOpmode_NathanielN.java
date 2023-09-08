package org.firstinspires.ftc.teamcode.test;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp();
public class MathOpmode_NathanielN {

    @Override
    public void init(){

        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelementry());
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
