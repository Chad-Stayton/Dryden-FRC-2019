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

public class DriveCommand extends Command {
  private static final String LOG_TAG = DriveCommand.class.getSimpleName();

  public DriveCommand() {
    requires(Robot.mDrivetrain);
  }

  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.isArcadeDrive) {
        Robot.mDrivetrain.setDifferetialDrive(RobotMap.JOYSTICK_LEFT_Y_AXIS, RobotMap.JOYSTICK_LEFT_X_AXIS, true);  
    } else {
        Robot.mDrivetrain.setDifferetialDrive(RobotMap.JOYSTICK_LEFT_Y_AXIS, RobotMap.JOYSTICK_RIGHT_Y_AXIS, false);
    }
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.mDrivetrain.setDifferetialDrive(0,0, Robot.isArcadeDrive);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
