/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.CargoManipulation;

public class CargoControl extends Subsystem {
  private Spark cargoPiece;

  public CargoControl() {
    cargoPiece = new Spark(RobotMap.CARGO_PIECE);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new CargoManipulation());
  }

  public void setCargoPiecePower(boolean forward, boolean toFire){
//if (toFire) {
cargoPiece.setSpeed(toFire ? (forward ? 5 : -5) : 0);
//} else {
 // cargoPiece.setSpeed(0);
//}

  }
}
