package com.stuypulse.frc2017.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.stuy.robot.RobotMap;
import edu.stuy.robot.commands.DrivetrainControlCommand;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;

public class Drivetrain extends Subsystem{
  private CANTalon frontLeftWheel;
  private CANTalon frontRightWheel;
  private CANTalon backLeftWheel;
  private CANTalon backRightWheel;
    
  public Drivetrain(){
    frontLeftWheel = new CANTalon(RobotMap.FRONT_LEFT_MOTOR_PORT);
    frontRightWheel = new CANTalon(RobotMap.FRONT_RIGHT_MOTOR_PORT);
    backLeftWheel = new CANTalon(RobotMap.BACK_LEFT_MOTOR_PORT);
    backRightWheel = new CANTalon(RobotMap.BACK_RIGHT_MOTOR_PORT);
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void tankDrive(double left, double right){
    frontLeftWheel.set(left);
    backLeftWheel.set(left);
    frontRightWheel.set(right);
    backRightWheel.set(right);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DrivetrainTankDriveCommand());
  }
}
