/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class CargoManipulation extends Command {
  private static final String TAG = CargoManipulation.class.getSimpleName();

  public CargoManipulation() {
    System.out.println(TAG + " Cargo Manipulation fired");
    requires(Robot.mCargoControl);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    //Robot.mCargoControl.setCargoPiecePower(-0.8);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("CargoManip Fired");
    Robot.mCargoControl.setCargoPiecePower(true, Robot.mOI.getJoystick2().getRawButton(RobotMap.JOYSTICK_BUTTON_RB));
    //Robot.mCargoControl.setHatchMotorPower(Robot.mOI.getJoystick2().getRawButton(RobotMap.JOYSTICK_BUTTON_B));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    //return this.timeSinceInitialized() >= 1;
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

    Robot.mCargoControl.setCargoPiecePower(true, false);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
