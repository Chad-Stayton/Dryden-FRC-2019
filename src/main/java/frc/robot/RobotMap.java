/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Motors
  public static final int DRIVE_MOTOR_LEFT_FRONT = 0;
  public static final int DRIVE_MOTOR_RIGHT_FRONT = 3;
  public static final int DRIVE_MOTOR_LEFT_REAR = 1;
  public static final int DRIVE_MOTOR_RIGHT_REAR = 2;
  public static final int CARGO_PIECE = 4;
  public static final int DISC_PIECE = 5;
  
  //Controller
  public static final int JOYSTICK_CONTROLLER1 = 0;
  public static final int JOYSTICK_CONTROLLER2 = 1;
  public static final int JOYSTICK_LEFT_X_AXIS = 0;
  public static final int JOYSTICK_LEFT_Y_AXIS = 1;
  public static final int JOYSTICK_RIGHT_X_AXIS = 4;
  public static final int JOYSTICK_RIGHT_Y_AXIS = 5;
  
  public static final int JOYSTICK_BUTTON_A = 1;
  public static final int JOYSTICK_BUTTON_B = 2;
  public static final int JOYSTICK_BUTTON_X = 3;
  public static final int JOYSTICK_BUTTON_Y = 4;
  public static final int JOYSTICK_BUTTON_LB = 5;
  public static final int JOYSTICK_BUTTON_RB = 6;
}
