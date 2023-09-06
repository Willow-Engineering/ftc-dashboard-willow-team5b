package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp()
public class HelloWorld_NathanielN extends OpMode{
    // Use *//* to start a line of comments
    @Override
    public void init() {
        telemetry.addData("Hello, ", "World");
    }
    @Override
    public void loop(){


    }


}

