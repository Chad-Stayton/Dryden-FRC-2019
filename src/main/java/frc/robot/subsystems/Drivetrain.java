/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

public class Drivetrain extends Subsystem {
  private static final String LOG_TAG = Drivetrain.class.getSimpleName();
  private Talon leftFrontTalon;
  private Talon rightFrontTalon;
  private Talon leftRearTalon;
  private Talon rightRearTalon;
  private DifferentialDrive mDifferentialDrive;

  public Drivetrain() {
    leftFrontTalon = new Talon(RobotMap.DRIVE_MOTOR_LEFT_FRONT);
    leftRearTalon = new Talon(RobotMap.DRIVE_MOTOR_LEFT_REAR);
    SpeedControllerGroup lSpeedControllerGroup = new SpeedControllerGroup(leftFrontTalon, leftRearTalon);
    rightFrontTalon = new Talon(RobotMap.DRIVE_MOTOR_RIGHT_FRONT);
    rightRearTalon = new Talon(RobotMap.DRIVE_MOTOR_RIGHT_REAR);
    SpeedControllerGroup rSpeedControllerGroup = new SpeedControllerGroup(rightFrontTalon, rightRearTalon);
    mDifferentialDrive = new DifferentialDrive(lSpeedControllerGroup, rSpeedControllerGroup);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveCommand());
  }

  public void setDifferetialDrive(int d1, int d2, boolean isArcade) {

    double leftInput = Robot.mOI.getJoystick1().getRawAxis(d1);
    double rightInput = Robot.mOI.getJoystick1().getRawAxis(d2);

    double leftPower = leftInput * 0.75;
    double rightPower = rightInput * 0.75;

    if (mDifferentialDrive != null) {
      if (isArcade) {
        mDifferentialDrive.arcadeDrive(d1, d2 * -1);
      } else {
        mDifferentialDrive.tankDrive(leftPower, rightPower);
      }
    } else {
      System.out.println(LOG_TAG + " setDifferentialDrive: mDifferentialDrive is NULL");
    }
  }
}