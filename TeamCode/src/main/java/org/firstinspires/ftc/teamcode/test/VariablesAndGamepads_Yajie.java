package org.firstinspires.ftc.teamcode.test;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group = "test")
public class VariablesAndGamepads_Yajie extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        waitForStart();



        while (!isStopRequested()) {

            double dSpeed = gamepad1.left_stick_y*gamepad1.left_stick_y*gamepad1.left_stick_y;
            String teamNumber = "5B";
            double motorSpeed = 0.5;
            boolean touchSensorPressed = true;

            telemetry.addData("A button", gamepad1.a);
            telemetry.addData("dSpeed", dSpeed);
            telemetry.addData("Run time",getRuntime());
            telemetry.addData("Team Number", teamNumber);
            telemetry.addData("Motor Speed", motorSpeed);
            telemetry.addData("Touch Sensor", touchSensorPressed);
            telemetry.update();

        }
    }
}