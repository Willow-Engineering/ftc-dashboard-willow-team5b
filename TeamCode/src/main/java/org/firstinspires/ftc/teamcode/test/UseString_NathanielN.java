package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp()
public class UseString_NathanielN extends OpMode{
    @Override
    public void inti(){
        String myName = "Nathaniel Nunnery";


        Telemetry.addData("Hello", myName);
    }

    @Override
    public void loop(){
        int x = 5;

        {
            int y = 4;
        }
    }
}
