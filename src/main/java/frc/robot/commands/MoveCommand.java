package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;

public class MoveCommand extends CommandBase{

    private MotorSubsystem m_subsystem;

    /**
     * A command that takes in a value given by a joystick axis and sets motors within 
     * MotorMethodCommand to the value of the joysticks x- or y-axis value
     *
     * @param subsystem The subsystem used by this command.
     */
    public MoveCommand(MotorSubsystem subsystem, DoubleSupplier speedSup) {
      this.m_subsystem = subsystem;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(subsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }    
}