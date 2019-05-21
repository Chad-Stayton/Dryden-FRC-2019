package frc.robot.subsystems;

import java.util.Timer;
import java.util.TimerTask;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.HatchPanelDown;
import frc.robot.commands.HatchPanelUp;

public class DiskControl extends Subsystem {

    private Spark diskPiece;

    public DiskControl() {

        diskPiece = new Spark(RobotMap.DISC_PIECE);

    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(null);
    }

    public void setPowerOfDiskPiece(double power) {
        diskPiece.set(power);
    }

}