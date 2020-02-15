/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class WinchMoveCommand extends Command {
  /**
   * Creates a new WinchMoveCommand.
   */
  public WinchMoveCommand(double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    double m_speed = speed;
    requires(Robot.climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double operatorWinchButton = Robot.m_RobotContainer.getDriverButton(Constants.OPERATOR_WINCH_BUTTON_Y);

    Robot.climber.setWinchMotor(1.0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end() {
    Robot.climber.setWinchMotor(0.0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
