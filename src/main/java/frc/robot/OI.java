// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import frc.robot.commands.ConveyorBeltCommand;
import edu.wpi.first.wpilibj.GenericHID;


public class OI {
  public XboxController driver;
  public JoystickButton AButton;
  public JoystickButton BButton;
  public JoystickButton XButton;

  /** Creates a new OI. */
  public OI() {
    driver = new XboxController(0);

    //eed edit: 1
    AButton = new JoystickButton(driver, 1);


    AButton.whenPressed(new ConveyorBeltCommand());
  }


  // method that takes speed to go forwards or backwards from bumpers of controller depending on how hard driver presses
  public double getSpeed() {
    return driver.getLeftTriggerAxis() - driver.getRightTriggerAxis();
  }

  // method that allows for joystick control to determine turns to left/right
  public double getTurn() {
    return driver.getRawAxis(0);
  }

  //method that takes speed for conveyor belt from second controller triggers
}
