package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp()
public class UseString_NathanielN {
    @Override
    public void inti(){
        String myName = "Nathaniel Nunnery";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop(){
        int x = 5;

        {
            int y = 4;
        }
    }
}
