// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.GenericHID;

//Importing Commands
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ConveyorBeltCommandForward;
import frc.robot.commands.ConveyorBeltCommandStop;
import frc.robot.commands.IntakeCommand;




public class OI {

    public XboxController driver = new XboxController(0);
    
    public XboxController operator = new XboxController(1);

    //Driver Controls
    public JoystickButton driverAButton;
    public JoystickButton driverBButton;
    public JoystickButton driverXButton;
    public JoystickButton driverYButton;

    public JoystickButton driverLeftTrigger;
    public JoystickButton driverRightTrigger;

    //Operator Controls
    public JoystickButton operatorAButton;
    public JoystickButton operatorBButton;
    public JoystickButton operatorXButton;
    public JoystickButton operatorYButton;

  /** Creates a new OI. */
  public OI() {
    

    //Need edit: 1
    driverAButton = new JoystickButton(driver, 1);
    driverBButton = new JoystickButton(driver, 2);
    driverXButton = new JoystickButton(driver, 3);
    driverYButton = new JoystickButton(driver, 4);

    driverLeftTrigger = new JoystickButton(driver, 5);
    driverRightTrigger = new JoystickButton(driver, 6);

    operatorAButton = new JoystickButton(operator, 1);
    operatorBButton = new JoystickButton(operator, 2);
    operatorXButton = new JoystickButton(operator, 3);
    operatorYButton = new JoystickButton(operator, 4);
    
    
    
    // driverBButton.whileHeld(new ConveyorBeltCommandForward());
    // driverXButton.whileHeld(new ConveyorBeltCommandStop());
    //driverAButton.whileHeld(new IntakeCommand());


 
    //operatorAButton.whileHeld(new ConveyorBeltCommand());

  }


  // method that takes speed to go forwards or backwards from bumpers of controller depending on how hard driver presses
  public double getSpeed() {
    if (Math.abs(driver.getLeftTriggerAxis() - driver.getRightTriggerAxis()) > 0.15){
      return driver.getLeftTriggerAxis() - driver.getRightTriggerAxis();}
    else
      return 0.0;

    
  }

  // method that allows for joystick control to determine turns to left/right
  public double getTurn() {
    if (driver.getRawAxis(0) > 0.15) {
      return driver.getRawAxis(0);}
    else
      return 0.0;
    
  }

  //method that takes speed for conveyor belt from second controller triggers
}
