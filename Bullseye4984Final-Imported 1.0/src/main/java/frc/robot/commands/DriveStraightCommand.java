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
import frc.robot.subsystems.DriveTrain;;

public class DriveStraightCommand extends Command {
  public DriveStraightCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);  
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Driving Straight");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double x = Robot.m_oi.getDriver().getRawAxis(RobotMap.DRIVER_CONTROLLER_LEFT_STICK_Y);
    Robot.driveTrain.tankDrive(x, x);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
   
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
