package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPrueba extends OpMode {
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        telemetry.addData("Palanca (eje x):",gamepad1.left_stick_x);
        telemetry.addData("Palanca (eje y):",gamepad1.left_stick_y);
        telemetry.addData("Boton A",gamepad1.a);
        if(gamepad1.a=true){
            telemetry.addData("Haz presionado el botón:", "a");
        }
    }
}
