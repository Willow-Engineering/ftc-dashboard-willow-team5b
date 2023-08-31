package org.firstinspires.ftc.teamcode.test;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group = "test")
public class helloWord_Yajie extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        waitForStart();

        telemetry.addData("Hello","World");
        telemetry.update();

        while (!isStopRequested()) {

            String teamNumber = "5B";
            double motorSpeed = 0.5;
            boolean touchSensorPressed = true;

            telemetry.addData("Run time",getRuntime());
            telemetry.addData("Team Number", teamNumber);
            telemetry.addData("Motor Speed", motorSpeed);
            telemetry.addData("Touch Sensor", touchSensorPressed);
            telemetry.update();

        }
    }
}