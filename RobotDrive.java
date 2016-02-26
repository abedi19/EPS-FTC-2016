package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by abedi on 2/4/2016.
 */
public class RobotDrive extends Helper {
    final static double MOTOR_POWER = 1; // Higher values will cause the robot to move faster
    final static double Motor_Power_Reverse = -1;
    DcMotor motorLeft;
    DcMotor motorRight;

// motor Left is inverted

    @Override
    public void init() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        if (gamepad1.dpad_down) {
            forward();
        } else if (gamepad1.dpad_up) {
            back();
        } else if (gamepad1.dpad_left) {
            turnLeft();
        } else if (gamepad1.dpad_right) {
            turnRight();
        } else {
            stopMoving();
        }

        // 1500 positions per rotation

    }

}

