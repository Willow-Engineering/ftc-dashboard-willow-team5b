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

            double lSpeed = (gamepad1.left_stick_y*gamepad1.left_stick_y*gamepad1.left_stick_y);
            double rSpeed = (gamepad1.right_stick_y*gamepad1.right_stick_y*gamepad1.right_stick_y);
            double rT = gamepad1.right_trigger;
            double lT = gamepad1.left_trigger;
            double sT = lT+rT;
            String teamNumber = "5B";

            if (gamepad1.a) {
                lSpeed = lSpeed*.5;
                rSpeed = rSpeed*.5;
            }
                else {
                    lSpeed = lSpeed *1;
                    rSpeed = rSpeed *1;
                 }
            if (gamepad1.b) {
                    lSpeed = rSpeed;
                    rSpeed = lSpeed;
                }
                else {
                        lSpeed = lSpeed *1;
                        rSpeed = rSpeed *1;
                }
            telemetry.addData("Run time",getRuntime());
            telemetry.addData("b button", gamepad1.b);
            telemetry.addData("lSpeed",lSpeed);
            telemetry.addData("rSpped",rSpeed);
            telemetry.addData("sum of trigger",sT);
            telemetry.addData("Team Number", teamNumber);
            telemetry.update();

        }
    }
}