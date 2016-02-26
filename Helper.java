package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by abedi on 2/4/2016.
 */
public class Helper extends OpMode {

    final static double MOTOR_POWER = 1; // Higher values will cause the robot to move faster
    final static double Motor_Power_Reverse = -1;

    public DcMotor motorLeft;
    public DcMotor motorRight;


    public Helper() {

        motorLeft = hardwareMap.dcMotor.get("left_motor");
        motorRight = hardwareMap.dcMotor.get("right_motor");


    }

    @Override
    public void init() {
    }

    @Override
    public void start() {
    }

    @Override
    public void loop() {
    }

    public void forward() {
        motorLeft.setPower(Motor_Power_Reverse);
        motorRight.setPower(MOTOR_POWER);
    }

    public void forward(double motorSpeed) {
        motorLeft.setPower(-motorSpeed);
        motorRight.setPower(motorSpeed);
    }

    public void back(double motorSpeed) {
        motorLeft.setPower(motorSpeed);
        motorRight.setPower(-motorSpeed);
    }

    public void back() {
        motorLeft.setPower(MOTOR_POWER);
        motorRight.setPower(Motor_Power_Reverse);
    }

    public void turnLeft(double motorSpeed) {
        motorLeft.setPower(motorSpeed);
        motorRight.setPower(motorSpeed);
    }

    public void turnLeft() {
        motorLeft.setPower(MOTOR_POWER);
        motorRight.setPower(MOTOR_POWER);
    }

    public void turnRight(double motorSpeed) {
        motorLeft.setPower(-motorSpeed);
        motorRight.setPower(-motorSpeed);
    }

    public void turnRight() {
        motorLeft.setPower(Motor_Power_Reverse);
        motorRight.setPower(Motor_Power_Reverse);
    }

    public void stopMoving() {
        motorLeft.setPower(0.0);
        motorRight.setPower(0.0);
    }

}
