package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by abedi on 2/5/2016.
 */
public class Test extends OpMode {

    public DcMotor motorLeft;
    public DcMotor motorRight;
    public double MotorPower = 1.0;
    public double MotorPowerReverse = -1.0;

    public void init() {

        motorLeft = hardwareMap.dcMotor.get("left_motor");
        motorRight = hardwareMap.dcMotor.get("right_motor");

    }

    public void start(){
    }
    public void loop() {
        if (gamepad1.dpad_right) {
            motorLeft.setPower(MotorPower);
            motorRight.setPower(MotorPowerReverse);
        } else if (gamepad1.dpad_left) {
            motorLeft.setPower(MotorPowerReverse);
            motorRight.setPower(MotorPower);
        } else if (gamepad1.dpad_up) {
            motorLeft.setPower(MotorPower);
            motorRight.setPower(MotorPower);
        } else if (gamepad1.dpad_down) {
            motorLeft.setPower(MotorPowerReverse);
            motorRight.setPower(MotorPowerReverse);
        } else {
            motorLeft.setPower(0.0);
            motorRight.setPower(0.0);
        }
    }

}
